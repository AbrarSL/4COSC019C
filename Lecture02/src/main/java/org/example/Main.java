package org.example;

public class Main {
    public static void main(String[] args) {
        Person me = new Person("Abrar", 21);
        System.out.println("My name is " + me.getName());
        System.out.println("I am " + me.getAge() + " years old");
        Ticket[] soldTickets = new Ticket[20];

        for (int i = 0; i < soldTickets.length; i++) {
            soldTickets[i] = new Ticket();
        }

        System.out.println("Tickets sold: " + Ticket.getNumberOfTicketsSold());
    }
}