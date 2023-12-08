import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {
    private JLabel countLabel;
    private JTextField countField;
    private JButton increaseBtn;
    private JButton decreaseBtn;
    private JButton resetBtn;
    private int count;

    public Counter() {
        super();

        CountHandler btnHandler = new CountHandler();

        this.count = 0;

        this.countLabel = new JLabel("Counter");
        this.countField = new JTextField(20);
        this.increaseBtn = new JButton("Count Up");
        this.decreaseBtn = new JButton("Count Down");
        this.resetBtn = new JButton("Reset");

        this.countField.setEditable(false);
        this.countField.setText(String.valueOf(this.count));

        this.increaseBtn.addActionListener(btnHandler);
        this.decreaseBtn.addActionListener(btnHandler);
        this.resetBtn.addActionListener(btnHandler);

        this.setLayout(new FlowLayout());
        this.add(this.countLabel);
        this.add(this.countField);
        this.add(this.increaseBtn);
        this.add(this.decreaseBtn);
        this.add(this.resetBtn);
    }

    private class CountHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().contains("Up")) {
                countField.setText(String.valueOf(++count));
            } else if (e.getActionCommand().contains("Down")) {
                countField.setText(String.valueOf(--count));
            } else {
                count = 0;
                countField.setText(String.valueOf(count));
            }
        }
    }

    public static void run() {
        JFrame frame = new Counter();

        frame.setTitle("My Counter");
        frame.setSize(320, 70);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
