package org.example;

public class Director {
    private final String name;
    private final String surname;
    private int numberOfMovies;
    private Date dateOfBirth;

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
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

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
                "Director [name = %s, surname = %s, dob = %02d/%02d/%04d, movies directed = %d",
                this.name,
                this.surname,
                this.dateOfBirth.getDay(),
                this.dateOfBirth.getMonth(),
                this.dateOfBirth.getYear(),
                this.numberOfMovies
        );
    }
}
