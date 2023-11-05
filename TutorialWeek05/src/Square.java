public class Square extends GeometricObject {
    protected double side;

    public Square() {}

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public String getShape() {
        return "Square";
    }

    @Override
    public String toString() {
        return this.getShape();
    }
}
