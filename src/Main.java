
public class Main {
    public static void main(String[] args) {
        Student student = new Student("2070782", "Santiago C");
        Course course1 = new Course("Algorithms", "ALGO", 100, 2);
        Course course2 = new Course("Operating Systems", "OSP", 80,5);

        student.enroll(course1);
        student.enroll(course2);

        System.out.println(student);
    }
}
