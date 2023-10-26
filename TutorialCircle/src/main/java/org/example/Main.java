package org.example;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(8);
        System.out.println(c2);

        Circle c3 = new Circle(4, "Red");
        System.out.println(c3);

        c3.setColor("Green");
        c3.setRadius(2);
        System.out.println(c3);
    }
}