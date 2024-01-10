package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            int value;
            System.out.println("Please enter an integer");
            value = input.nextInt();
            System.out.println("Your number: " + value);
        } catch (NumberFormatException exception) {
            System.out.println("Please enter a valid integer!");
        }
    }
}