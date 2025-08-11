Got it — your ServletPage project is essentially a Java Servlet + JSP web app that handles "user registration" and "login" using a MySQL database.
# ServletPage

A simple Java Servlet and JSP-based web application that demonstrates **user registration** and **login** functionality with MySQL database integration.

## 📌 Features
- User Registration with:
  - Name
  - Email
  - Password
  - Gender
  - City
- User Login with session handling
- Profile page display after successful login
- MySQL database connectivity using JDBC
- Basic JSP forms for frontend

## 🛠 Tech Stack
- **Java** (Servlets, JSP)
- **Jakarta Servlet API**
- **MySQL** (JDBC)
- **Tomcat** (or any compatible servlet container)
- **HTML Forms** for UI

## 📂 Project Structure
```

ServletPage/
├── src/
│   └── in/sp/backend/
│       ├── Login.java
│       └── Register.java
├── webapp/
│   ├── Login.jsp
│   ├── register.jsp
│   └── Profile.jsp
├── WEB-INF/
│   └── web.xml (if applicable)
└── README.md

````

## ⚙️ Prerequisites
- **Java 17** or above
- **Apache Tomcat 10+** (or compatible server)
- **MySQL 8+**
- **Maven/IDE** (Eclipse)

## 💾 Database Setup
1. Create MySQL database:
```sql
CREATE DATABASE yt_demo;
````

2. Create `register` table:

```sql
CREATE TABLE register (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100),
    gender VARCHAR(10),
    city VARCHAR(50)
);
```

3. Update database credentials in:

```java
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/yt_demo", "root", "*********3"
);
```

## 🚀 How to Run

1. Clone the repository:

```bash
git clone https://github.com/lakmapuryogesh/ServletPage.git
```

2. Import into Eclipse/IntelliJ as a **Dynamic Web Project** or Maven project.
3. Configure **Tomcat Server** in your IDE.
4. Deploy the project to Tomcat.
5. Access in browser:

   * Registration: `http://localhost:8080/ServletPage/register.jsp`
   * Login: `http://localhost:8080/ServletPage/Login.jsp`

## 📷 Screenshots
<img width="951" height="523" alt="image" src="https://github.com/user-attachments/assets/c5bd360e-2e26-41f0-918b-4b6e52e4bc52" />


*(Optional: Add form and profile page screenshots)*

## 🛡 License

This project is open source under the MIT License.

```

---

If you want, I can also **add installation screenshots and usage flow diagrams** to make your README more attractive and professional. That way, people visiting your GitHub will see it as a complete, ready-to-use Java Servlet project.
```
