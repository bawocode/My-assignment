package main


fun main() {
    val principal1 = Principal("Ola Bamiloye", "Principal", 'A')
    println(" ${principal1.toString()}")
    val nonAcademicStaff1 = NonAcademicsStaff("Fatimah John", "Non Academic", 'C')
    val applicant1 = ApplicantProfile("Ola", 40, "Software Developer", 299)
    val teacher1 = Teacher("Rita Marley", "Teacher", "Smoking", 'A')
    val nonAcademicsStaff1 = NonAcademicsStaff("Karen Badmus", "Bursar", 'C')

    val student1 = Student("John", "Computer Science", "Fighting", "100L")
    val student2 = Student("Peter", "Software Engineer", "Good", "100L")
    principal1.expelStudent(student1)
    principal1.admitStudent(applicant1)
    student2.takeCourse("Computer Science")
    nonAcademicStaff1.disengageStaff(teacher1)
    nonAcademicStaff1.payStaffSalary(teacher1)


    /* var  teacher1 = Teacher("Peter Obi", "Teacher")

       class Student : StudentApplicantProfile() {
           var level: String = ""
           var grade: String = ""
       }

       class Applicant : StudentApplicantProfile() {
           var score: String = ""
       }*/


}

private operator fun String.invoke(s: String) {

}
