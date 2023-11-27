public class Person {
    private final String name;
    private final Date dateOfBirth;

    public Person(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, int year, int month, int day) {
        this.name = name;
        this.dateOfBirth = new Date(day, month, year);
    }

    public String getName() {
        return this.name;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
}
