# Spring Boot Course Management System

This is a Spring Boot project that manages courses, teachers, students, and course materials. It demonstrates the use of JPA for defining entity relationships and uses repositories for CRUD operations. 

## Features

- Manage **courses**, **teachers**, **students**, and **course materials** with JPA entities.
- Relationships include:
  - `@OneToOne`: Between `CourseEntity` and `CourseMaterialEntity`.
  - `@ManyToOne`: Between `CourseEntity` and `TeacherEntity`.
  - `@ManyToMany`: Between `CourseEntity` and `StudentEntity`.
- Cascade operations are used to manage related entities easily.
- Test cases provided for CRUD operations on entities like Courses, Teachers, and Course Materials.

## Entities

### 1. **CourseEntity**
   - Fields: `courseId`, `title`, `credit`
   - Relationships:
     - `@OneToOne` with `CourseMaterialEntity`
     - `@ManyToOne` with `TeacherEntity`
     - `@ManyToMany` with `StudentEntity`

### 2. **TeacherEntity**
   - Fields: `teacherId`, `teacherFirstName`, `teacherLastName`
   - Relationships: 
     - `@OneToMany` with `CourseEntity`

### 3. **CourseMaterialEntity**
   - Fields: `courseMaterialId`, `url`
   - Relationships:
     - `@OneToOne` with `CourseEntity`

### 4. **StudentEntity**
   - Fields: `std_id`, `firstName`, `last_name`, `email`, `gaurdian`
   - Embeddable `Gaurdian` class with fields `name`, `email`, `mobile`.

## Repository Tests

- `TeacherEntityRepositoryTest`: Tests for saving and retrieving teachers and their associated courses.
- `CourseMaterialRepositoryTest`: Tests for saving and retrieving course materials with associated courses.
- `CourseRepositoryTest`: Tests for saving courses with teachers and students.

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- MySQL or any relational database
- Spring Boot (version used: 2.7.x or higher)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/shivani-7024/Relationship
   ```

2. Navigate to the project directory:
   ```bash
   cd course-management-system
   ```

3. Install dependencies:
   ```bash
   mvn clean install
   ```

4. Set up MySQL or other databases and update `application.properties` for your database connection.

5. Run the application:
   ```bash
   mvn spring-boot:run
   ```

### Testing

Run the provided tests using:
```bash
mvn test
```

The test cases demonstrate saving and fetching entities such as `TeacherEntity`, `CourseEntity`, and `CourseMaterialEntity`, ensuring that relationships work as expected.

---

This **README** file provides a brief overview of your project structure, features, and usage. Adjust the database or any other configurations according to your setup.
