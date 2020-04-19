package com.jugal.data
import com.jugal.data.DepartmentCode.IT
import com.jugal.data.DepartmentCode.SALES
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType.STRING
import javax.persistence.Enumerated
import javax.persistence.Id
import javax.persistence.Table

enum class DepartmentCode { SALES, IT, HR }

@Entity
@Table(name = "department")
data class Department(
    @Id
    @Column(name = "dept_id")
    val departmentID: Int,
    @Enumerated(STRING)
    @Column(name = "dept_code")
    val code: DepartmentCode = SALES,
    @Column(name = "dept_name")
    val name: String,
    @Column(name = "dept_address")
    val address: String
)

@Entity
@Table(name = "employee")
data class Employee(
    @Id
    @Column(name = "emp_id")
    val employeeID: Int,
    @Column(name = "dept_id")
    val deptID: Int,
    @Column(name = "emp_name")
    val name: String,
    @Column(name = "emp_designation")
    val designation: String,
    @Column(name = "emp_technical_skills")
    val technicalSkills: String?
)