public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color, true);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override
    public double getArea() {
        return (2 * Math.PI * this.radius * this.height) + (2 * super.getArea());
    }

    @Override
    public String toString() {
        return String.format(
                "Cylinder: radius=%.2f height=%.2f base area=%.2f surface area=%.2f volume=%.2f%n",
                this.getRadius(),
                this.getHeight(),
                super.getArea(),
                this.getArea(),
                this.getVolume()
        );
    }
}
