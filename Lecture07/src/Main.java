import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new EventHandling();
        frame.setSize(400, 400);
        frame.setTitle("My Window");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
