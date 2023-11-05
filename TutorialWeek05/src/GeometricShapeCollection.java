import java.util.ArrayList;
import java.util.Scanner;

public class GeometricShapeCollection implements ShapeCollection {
    private ArrayList<GeometricObject> shapeList;
    private int numObject;

    public GeometricShapeCollection(int listLength) {
        this.numObject = listLength;
        this.shapeList = new ArrayList<GeometricObject>();
    }

    public void addShape(GeometricObject shape) {
        if (this.shapeList.size() < this.numObject) {
            this.shapeList.add(shape);
        } else {
            System.out.println("No more space in the list");
        }
    }

    public void printShapeList() {
        for (GeometricObject shape : this.shapeList) {
            System.out.printf(
                    "Shape = %s, Area = %.2f, Perimeter = %.2f%n",
                    shape.getShape(),
                    shape.getArea(),
                    shape.getPerimeter()
            );
        }
    }

    public boolean runMenu() {
        boolean exit = false;

        System.out.println("To add a new shape press 1");
        System.out.println("To print the list of shapes press 2");
        System.out.println("To exit press 3");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Press 1 to add Circle");
                System.out.println("Press 2 to add Rectangle");
                System.out.println("Press 3 to add Square");

                int shapeChoice = input.nextInt();
                input.nextLine();

                System.out.println("Enter the color of the shape");
                String color = input.nextLine();

                System.out.println("Is it filled? (y/n)");
                String isFilled = input.nextLine();

                if (!(isFilled.equals("y") || isFilled.equals("n"))) {
                    System.out.println("Please enter y or n, if the shape is filled or not respectively");
                    break;
                }

                boolean filled = isFilled.equals("y");

                switch (shapeChoice) {
                    case 1:
                        System.out.println("Insert the radius");
                        int radius = input.nextInt();

                        Circle circle = new Circle(radius, color, filled);
                        this.addShape(circle);
                        break;
                    case 2:
                        System.out.println("Insert the length");
                        int length = input.nextInt();
                        System.out.println("Insert the width");
                        int width = input.nextInt();

                        Rectangle rectangle = new Rectangle(length, width, color, filled);
                        this.addShape(rectangle);
                        break;
                    case 3:
                        System.out.println("Insert the side length");
                        int side = input.nextInt();

                        Square square = new Square(side, color, filled);
                        this.addShape(square);
                        break;
                }
                break;
            case 2:
                this.printShapeList();
                break;
            case 3:
                exit = true;
                break;
        }

        return exit;
    }
}
