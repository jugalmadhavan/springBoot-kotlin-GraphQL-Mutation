# springBoot-kotlin-GraphQL-Mutation
Example project to create GraphQL mutation end points

# Build command
mvn clean install

# Run command
mvn spring-boot:run

# Example mutations
# Create employees
mutation CreateEmployee($input: AddEmployeeInput!) {
  addEmployee(input: $input) {
    departmentID
    code
    name
    address
    employees {
      employeeID
      name
      designation
      technicalSkills
    }
  }
}
# Query variables
{"input": {"departmentID": 1,"name": "Albert George","designation": "PM"}}

# Create departments
mutation CreateDepartment($input: AddDepartmentInput!) {
  addDepartment(input: $input) {
    departmentID
    code
    name
    address
    employees {
      employeeID
      name
      designation
      technicalSkills
    }
  }
}
# Query variables
{"input": {"code": "QA","name": "Quality Analyst","address": "QA-7890"}}