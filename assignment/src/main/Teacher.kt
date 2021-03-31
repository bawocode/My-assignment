package main

class Teacher(override var name: String, override var role: String, val report: String, override var staffGrade: Char) :
    Staff(name, role, staffGrade)


