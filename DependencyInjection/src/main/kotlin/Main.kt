package org.example

import java.io.FileWriter

fun main() {
    val controller = StudentController(SQLDatabase())

    controller.createStudent("Joseph")
}

data class Student(val name: String)

interface Database {
    fun saveStudent(student: Student)
    fun loadStudent(name: String): Student
}

class SQLDatabase: Database {
    override fun saveStudent(student: Student) {
        println("Actually writing student ${student.name} to database")
    }

    override fun loadStudent(name: String): Student {
        println("Actually loading student $name from database")
        return Student(name)
    }

}


fun simpleDBFactory(type: String): Database {
    if (type == "SQL") return SQLDatabase()
    throw RuntimeException("Not a valid database")
}

class StudentController(private val database: Database) {

    fun createStudent(name: String) {
        if (name.isEmpty()) throw RuntimeException("Invalid Student Name")

        database.saveStudent(Student(name.lowercase()))
    }
}