public class Teacher extends Person {
    private int salary;

    public Teacher(String name, Date dateOfBirth, int salary) {
        super(name, dateOfBirth);
        this.salary = salary;
    }

    public Teacher(String name, int year, int month, int day, int salary) {
        super(name, year, month, day);
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
