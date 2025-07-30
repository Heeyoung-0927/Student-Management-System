**Development Tools Used**

This Student Management System is a Spring Boot 3.5 web application providing CRUD (Create, Read, Update, and Delete) operations on student records through MVC (Model-View-Controller), using Spring Data JPA (Java Persistence API) with MySQL for persistence and Thymeleaf templates with Bootstrap for a responsive UI. Hibernate's feature automatically synchronizes the database schema with the JPA entity initially, eliminating manual DDL management during development. Configuration is streamlined through application.properties, and the application runs locally on Java 17 and Maven, accessible at http://localhost:8080/students.

**About the Project**

The application provides a web interface for listing, creating, updating, and deleting student entries in a students table. It follows Spring Boot’s convention-over-configuration philosophy, starting from a single @SpringBootApplication class that bootstraps the embedded Tomcat server. All HTTP routes are exposed by a StudentController handling paths under /students.

**Architecture**

- Controllers manage request mappings and populate the MVC Model with student data.
- Services encapsulate application logic in a StudentService interface, and its StudentServiceImpl class implementation defines the methods.
- StudentRepository extends JpaRepository<Student, Long> to use Spring Data’s general CRUD methods

**Data Persistence**

Spring Data JPA manages the Student entity, annotated with @Entity and standard JPA mappings for id, firstName, lastName, and email fields. Hibernate’s spring.jpa.hibernate.ddl-auto=update setting in application.properties instructs the framework to automatically update tables based on entity definitions at application startup. This removes the need for manually restarting the IDE (spring-tools-for-eclipse-4.31.0) every time edithing something.

**User Interface**

The UI leverages Thymeleaf’s natural templating to bind server-side model attributes to form fields and tables. Bootstrap 4 provides a responsive design, showing student list, creation, and update forms clearly on the screen.
- students.html lists all students with update and delete actions.
- create_student.html and update_student.html for handling record creation and modification.

**Running Locally**

Prerequisites
- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- MySQL server

**Future Enhancements**

- Make website domain to publish this web application on the internet, running permanently
- Add a cool favicon with an appropriate image
- Secure endpoints with Spring Security for role-based access control
- Implements unit tests with src/test/java files
