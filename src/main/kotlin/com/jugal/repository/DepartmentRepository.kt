package com.jugal.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.transaction.Transactional
import com.jugal.data.Department
import com.jugal.data.Employee

@Repository
@Transactional
interface DepartmentRepository : JpaRepository<Department, Int> {
    fun findByCode(code: String): Department
}

@Repository
@Transactional
interface EmployeeRepository : JpaRepository<Employee, Int> {
    fun findByDeptID(deptID: Int): List<Employee>
}