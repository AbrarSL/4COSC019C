package org.example;

public class Ticket {
  private static int numberOfTicketsSold = 0;

  private int ticketNumber;

  public Ticket() {
    this.ticketNumber = ++numberOfTicketsSold;
  }

  public static int getNumberOfTicketsSold() {
    return numberOfTicketsSold;
  }

  public int getTicketNumber() {
    return ticketNumber;
  }

  @Override
  public String toString() {
    return "The Golden Ticket";
  }
}
