import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Integer[] nums =  {1,2,3,4,5};

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(10);
        nums2.add(20);
        nums2.add(30);

//        printList(nums2);
//        printList(new ArrayIterator<>(nums));
//        printList(new ArrayListIterator<>(nums2));

        Course course = new Course();
        course.enrollStudent(new Student("Joseph"));
        course.enrollStudent(new Student("Catelyn"));
        course.enrollStudent(new Student("Sophie"));
        course.enrollStudent(new Student("Happy"));
        course.enrollStudent(new Student("Debbie"));

        printList(course);
        printList(nums2);
        printList(new ArrayIterable<>(nums));
    }

    public static <T> void printList(Iterable<T> iterable) {
        iterable.forEach(item -> System.out.println(item));
    }
}


