**Development Tools Used**

This Student Management System is a Spring Boot 3.5 web application providing CRUD (Create, Read, Update, and Delete) operations on student records through MVC (Model-View-Controller), using Spring Data JPA (Java Persistence API) with MySQL for persistence and Thymeleaf templates with Bootstrap for a responsive UI. Hibernate's feature automatically synchronizes the database schema with the JPA entity initially, eliminating manual DDL management during development. Configuration is streamlined through application.properties, and the application runs locally on Java 17 and Maven, accessible at http://localhost:8080/students.

**About the Project**

The application provides a web interface for listing, creating, updating, and deleting student entries in a students table. It follows Spring Boot’s convention-over-configuration philosophy, starting from a single @SpringBootApplication class that bootstraps the embedded Tomcat server. All HTTP routes are exposed by a StudentController handling paths under /students.

**Architecture**

- Controllers manage request mappings and populate the MVC Model with student data.
- Services encapsulate application logic in a StudentService interface, and its StudentServiceImpl class implementation defines the methods.
- StudentRepository extends JpaRepository<Student, Long> to use Spring Data’s general CRUD methods

**
