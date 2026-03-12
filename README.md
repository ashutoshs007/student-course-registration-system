# Student Course Registration System

**Developed by:** Ashutosh Kumar Singh

---

# Project Overview

This project is a **Student Course Registration System** developed using **Spring Boot and Spring Data JPA**.

The system allows users to:

• Create students  
• Create courses  
• Enroll students into courses  
• View courses of a student  
• Unenroll students from courses  

The project exposes **REST APIs** which can be tested using **Postman**.

The application uses an **H2 in-memory database** for storing data.

---

# Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Maven
- H2 Database
- Postman (API Testing)

---

# Project Architecture

The project follows a **Layered Architecture**.


Client (Postman)
↓
Controller Layer
↓
Service Layer
↓
Repository Layer
↓
H2 Database


### Controller Layer
Handles HTTP requests and exposes REST APIs.

### Service Layer
Contains the business logic of the application.

### Repository Layer
Handles database operations using Spring Data JPA.

### Model Layer
Contains the entity classes which represent database tables.

Entities used:


Student
Course
Enrollment


---

# Database

The application uses **H2 In-Memory Database**.

Tables created automatically by Hibernate:


STUDENT
COURSE
ENROLLMENT


The database runs inside the application and resets when the application restarts.

---

# API Endpoints

## 1. Create Student

Creates a new student.

### Request


POST /students


### Request Body

```json
{
"name": "Ashutosh Kumar Singh"
}
Response Example
{
"id": 1,
"name": "Ashutosh Kumar Singh"
}
2. Create Course

Creates a new course.

Request

POST /courses

Request Body
{
"courseName": "Spring Boot"
}
Response Example
{
"id": 1,
"courseName": "Spring Boot"
}
3. Enroll Student

Enrolls a student into a course.

Request

POST /enroll/{studentId}/{courseId}

Example

POST /enroll/1/1

Response

Student enrolled successfully

4. Get Courses of Student

Returns all courses a student is enrolled in.

Request

GET /students/{id}/courses

Example

GET /students/1/courses

Response

[1]

5. Unenroll Student

Removes a student from a course.

Request

DELETE /enroll/{studentId}/{courseId}

Example

DELETE /enroll/1/1

Response

Student unenrolled successfully

Project Structure

StudentCourse
│
├── src
│
├── screenshots
│ ├── postman_create_student.png
│ ├── postman_create_course.png
│ ├── postman_enroll.png
│ ├── postman_get_courses.png
│ └── postman_unenroll.png
│
├── pom.xml
└── README.md

How to Run the Project
Step 1

Clone the repository


git clone <repository-url>

Step 2

Open the project in IntelliJ IDEA

Step 3

Run the application:


StudentcourseApplication.java

Step 4

The server will start at:


http://localhost:8080

Step 5

Test APIs using Postman

API Testing Screenshots
Create Student

Create Course

Enroll Student

Get Courses of Student

Unenroll Student

Future Improvements

Possible improvements for this project:

• Prevent duplicate enrollments
• Add validation for student and course data
• Add authentication and authorization
• Use a persistent database like MySQL or PostgreSQL

Conclusion

This project demonstrates how to build a REST API using Spring Boot and Spring Data JPA.

It shows:

• REST API development
• Database interaction using JPA
• Layered architecture
• API testing using Postman


---

# What Will Happen After Upload

Your GitHub repo will look **very professional**:


student-course-registration
│
├── src
├── screenshots
│ ├── postman_create_student.png
│ ├── postman_create_course.png
│ ├── postman_enroll.png
│ ├── postman_get_courses.png
│ └── postman_unenroll.png
│
├── pom.xml
└── README.md
