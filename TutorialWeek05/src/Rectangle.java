public class Rectangle extends GeometricObject {
    protected double length;
    protected double width;

    public Rectangle() {}

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color, boolean filled) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return (this.length * this.width);
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    @Override
    public String getShape() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return this.getShape();
    }
}
