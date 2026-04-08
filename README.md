# 🔐 Authentication & Authorization using Spring Boot + JWT

## 📌 Project Overview

This project implements a secure backend system using **Spring Boot**, **Spring Security**, and **JWT (JSON Web Token)** for authentication and authorization.

It allows users to:

* Register (Sign Up)
* Login (Authenticate)
* Receive a JWT token
* Access protected APIs using the token

This project is part of a Java Developer Internship task focused on building **production-ready secure APIs**.

---

## 🚀 Features

* 🔑 User Registration (Signup)
* 🔐 User Authentication (Login)
* 🪪 JWT Token Generation
* 🔒 Secured REST APIs
* 🔑 Password Encryption using BCrypt
* 🚫 Unauthorized access restriction

---

## 🛠️ Technologies Used

* Java 17+
* Spring Boot
* Spring Security
* JWT (io.jsonwebtoken)
* MySQL
* Maven
* Postman (for API testing)

---

## ⚙️ Project Setup

### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/your-repo.git
cd your-repo
```

---

### 2️⃣ Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/jwt_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3️⃣ Create Database

```sql
CREATE DATABASE jwt_db;
```

---

### 4️⃣ Run the Application

Run the main class:

```java
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

---

## 🧪 API Endpoints

### 🔹 Register User

**POST** `/auth/register`

```json
{
  "username": "user1",
  "password": "1234"
}
```

---

### 🔹 Login User

**POST** `/auth/login`

Response:

```
JWT_TOKEN
```

---

### 🔹 Access Protected API

**GET** `/students`

Headers:

```
Authorization: Bearer <JWT_TOKEN>
```

---

## 🔐 Security Flow

1. User registers with username & password
2. Password is encrypted using BCrypt
3. User logs in → credentials are verified
4. Server generates JWT token
5. Client sends token in Authorization header
6. Protected APIs validate the token before access

---

## ⚠️ Important Notes

* JWT is stateless (no session stored)
* Token expires after a fixed time
* Always pass token as:

```
Authorization: Bearer <token>
```

---

## 📸 Testing

* Use Postman to test APIs
* Test cases:

  * Register user
  * Login and get token
  * Access API with token
  * Try without token (should fail)

---

## 📦 Deliverables Completed

✔ Secure Spring Boot project
✔ Login & Register APIs
✔ JWT implementation
✔ Protected endpoints
✔ API testing

---

## 📚 Learning Outcome

* Understanding of Authentication vs Authorization
* Implementation of JWT-based security
* Building secure REST APIs
* Real-world backend development practices

---

## 👨‍💻 Author

Tanishq
(Java Developer Intern)

---
