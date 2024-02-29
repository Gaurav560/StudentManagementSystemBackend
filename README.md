# StudentManagementSystemBackend

This repository contains the backend code for a Student Management System, designed to facilitate the management of student records. Built with Spring Boot and integrated with PostgreSQL, it supports full CRUD operations.

## Features

- Create, Read, Update, and Delete student records
- Integration with PostgreSQL for data persistence
- RESTful API endpoints

## Getting Started

### Prerequisites

- Java JDK 17 or later
- Maven 3.6 or later
- PostgreSQL

### Setup

1. Clone the repository:

```bash
git clone https://github.com/yourusername/StudentManagementSystemBackend.git
```

2. Navigate to the project directory:

```bash
cd StudentManagementSystemBackend
```

3. Configure PostgreSQL connection in `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/your_database_name
spring.datasource.username=postgres
spring.datasource.password=yourpassword
```

4. Build and run the application:

```bash
mvn spring-boot:run
```

## Usage

The application exposes RESTful endpoints:

- `GET /api/Students` - Retrieve all students
- `POST /api/Student` - Create a new student
- `GET /api/Student/{id}` - Retrieve a student by ID
- `PUT /api/Student/{id}` - Update a student by ID
- `DELETE /api/Student/{id}` - Delete a student by ID

## Contributing

Contributions are welcome! Please feel free to submit a pull request.

## License

This project is licensed under the TELUSKO License - see the [LICENSE](LICENSE) file for details.
