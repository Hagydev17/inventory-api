# Inventory API

A RESTful API for inventory management built with Java and Spring Boot. This project demonstrates best practices for backend development using a layered architecture, Spring Data JPA, and OpenAPI documentation.

> **Project Status:** ✅ Completed — Continuous Improvements

## Features

* RESTful CRUD operations for products
* Layered architecture (Controller, Service, Repository)
* DTO pattern with Request/Response objects
* Entity/DTO mapping with a dedicated Mapper layer
* Input validation with Jakarta Bean Validation
* Custom exception handling
* `ResponseEntity` for HTTP responses
* Spring Data JPA with Hibernate
* OpenAPI / Swagger documentation
* Lombok for boilerplate reduction

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* H2 Database
* Jakarta Bean Validation
* Lombok
* Maven
* OpenAPI (Swagger)

## Project Structure

```text
inventory-api
├── src/main/java
│   └── com/hagydev/inventory_api
│       ├── config
│       ├── controller
│       ├── dto
│       ├── entity
│       ├── exception
│       ├── mapper
│       ├── repository
│       └── service
│
├── src/main/resources
│   └── application.yml
│
├── pom.xml
└── README.md
```

## Database

The project currently uses H2 as an in-memory database for development and testing.

PostgreSQL integration is planned for a future iteration.

## API Documentation

Once the application is running, Swagger UI is available at:

[Swagger UI](http://localhost:8081/swagger-ui/index.html)

The OpenAPI specification is available at:

[OpenAPI Specification](http://localhost:8081/v3/api-docs)

## Getting Started

### Clone the repository

```bash
git clone https://github.com/Hagydev17/inventory-api.git
```

### Run the project

```bash
mvn spring-boot:run
```

Or run the application directly from your IDE.

## Roadmap

The following features are planned:

* Unit testing with JUnit and Mockito
* Integration testing
* PostgreSQL integration
* Environment-based configuration
* Docker and Docker Compose
* Spring Security and JWT authentication
* CI/CD pipeline
* Deployment

## Author

**Hagy Hernández**

GitHub: [Hagydev17](https://github.com/Hagydev17)
