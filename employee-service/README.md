# Employee Service

This is a simple Spring Boot application for managing employee records. It allows you to create and delete employee records with fields for ID, name, and age.

## Project Structure

```
employee-service
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── employeeservice
│   │   │               ├── EmployeeServiceApplication.java
│   │   │               ├── controller
│   │   │               │   └── EmployeeController.java
│   │   │               ├── model
│   │   │               │   └── Employee.java
│   │   │               ├── repository
│   │   │               │   └── EmployeeRepository.java
│   │   │               └── service
│   │   │                   └── EmployeeService.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── employeeservice
│                       └── EmployeeServiceApplicationTests.java
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Running the Application

1. Clone the repository:
   ```
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```
   cd employee-service
   ```

3. Build the project using Maven:
   ```
   mvn clean install
   ```

4. Run the application:
   ```
   mvn spring-boot:run
   ```

### API Endpoints

- **Create Employee**
  - **POST** `/employees`
  - Request Body: `{ "name": "John Doe", "age": 30 }`

- **Delete Employee**
  - **DELETE** `/employees/{id}`

### License

This project is licensed under the MIT License.