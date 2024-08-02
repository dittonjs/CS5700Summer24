import org.example.Database
import org.example.Student
import org.example.StudentController
import kotlin.test.Test

class TestDatabase: Database {
    var savedStudent: Student? = null
    override fun saveStudent(student: Student) {
        println("Not actually saving student")
        this.savedStudent = student
    }

    override fun loadStudent(name: String): Student {
        return Student(name)
    }

}

class StudentControllerTest {
    @Test
    fun testCreateStudent() {
        val db = TestDatabase()
        val controller = StudentController(db)
        controller.createStudent("Joseph")
        assert(db.savedStudent?.name == "joseph")
    }
}
