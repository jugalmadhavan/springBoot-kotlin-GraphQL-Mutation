package com.jugal.graphql.resolver

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.jugal.data.AddDepartmentInput
import com.jugal.data.AddEmployeeInput
import com.jugal.data.Department
import com.jugal.data.Employee
import com.jugal.repository.DepartmentRepository
import com.jugal.repository.EmployeeRepository
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
@Transactional
class MutationResolver(
    private val departmentRepository: DepartmentRepository,
    private val employeeRepository: EmployeeRepository
) : GraphQLMutationResolver {

    fun addEmployee(input: AddEmployeeInput): Department {
        employeeRepository.save(
            Employee(
                deptID = input.departmentID,
                name = input.name,
                designation = input.designation,
                technicalSkills = input.technicalSkills
            )
        )
        return departmentRepository.findByDepartmentID(input.departmentID)
    }

    fun addDepartment(input: AddDepartmentInput): Department {
        val newDepartment = departmentRepository.save(
            Department(
                code = input.code,
                name = input.name,
                address = input.address
            )
        )
        return departmentRepository.findByDepartmentID(newDepartment.departmentID)
    }

}