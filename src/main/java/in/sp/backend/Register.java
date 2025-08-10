package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/regForm")
public class Register extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		String myname = req.getParameter("name1");
		String myemail=req.getParameter("email1");
		String mypass=req.getParameter("pass1");
		String mygender=req.getParameter("gender1");
		String myCity=req.getParameter("city1");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/yt_demo","root","Yogesh@123");
            
			PreparedStatement ps = con.prepareStatement(
				    "INSERT INTO register (name, email, password, gender, city) VALUES (?, ?, ?, ?, ?)"
				);

			ps.setString(1, myname);
			
			
            ps.setString(2, myemail);
			
            ps.setString(3, mypass);
            
			ps.setString(4, mygender);
        
			
			ps.setString(5, myCity);
			
			int count=ps.executeUpdate();
			
			if(count>0) {
				resp.setContentType("text/html");
				out.println("<h3 style='color:green'>User regiatered Successfully</h3>");
				RequestDispatcher rd =req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
			}else {
				resp.setContentType("text/html");
				out.println("<h3 style='color:red'>User not regiatered Successfully due to some error </h3>");
				RequestDispatcher rd =req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
				
			}
			
		
		}catch(Exception e){
			e.printStackTrace();
			resp.setContentType("text/html");
			out.println("<h3 style='color:red'>User not regiatered Successfully due to some error </h3>");
			RequestDispatcher rd =req.getRequestDispatcher("/register.jsp");
			rd.include(req, resp);
		}
		
	}

}
