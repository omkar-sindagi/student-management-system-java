# 🎓 Student Management System

![Java](https://img.shields.io/badge/Java-Backend-red)
![JDBC](https://img.shields.io/badge/JDBC-Database-blue)
![MySQL](https://img.shields.io/badge/MySQL-Database-orange)

A **console-based Student Management System** developed using **Java, JDBC, and MySQL**. 
This application allows users to manage student records efficiently by performing **CRUD operations (Create, Read, Update, Delete)** through a menu-driven interface.

The project demonstrates practical implementation of **Java database connectivity, object-oriented programming (OOP), and DAO design pattern**.

---

# 🚀Features

- Add Student
- View All Students
- Update Student Information
- Delete Student Record
- Search Student by ID
- Count Total Students
- Input validation for user entries
- Confirmation prompts for delete operations
- Structured console UI for better readability

---

# 🛠 Tech Stack

- **Java**
- **JDBC (Java Database Connectivity)**
- **MySQL**
- **SQL**
- **MySQL Connector/J**
- **Git & GitHub**

---

## Project Architecture

The project follows a **layered structure** separating application logic and database operations.

                                   User (Console Menu)
                                          |
                                          v
                                       Main.java
                                 (Application Controller)
                                          |
                                          v
                                     StudentDAO.java
                                  (Database Operations)
                                          |
                                          v
                                    DBConnection.java
                                  (Database Connection)
                                          |
                                          v
                                    MySQL Database


This separation improves **code organization, maintainability, and scalability**.

---

## 📁 Project Structure

```
StudentManagementSystem
│
├── lib
│   └── mysql-connector-j-9.6.0.jar
│
├── src
│   └── com
│       └── omkar
│           └── StudentManagementSystem
│               ├── DBConnection.java
│               ├── Student.java
│               ├── StudentDAO.java
│               └── Main.java
│
├── README.md
└── .gitignore
```


---

# How the Application Works

|         File          |                            Purpose                                 |
|-----------------------|--------------------------------------------------------------------|
| **Main.java**         | Handles the menu-driven console interface and program flow         |
| **StudentDAO.java**   | Contains database operations like insert, update, delete, search   |
| **DBConnection.java** | Establishes connection between Java application and MySQL database |
| **Student.java**      | Model class representing the student entity                        |


---

## ⚙️ How to Run the Project

1. Install Java (JDK 8 or above)
Check installation:java -version

2. Install MySQL
Make sure MySQL server is running.

3. Create the Database
Run the SQL queries in MySQL Workbench:

```sql
CREATE DATABASE studentdb;

USE studentdb;

CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    age INT,
    grade VARCHAR(10)
);

Update Database Credentials

Edit this file:

DBConnection.java

Update the credentials:

jdbc:mysql://localhost:3306/studentdb
username: your_username
password: your_password

Compile and Run

Run the Main.java file to start the application.


---

`
## 📊 Example Console Output

================================================
WELCOME TO STUDENT MANAGEMENT SYSTEM
================================================
1 Add Student
2 View Students
3 Delete Student
4 Search Student
5 Update Student
6 Total Students
7 Exit

Enter your choice:

---

### Sample Student Table Output

================================================
ID NAME AGE GRADE
================================================
1 Omkar 22 A
2 Rahul 21 B`

---
`
# 📚 Learning Outcomes

**Through this project I learned:**

- How to connect Java with MySQL using JDBC
- Implementing CRUD operations
- Applying Object-Oriented Programming principles
- Understanding DAO (Data Access Object) design pattern
- Designing menu-driven console applications
- Managing projects using Git and GitHub
- Future Improvements

---

# Possible enhancements for the project:

Add GUI using Java Swing or JavaFX
Implement user authentication
Add export to CSV or Excel
Convert into Spring Boot REST API
Integrate with a web frontend

---

## 👨‍💻Developer

**Omkar Sindagi**
GitHub:
https://github.com/omkar-sindagi

---



