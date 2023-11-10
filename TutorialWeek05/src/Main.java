public class Main {
    public static void main(String[] args) {
        ShapeCollection sys = new GeometricShapeCollection(10);
        boolean exit = false;
/*        while (!exit) {
            exit = sys.runMenu();
        }*/

        String text = "tech";
        System.out.printf(
                "Does '%s' have all unique chars? %s%n",
                text,
                InterviewQuestion.areAllCharsUnique(text) ? "Yes" : "No"
        );

        TestCylinder.run();
    }
}