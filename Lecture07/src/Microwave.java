import javax.swing.*;
import java.awt.*;

public class Microwave extends JFrame {
    public Microwave() {
        JPanel panelOne = new JPanel(new GridLayout(4, 3));

        for (int i = 1; i < 10; i++) {
            panelOne.add(new JButton(String.valueOf(i)));
        }

        panelOne.add(new JButton("0"));
        panelOne.add(new JButton("Start"));
        panelOne.add(new JButton("Stop"));

        JPanel panelTwo = new JPanel(new BorderLayout());
        panelTwo.add(new JTextField("Time to be displayed here"), BorderLayout.NORTH);
        panelTwo.add(panelOne, BorderLayout.CENTER);

        this.setLayout(new BorderLayout());
        this.add(panelTwo, BorderLayout.EAST);
        this.add(new JButton("This is where the food goes"), BorderLayout.CENTER);
    }
}
