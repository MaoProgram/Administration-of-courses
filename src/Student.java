import java.util.List;
import java.util.ArrayList;

class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void enroll(Course course) {
        course.enroll(course);
    }

    @Override
    public String toString() {
        return "Student: " + name + " (ID: " + id + ")";
    }
}