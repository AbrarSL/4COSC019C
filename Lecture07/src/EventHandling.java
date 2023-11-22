import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling extends JFrame {
    JButton mainButton;
    JLabel mainLabel;
    public EventHandling() {
        this.mainButton = new JButton("Click");
        this.mainButton.addActionListener(new DemoHandler());
        this.mainLabel = new JLabel("Hello!");
        this.mainLabel.setForeground(Color.RED);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        this.add(this.mainButton);
        this.add(this.mainLabel);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private class DemoHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainLabel.setText("Kenobi!");
        }
    }
}
