
class Course {

    private String name;

    private String code;

    private int credits;
    private int studentsEnrolled;



    public Course(String name, String code, int credits, int studentsEnrolled) {
        this.name = name;
        this.code = code;
        this.credits = credits;
        this.studentsEnrolled = studentsEnrolled;

    }
    public void enroll(Course course) {
        if (studentsEnrolled < credits) {
            studentsEnrolled++;
            System.out.println("Enrolled in " + course.getName());
        } else {
            System.out.println("Course is full, cannot enroll in " + course.getName());
        }
    }
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getCredits() {
        return credits;
    }
    public int getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
}
