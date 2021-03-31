package main


open class Department {

    protected open val schoolCutOffMark: Int = 200
    protected open val schoolAgeLimit = 18 until  35
    protected open val deptRules = listOf("Fighting", "Stealing", "Disobedience", "Smoking")
    open val deptCourses = listOf("Computer Science", "Software Engineering", "Mathematics", "Physics")

    open val salaryGrade = listOf('A', 'B', 'C')
    var gradeASalary = "N300,000"
    var gradeBSalary = "N200,000"
    var gradeCSalary = "N150,000"


}