package org.example;

// Test all the classes
public class Main {
    public static void main(String[] args) {
        // Test Date
        Date myDob = new Date(1, 4, 2002);
        System.out.println(myDob);
        System.out.println(myDob.getDate());

        // Test Director
        Director cameron = new Director("James", "Cameron");

        // Test getters and setters
        cameron.setDateOfBirth(new Date(16, 8, 1954));
        cameron.setNumberOfMovies(23);

        System.out.println(cameron);
        System.out.println("name is : " + cameron.getName());
        System.out.println("surname is : " + cameron.getSurname());
        System.out.println("dob is : " + cameron.getDateOfBirth().getDate());
        System.out.println("number of directed movies is : " + cameron.getNumberOfMovies());

        // Test Actor
        Actor[] actors = {
                new Actor("Tom", "Cruise", new Date(1, 6, 1977)),
                new Actor("Cameron", "Diaz", new Date(4, 8, 1979)),
                new Actor("Alfred", "Molina", new Date(8, 3, 1964))
        };

        // Test Movie
        Movie avatar = new Movie("Avatar", "Fantasy", cameron, actors);
        System.out.println(avatar);

        // Test setters and getters
        avatar.setNumberOfAwards(23);

        System.out.println("title is : " + avatar.getTitle());
        System.out.println("category is : " + avatar.getCategory());
        System.out.println("name of director is : " + avatar.getDirector().getName());
        System.out.println("surname of director is : " + avatar.getDirector().getSurname());
        System.out.println("number of awards is : " + avatar.getNumberOfAwards());
    }
}