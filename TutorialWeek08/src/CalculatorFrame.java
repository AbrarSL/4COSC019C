import javax.swing.*;
import java.awt.*;

public class CalculatorFrame extends JFrame {
    private JTextField inputField;
    private JPanel numpad;
    private JPanel operationsPanel;
    private JPanel controlPanel;

    private Font appFont;

    public CalculatorFrame(String title, int width, int height) {
        this.appFont = new Font(Font.SANS_SERIF, Font.BOLD, 14);
        this.inputField = genInputField(this.appFont, Color.YELLOW, Color.BLUE);
        this.numpad = genNumpad(this.appFont, Color.RED, Color.BLUE);
        this.operationsPanel = genOperations(this.appFont, Color.GREEN, Color.BLUE);
        this.controlPanel = new JPanel();

        this.controlPanel.setLayout(new GridLayout(1, 2));
        this.controlPanel.setBackground(Color.BLUE);
        this.controlPanel.add(this.numpad);
        this.controlPanel.add(this.operationsPanel);

        this.setLayout(new BorderLayout());
        this.add(this.inputField, BorderLayout.NORTH);
        this.add(this.controlPanel, BorderLayout.CENTER);

        this.setTitle(title);
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static JTextField genInputField(Font font, Color background, Color foreground) {
        JTextField inputField = new JTextField(12);
        inputField.setFont(font);
        inputField.setBorder(null);
        inputField.setBackground(background);
        inputField.setForeground(foreground);

        return inputField;
    }

    private static JPanel genNumpad(Font font, Color background, Color foreground) {
        String[] keyLegend = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "."};

        JPanel numpad = new JPanel();
        numpad.setLayout(new GridLayout(4, 3, 6, 6));
        numpad.setOpaque(false);

        for (String legend : keyLegend) {
            JButton button = new JButton(legend);
            button.setFont(font);
            button.setBackground(background);
            button.setForeground(foreground);
            numpad.add(button);
        }

        return numpad;
    }

    private static JPanel genOperations(Font font, Color background, Color foreground) {
        String[] keyLegend = {"+", "-", "Clear"};

        JPanel operations = new JPanel();
        operations.setLayout(new GridLayout(4, 1, 2, 2));
        operations.setOpaque(false);

        for (String legend : keyLegend) {
            JButton button = new JButton(legend);
            button.setFont(font);
            button.setBackground(background);
            button.setForeground(foreground);
            operations.add(button);
        }

        return operations;
    }
}
