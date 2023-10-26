package org.example;

public class Actor {
    private final String name;
    private final String surname;
    private final Date dateOfBirth;
    private int numberOfMovies;

    public Actor(String name, String surname, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public int getNumberOfMovies() {
        return this.numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    @Override
    public String toString() {
        return String.format(
                "Actor [name = %s, surname = %s, number of movies = %d, dob = %02d/%02d/%04d",
                this.name,
                this.surname,
                this.numberOfMovies,
                this.dateOfBirth.getDay(),
                this.dateOfBirth.getMonth(),
                this.dateOfBirth.getYear()
        );
    }
}
