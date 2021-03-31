package main

class Principal(override var name: String, override var role: String, override var staffGrade: Char) :
    Staff(name, role, staffGrade) {
    // principal can admit a student
    fun admitStudent(applicant: ApplicantProfile) {
        if (applicant.score >= schoolCutOffMark && applicant.age in schoolAgeLimit) {
            println("Congratulations ${applicant.name} you have been admitted.")
            println("Course to study: ${applicant.courseAppliedFor}")
        } else {
            println("Sorry your application has been declined")
        }
    }

    // Principal can expel a student
    fun expelStudent(student: Student) {
        if (student.report in deptRules) {
            println("${student.name} have been expelled because of ${student.report}")
        }
    }
}










