# ReliaQuest's Entry-Level Java Challenge

My initial, secure REST API to allow access and updates to employee information. It consists of 3 endpoints, 
listed in the following section. 

Thank you!

## Implemented endpoints (API module)

getAllEmployees()

    output - list of all employees
    description - returns all employees, unfiltered

getEmployeeByUuid(...)

    path variable - employee UUID
    output - employee
    description - returns a single employee based on the provided employee UUID

createEmployee(...)

    request body - attributes necessary to create an employee
    output - employee
    description - returns a single employee, if created, otherwise error

## API Usage Examples

getAllEmployees()

example usage

    curl -X GET http://localhost:8080/api/v1/employee
example response

    [{
      "uuid": "84d0adaa-2951-4a95-81f2-605f61bc502a",
      "firstName":"John",
      "lastName":"Doe",
      "fullName":"John Doe",
      "salary":80000,
      "age":20,
      "jobTitle":"Software Engineer Intern",
      "email":"john.doe@example.com",
      "contractHireDate":"2026-02-09T06:28:47.534859Z",
      "contractTerminationDate":null
    },
    {
      "uuid":"1b9a85dc-5494-41eb-929f-2d303acfad6f",
      "firstName":"Jane",
      "lastName":"Smith",
      "fullName":"Jane Smith",
      "salary":100000,
      "age":30,
      "jobTitle":"Software Engineer",
      "email":"jane.smith@example.com",
      "contractHireDate":"2026-02-09T06:28:47.535018Z",
      "contractTerminationDate":null
    },
    {
      "uuid":"f156cb81-20d4-4018-a902-8cdfee47891b",
      "firstName":"Jeslyn",
      "lastName":"Yang",
      "fullName":"Jeslyn Yang",
      "salary":90000,
      "age":22,
      "jobTitle":"Associate Software Engineer",
      "email":"jeslynyang1121@gmail.com",
      "contractHireDate":"2026-02-09T06:28:47.535052Z",
      "contractTerminationDate":null
    }]

getEmployeeByUuid(...)

example usage

    curl -X GET http://localhost:8080/api/v1/employee/f156cb81-20d4-4018-a902-8cdfee47891b
example response
    
    {
      "uuid":"f156cb81-20d4-4018-a902-8cdfee47891b",
      "firstName":"Jeslyn",
      "lastName":"Yang",
      "fullName":"Jeslyn Yang",
      "salary":90000,
      "age":22,
      "jobTitle":"Associate Software Engineer",
      "email":"jeslynyang1121@gmail.com",
      "contractHireDate":"2026-02-09T06:28:47.535052Z",
      "contractTerminationDate":null
    }

createEmployee(...)

example usage

    curl -X POST http://localhost:8080/api/v1/employee \
    -H "Content-Type: application/json" \
    -d '{
    "firstName": "Bad",
    "lastName": "Worker",
    "salary": 130000,
    "age": 27,
    "jobTitle": "Senior Software Engineer",
    "email": "bad.worker@example.com",
    "contractHireDate": "2025-02-07T12:00:00Z"
    "contractTerminationDate": "2025-02-07T12:00:00Z"
    }'
example response

    {
      "uuid":"6279fb9a-0e8d-491d-8ed7-f108c1f52db0",
      "firstName":"Bad",
      "lastName":"Worker",
      "fullName":"Bad Worker",
      "salary":130000,
      "age":27,
      "jobTitle":"Senior Software Engineer",
      "email":"bad.worker@example.com",
      "contractHireDate":"2025-02-07T12:00:00Z",
      "contractTerminationDate":"2025-02-07T12:00:00Z"
    }

## Code Formatting

To format code according to style guidelines, you can run **spotlessApply** task.
`./gradlew spotlessApply`

The spotless plugin will also execute check-and-validation tasks as part of the Gradle **build** task.
`./gradlew build`
