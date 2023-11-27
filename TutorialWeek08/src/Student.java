public class Student extends Person {
    private static int currentId = 0;
    private final int id;
    private String course;

    public Student(String name, Date dateOfBirth, String course) {
        super(name, dateOfBirth);
        this.course = course;
        this.id = currentId++;
    }

    public Student(String name, int year, int month, int day, String course) {
        super(name, year, month, day);
        this.course = course;
        this.id = currentId++;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getId() {
        return this.id;
    }
}
