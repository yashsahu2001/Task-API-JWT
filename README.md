# Task Management API with JWT Authentication

This is a secure Task Management REST API built using **Spring Boot**. It includes user registration, login, JWT-based authentication, and protected task management operations. The API is structured using best practices for modular code organization and security.

---

## 🔐 Features

- User registration and login with hashed passwords
- JWT token generation and validation
- Protected task CRUD operations
- Role-based authentication (customizable)
- Spring Security integration
- MySQL database connection

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Security
- Spring Data JPA
- JWT (jjwt)
- MySQL
- Maven
- Lombok

---

## 📁 Project Structure

src/
└── main/
├── java/com/example/taskapi/
│ ├── controller/
│ │ ├── AuthController.java
│ │ └── TaskController.java
│ ├── dto/
│ │ ├── AuthRequest.java
│ │ └── AuthResponse.java
│ ├── entity/
│ │ ├── User.java
│ │ └── Task.java
│ ├── repository/
│ │ ├── UserRepository.java
│ │ └── TaskRepository.java
│ ├── security/
│ │ ├── JwtUtil.java
│ │ ├── JwtFilter.java
│ │ └── SecurityConfig.java
│ ├── service/
│ │ ├── UserService.java
│ │ └── TaskService.java
│ └── TaskApiJwtApplication.java
└── resources/
├── application.properties
└── schema.sql (optional)

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/TaskAPI-JWT.git
cd TaskAPI-JWT

2. Configure MySQL Database
sql
Copy
Edit
CREATE DATABASE taskdb;
Update your application.properties:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=your_mysql_user
spring.datasource.password=your_mysql_password
jwt.secret=YourJWTSecretKey
3. Run the Project
Open the project in Eclipse IDE, and run:

bash
Copy
Edit
./mvnw spring-boot:run
🔐 API Endpoints
🔸 Public Routes
Method	Endpoint	Description
POST	/auth/register	Register new user
POST	/auth/login	Login and get JWT

🔸 Protected Routes (Requires JWT)
Add header:

makefile
Copy
Edit
Authorization: Bearer <your_token>
Method	Endpoint	Description
GET	/tasks	Get all tasks
POST	/tasks	Create a new task

📦 Dependencies
Listed in pom.xml:

spring-boot-starter-web

spring-boot-starter-security

spring-boot-starter-data-jpa

mysql-connector-java

jjwt

lombok

🧪 Testing with Postman
Register a user
POST /auth/register

json
Copy
Edit
{
  "username": "john",
  "password": "password123"
}
Login to get JWT token
POST /auth/login

json
Copy
Edit
{
  "username": "john",
  "password": "password123"
}
Access protected routes with token
Set header:
Authorization: Bearer <your_token>

📚 References
🔗 Baeldung – Spring Security & JWT: https://www.baeldung.com/spring-security-oauth-jwt

🔗 JWT Java Library (jjwt): https://github.com/jwtk/jjwt

🔗 Spring Security Docs: https://docs.spring.io/spring-security/reference/

✍️ Author
Yash Sahu
Feel free to contribute or fork the repository!

📜 License
This project is licensed under the MIT License.
