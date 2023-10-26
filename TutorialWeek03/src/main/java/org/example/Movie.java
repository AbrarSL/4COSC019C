package org.example;

public class Movie {
    private final String title;
    private final String category;
    private int numberOfAwards;
    private final Director director;
    private final Actor[] actors;

    public Movie(String title, String category, Director director, Actor[] actors) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.actors = actors;
    }

    public String getTitle() {
        return this.title;
    }

    public String getCategory() {
        return this.category;
    }

    public Director getDirector() {
        return this.director;
    }

    public Actor[] getActors() {
        return this.actors;
    }

    public int getNumberOfAwards() {
        return this.numberOfAwards;
    }

    public void setNumberOfAwards(int numberOfAwards) {
        this.numberOfAwards = numberOfAwards;
    }

    @Override
    public String toString() {
        return String.format(
                "Movie [title = %s, category = %s, director name = %s, director surname = %s, number of awards = %d",
                this.title,
                this.category,
                this.director.getName(),
                this.director.getSurname(),
                this.numberOfAwards
        );
    }
}
