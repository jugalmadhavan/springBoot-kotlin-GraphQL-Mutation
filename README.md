# springBoot-kotlin-GraphQL-Query
Example project for GraphQL query end point

# Build command
mvn clean install

# Run command
mvn spring-boot:run

# Example queries
# Get all departments
query {
  departments {
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
# Get department by code
query {
        department(code: IT) {
          departmentID
          code
          name
          address
        }
      }
