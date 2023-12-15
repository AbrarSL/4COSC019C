import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShowImageFrame extends JFrame {
    private ImageIcon zeroIcon;
    private ImageIcon oneIcon;
    private ImageIcon twoIcon;
    private JLabel imgLabel;
    private JButton oneBtn;
    private JButton twoBtn;

    public ShowImageFrame() {
        try {
            this.zeroIcon = new ImageIcon(getClass().getResource("zero.png"));
            this.oneIcon = new ImageIcon(getClass().getResource("one.png"));
            this.twoIcon = new ImageIcon(getClass().getResource("two.png"));
        } catch (NullPointerException exception) {
            System.out.println("Image not found!");
        }

        this.imgLabel = new JLabel(this.zeroIcon, JLabel.CENTER);
        this.oneBtn = new JButton("One");
        this.twoBtn = new JButton("Two");

        ImageListener imageListener = new ImageListener();
        this.oneBtn.addActionListener(imageListener);
        this.twoBtn.addActionListener(imageListener);
        this.imgLabel.addMouseListener(imageListener);

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(1, 2));
        btnPanel.add(this.oneBtn);
        btnPanel.add(this.twoBtn);

        Container contentPane = this.getContentPane();

        contentPane.setLayout(new BorderLayout());
        contentPane.setBackground(Color.BLUE);
        contentPane.add(btnPanel, BorderLayout.SOUTH);
        contentPane.add(this.imgLabel, BorderLayout.CENTER);
    }

    private class ImageListener extends MouseAdapter implements ActionListener {
        public void mouseClicked(MouseEvent event) {
            imgLabel.setIcon(zeroIcon);
        }

        @Override
        public void actionPerformed(ActionEvent event) {
            String btnLabel = event.getActionCommand();

            if (btnLabel.contains("One"))
                imgLabel.setIcon(oneIcon);
            else if (btnLabel.contains("Two"))
                imgLabel.setIcon(twoIcon);
        }
    }

    public static void run() {
        JFrame frame = new ShowImageFrame();

        frame.setTitle("Show Image");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
