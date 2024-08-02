import java.util.Iterator;

public class Course implements Iterable<Student> {
    private Student[] students = new Student[35];
    private int numStudents = 0;

    public void enrollStudent(Student student) {
        students[numStudents] = student;
        numStudents ++;
    }

    @Override
    public Iterator<Student> iterator() {
        return new ArrayIterator<>(students);
    }
}
