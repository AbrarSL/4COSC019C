import javax.swing.*;
import java.awt.*;

public class AppFrame extends JFrame {
    public AppFrame() {
        FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 10, 20);
        GridLayout gridLayout = new GridLayout(3, 2, 12, 12);
        BorderLayout borderLayout = new BorderLayout(12, 12);

        this.setLayout(borderLayout);
        this.createDirectionalButtons();
    }

    private void createDirectionalButtons() {
        this.add(new JButton("North"), BorderLayout.NORTH);
        this.add(new JButton("South"), BorderLayout.SOUTH);
        this.add(new JButton("East"), BorderLayout.EAST);
        this.add(new JButton("West"), BorderLayout.WEST);
        this.add(new JButton("Center"), BorderLayout.CENTER);
    }

    private void createFormComponents() {
        this.add(new JLabel("First Name"));
        this.add(new JTextField(8));
        this.add(new JLabel("Middle Name"));
        this.add(new JTextField(8));
        this.add(new JLabel("Last Name"));
        this.add(new JTextField(8));
    }
}
