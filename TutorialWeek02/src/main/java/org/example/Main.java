package org.example;

public class Main {
    public static void main(String[] args) {
        String[][] peopleInfo = {
                {"Abe", "Abeson", "21"},
                {"Ben", "Benson", "22"},
                {"Carl", "Carlson", "23"}
        };

        Person[] people = new Person[peopleInfo.length];

        for (int i = 0; i < peopleInfo.length; i++) {
            people[i] = new Person(peopleInfo[i][0]);
            people[i].setSurname(peopleInfo[i][1]);
            people[i].setAge(Integer.parseInt(peopleInfo[i][2]));
        }

        for (Person person : people) {
            System.out.print("Name: ");
            person.displayName();
            System.out.println("Surname: " + person.getSurname());
            System.out.println("Age: " + person.getAge());
        }
    }
}