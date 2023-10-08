<h1 align="center"> Student Entity Data Mapper Project </h1>
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-4.0-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.1.4-brightgreen.svg" />
</a>
<a href="License url" >
    <img alt="BSD Clause 3" src="https://img.shields.io/badge/License-BSD_3--Clause-blue.svg"/>
</a>
</p>

---

<p align="left">

## Overview

This project, the "Student Entity Data Mapper Project," is a Spring Boot application that demonstrates mapping and CRUD operations for student and related entities, including Address, Course, Book, Laptop, and Apply (DTO). It provides a set of RESTful API endpoints for managing student records and their associations with these entities. This project serves as a foundation for maintaining student data and related information.

## Technologies Used

- **Framework:** Spring Boot
- **Language:** Java
- **Build Tool:** Maven

## Dependencies

The Student Entity Data Mapper Project uses the following dependencies:

- **Spring Boot Starter Data JPA**
  - **Description:** Provides support for JPA (Java Persistence API) and simplifies database access using Spring Data repositories.
  - **Maven Dependency:**
    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    ```

- **Spring Boot Starter Web**
  - **Description:** Provides support for building web applications, including RESTful APIs.
  - **Maven Dependency:**
    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    ```

- **MySQL Connector/J (Runtime Dependency)**
  - **Description:** The MySQL JDBC driver for connecting to MySQL databases.
  - **Maven Dependency:**
    ```xml
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
    ```

- **Project Lombok (Optional)**
  - **Description:** A library that simplifies Java code by reducing boilerplate code, such as getters and setters.
  - **Maven Dependency:**
    ```xml
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    ```

- **Spring Boot Starter Test (For Testing)**
  - **Description:** Provides support for testing Spring Boot applications.
  - **Maven Dependency (Test Scope):**
    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    ```

- **Springdoc OpenAPI (Swagger UI)**
  - **Description:** Adds Swagger UI for documenting and testing your API endpoints.
  - **Maven Dependency:**
    ```xml
    <dependency>
        <groupId>org.springdoc</groupId>
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
        <version>2.1.0</version>
    </dependency>
    ```

- **Spring Boot Starter Validation**
  - **Description:** Includes validation support for request data binding and response data rendering.
  - **Maven Dependency:**
    ```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
    ```

## Data Flow


### Student Entity

- **Controller Layer**

  The `StudentController` handles HTTP requests related to students and routes them to the `StudentService`.

  ```java
  // StudentController.java

  @RestController
  @RequestMapping("/students")
  public class StudentController {
      // Define student-related endpoints and methods
  }
  ```

- **Service Layer**

  The `StudentService` contains business logic and interacts with the `StudentRepository` to perform CRUD operations on student data.

  ```java
  // StudentService.java

  @Service
  public class StudentService {
      // Implement student-related service methods
  }
  ```

- **Repository Layer**

  The `StudentRepository` manages data access to the student entity using Spring Data JPA.

  ```java
  // StudentRepository.java

  @Repository
  public interface StudentRepository extends JpaRepository<Student, Long> {
      // Define custom queries or repository methods if needed
  }
  ```

- **Student Entity**

  The `Student` entity represents the structure of student data in the database.

  ```java
  // Student.java (Student Entity)

  @Entity
  public class Student {
      // Define student attributes, getters, setters, etc.
  }
  ```

  Certainly! Here's the continuation of the data flow section including information for the `Course Entity`, `Book Entity`, `Laptop Entity`, and `Apply (DTO) Class`:

#### Course Entity

- **Controller Layer**

  The `CourseController` handles HTTP requests related to courses and routes them to the `CourseService`.

  ```java
  // CourseController.java

  @RestController
  @RequestMapping("/courses")
  public class CourseController {
      // Define course-related endpoints and methods
  }
  ```

- **Service Layer**

  The `CourseService` contains business logic and interacts with the `CourseRepository` to perform CRUD operations on course data.

  ```java
  // CourseService.java

  @Service
  public class CourseService {
      // Implement course-related service methods
  }
  ```

- **Repository Layer**

  The `CourseRepository` manages data access to the course entity using Spring Data JPA.

  ```java
  // CourseRepository.java

  @Repository
  public interface CourseRepository extends JpaRepository<Course, String> {
      // Define custom queries or repository methods if needed
  }
  ```

- **Course Entity**

  The `Course` entity represents the structure of course data in the database.

  ```java
  // Course.java (Course Entity)

  @Entity
  public class Course {
      // Define course attributes, getters, setters, etc.
  }
  ```

#### Book Entity

- **Controller Layer**

  The `BookController` handles HTTP requests related to books and routes them to the `BookService`.

  ```java
  // BookController.java

  @RestController
  @RequestMapping("/books")
  public class BookController {
      // Define book-related endpoints and methods
  }
  ```

- **Service Layer**

  The `BookService` contains business logic and interacts with the `BookRepository` to perform CRUD operations on book data.

  ```java
  // BookService.java

  @Service
  public class BookService {
      // Implement book-related service methods
  }
  ```

- **Repository Layer**

  The `BookRepository` manages data access to the book entity using Spring Data JPA.

  ```java
  // BookRepository.java

  @Repository
  public interface BookRepository extends JpaRepository<Book, String> {
      // Define custom queries or repository methods if needed
  }
  ```

- **Book Entity**

  The `Book` entity represents the structure of book data in the database.

  ```java
  // Book.java (Book Entity)

  @Entity
  public class Book {
      // Define book attributes, getters, setters, etc.
  }
  ```

#### Laptop Entity

- **Controller Layer**

  The `LaptopController` handles HTTP requests related to laptops and routes them to the `LaptopService`.

  ```java
  // LaptopController.java

  @RestController
  @RequestMapping("/laptops")
  public class LaptopController {
      // Define laptop-related endpoints and methods
  }
  ```

- **Service Layer**

  The `LaptopService` contains business logic and interacts with the `LaptopRepository` to perform CRUD operations on laptop data.

  ```java
  // LaptopService.java

  @Service
  public class LaptopService {
      // Implement laptop-related service methods
  }
  ```

- **Repository Layer**

  The `LaptopRepository` manages data access to the laptop entity using Spring Data JPA.

  ```java
  // LaptopRepository.java

  @Repository
  public interface LaptopRepository extends JpaRepository<Laptop, String> {
      // Define custom queries or repository methods if needed
  }
  ```

- **Laptop Entity**

  The `Laptop` entity represents the structure of laptop data in the database.

  ```java
  // Laptop.java (Laptop Entity)

  @Entity
  public class Laptop {
      // Define laptop attributes, getters, setters, etc.
  }
  ```

#### Apply (DTO) Class

- **Controller Layer**

  The `ApplyController` handles HTTP requests related to Apply (DTO) and routes them to the `StudentService` for enrollment.

  ```java
  // ApplyController.java

  @RestController
  @RequestMapping("/apply")
  public class ApplyController {
      // Define apply-related endpoints and methods
  }
  ```

- **Student Service Layer**

  The `StudentService` processes enrollment requests and interacts with the `CourseService` for enrollment in a specific course.

  ```java
  // StudentService.java

  @Service
  public class StudentService {
      // Implement enrollment-related service methods
  }
  ```

- **Apply (DTO) Class**

  The `Apply` class represents the Apply (DTO) data structure for enrollment requests.

  ```java
  // Apply.java (Apply (DTO) Class)

  public class Apply {
      // Define apply attributes, getters, setters, etc.
  }
  ```
## Database Design

The project's database design includes tables for students and related entities, each with specific fields. This design ensures data integrity and organized storage.

#### Student Table

| Column Name | Data Type   | Description                           |
| ----------- | ----------- | ------------------------------------- |
| id          | BIGINT (Primary Key) | Unique identifier for each student  |
| student_name| VARCHAR(255) | Name of the student                   |
| student_age | INTEGER     | Age of the student                    |


## Address Table

| Column Name   | Data Type        | Description                        |
| ------------- | ---------------- | ---------------------------------- |
| id            | BIGINT (Primary Key) | Unique identifier for each address |
| street        | VARCHAR(255)     | Street address of the address      |
| city          | VARCHAR(255)     | City where the address is located |
| state         | VARCHAR(255)     | State or region of the address    |
| zipcode       | VARCHAR(20)      | Postal code or ZIP code of the address |
| student_id    | BIGINT (Foreign Key) | Student ID associated with the address |

## Course Table

| Column Name   | Data Type        | Description                        |
| ------------- | ---------------- | ---------------------------------- |
| id            | BIGINT (Primary Key) | Unique identifier for each course  |
| course_name   | VARCHAR(255)     | Name of the course                 |
| student_id    | BIGINT (Foreign Key) | Student ID associated with the course |

## Book Table

| Column Name   | Data Type        | Description                        |
| ------------- | ---------------- | ---------------------------------- |
| id            | BIGINT (Primary Key) | Unique identifier for each book    |
| book_name     | VARCHAR(255)     | Name of the book                   |
| student_id    | BIGINT (Foreign Key) | Student ID associated with the book |

## Laptop Table

| Column Name   | Data Type        | Description                        |
| ------------- | ---------------- | ---------------------------------- |
| id            | BIGINT (Primary Key) | Unique identifier for each laptop  |
| laptop_name   | VARCHAR(255)     | Name of the laptop                 |
| student_id    | BIGINT (Foreign Key) | Student ID associated with the laptop |

## Apply Table

| Column Name   | Data Type        | Description                        |
| ------------- | ---------------- | ---------------------------------- |
| id            | BIGINT (Primary Key) | Unique identifier for each application |
| student_id    | BIGINT (Foreign Key) | Student ID associated with the application |
| course_id     | BIGINT (Foreign Key) | Course ID associated with the application |
| book_id       | BIGINT (Foreign Key) | Book ID associated with the application |
| laptop_id     | BIGINT (Foreign Key) | Laptop ID associated with the application |



## Data Structures

### Student Class

The `Student` class defines the structure for student data and includes fields such as `id`, `student_name`, and `student_age`.

```java
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String student_name;
    private Integer student_age;

    // Define relationships with Address, Course, Book, Laptop, and Apply (DTO)
}
```

### Address Class

The `Address` class defines the structure for address data and includes fields such as `id`, `street`, `city`, `state`, `zipcode`, and a reference to the associated `Student`.

```java
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String city;
    private String state;
    private String zipcode;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;
}
```

### Course Class

The `Course` class defines the structure for course data and includes fields such as `id` and `course_name`, along with a reference to the associated `Student`.

```java
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String course_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;
}
```

### Book Class

The `Book` class defines the structure for book data and includes fields such as `id` and `book_name`, along with a reference to the associated `Student`.

```java
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String book_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;
}
```

### Laptop Class

The `Laptop` class defines the structure for laptop data and includes fields such as `id` and `laptop_name`, along with a reference to the associated `Student`.

```java
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String laptop_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;
}
```

### Apply (DTO) Class

The `Apply` class represents a Data Transfer Object (DTO) for applying students to courses, books, and laptops. It includes fields such as `id`, `student_id`, `course_id`, `book_id`, and `laptop_id`.

```java
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apply {
    private Long id;
    private Long student_id;
    private Long course_id;
    private Long book_id;
    private Long laptop_id;
}
```

## Database Configuration

The project is configured to connect to a MySQL database. Update the `application.properties` file with your database configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/YourDatabaseName
spring.datasource.username=YourDatabaseUsername
spring.datasource.password=YourDatabasePassword
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true
```

Make sure your MySQL database is running, and the credentials match those provided in the configuration.

## Usage

1. Start your Spring Boot application.
2. Access the API endpoints to create, retrieve, update, and delete student records and related entities.

## License

This project is licensed under the [BSD 3-Clause License](LICENSE).

## Contact

For questions or feedback, please contact [Amit Ashok Swain](mailto:business.amitswain@gmail.com).

---
