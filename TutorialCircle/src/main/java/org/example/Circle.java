package org.example;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format(
                "The circle has a radius of %.2f and an area of %.2f.%nIt's color is %s.%n",
                this.getRadius(),
                this.getArea(),
                this.getColor()
        );
    }
}
