package main

class NonAcademicsStaff(override var name: String, override var role: String, override var staffGrade: Char) :
    Staff(name, role, staffGrade){

    // Disengage Staff with bad report
    fun disengageStaff(teacher: Teacher) {
        if (teacher.report in deptRules) {
            println("${teacher.report} is highly prohibited. Hence you have been sacked")
        } else {
            println("Your report have been satisfactory, please keep up the good work")
        }
    }

    fun payStaffSalary(teacher1: Teacher) {
        when(teacher1.staffGrade) {
             'A' -> println("Your monthly salary has been paid $gradeASalary")
             'B' -> println("Your monthly salary has been paid $gradeBSalary")
             'C' -> println("Your monthly salary has been paid $gradeCSalary")
        }
    }

}
