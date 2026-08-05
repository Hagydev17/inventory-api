# Inventory API

A RESTful API for inventory management built with Java and Spring Boot. This project demonstrates best practices for backend development using a layered architecture, Spring Data JPA, and OpenAPI documentation.

> **Project Status:** 🚧 In Development

## Features

* RESTful CRUD operations for products
* Layered architecture (Controller, Service, Repository)
* Spring Data JPA with Hibernate
* Global exception handling
* Custom exceptions
* ResponseEntity for HTTP responses
* OpenAPI / Swagger documentation

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* H2 Database
* Maven
* OpenAPI (Swagger)

## Project Structure

```text
src
└── main
    ├── java
    │   ├── controller
    │   ├── service
    │   ├── repository
    │   ├── entity
    │   ├── exception
    │   └── advice
    └── resources
```

## API Documentation

Once the application is running, Swagger UI is available at:

```
http://localhost:8081/swagger-ui/index.html
```

The OpenAPI specification is available at:

```
http://localhost:8081/v3/api-docs
```

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

* Bean Validation
* DTO pattern
* Model Mapper
* PostgreSQL
* Spring Security
* JWT Authentication
* Unit Testing
* Integration Testing
* Docker
* Docker Compose
* CI/CD
* Deployment

## Author

**Hagy Hernández**

GitHub: https://github.com/Hagydev17
