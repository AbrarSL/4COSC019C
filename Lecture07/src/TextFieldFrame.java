import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldFrame extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPasswordField passwordField;

    public TextFieldFrame() {
        super("Testing TextField and JPassword");

        setLayout(new FlowLayout());

        textField1 = new JTextField(10);
        add(textField1);

        textField2 = new JTextField("Enter text here...");
        add(textField2);

        textField3 = new JTextField("Uneditable text field");
        textField3.setEditable(false);
        add(textField3);

        passwordField = new JPasswordField("Hidden Text");
        add(passwordField);

        TextFieldHandler textFieldHandler = new TextFieldHandler();
        textField1.addActionListener(textFieldHandler);
        textField2.addActionListener(textFieldHandler);
        textField3.addActionListener(textFieldHandler);
        passwordField.addActionListener(textFieldHandler);
    }

    private class TextFieldHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            String outputString = "";
            Object eventSource = event.getSource();
            if (eventSource == textField1) {
                outputString += "TextField 1: " + event.getActionCommand();
            } else if (eventSource == textField2) {
                outputString += "TextField 2: " + event.getActionCommand();
            } else if (eventSource == textField3) {
                outputString += "TextField 3: " + event.getActionCommand();
            } else if (eventSource == passwordField) {
                outputString += "PasswordField: " + String.valueOf(passwordField.getPassword());
            }

            JOptionPane.showMessageDialog(null, outputString);
        }
    }
}
