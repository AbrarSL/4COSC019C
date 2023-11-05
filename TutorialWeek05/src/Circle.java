public class Circle extends GeometricObject {
    protected double radius;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * Math.pow(this.radius, 2));
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * this.radius);
    }

    @Override
    public String getShape() {
        return "Circle";
    }

    @Override
    public String toString() {
        return this.getShape();
    }
}
