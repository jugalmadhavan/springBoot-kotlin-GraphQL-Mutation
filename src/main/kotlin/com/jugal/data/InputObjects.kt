package com.jugal.data

data class AddEmployeeInput(
    val departmentID: Int,
    val name: String,
    val designation: String,
    val technicalSkills: String?
)

data class AddDepartmentInput(
    val code: DepartmentCode,
    val name: String,
    val address: String
)