package com.jugal.graphql.resolver

import com.jugal.data.Employee
import com.jugal.data.Department
import com.jugal.repository.EmployeeRepository
import com.coxautodev.graphql.tools.GraphQLResolver
import org.springframework.stereotype.Component


@Component
class DepartmentResolver(private val employeeRepository: EmployeeRepository) : GraphQLResolver<Department> {

    fun employees(department: Department): List<Employee> =
        employeeRepository.findByDeptID(department.departmentID)

}
