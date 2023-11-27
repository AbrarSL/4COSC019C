import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseTracker extends JFrame {
    private JPanel trackerSurface;
    private JLabel infoLabel;
    public MouseTracker(String title) {
        super(title);
        this.setLayout(new GridLayout(2, 1));

        this.trackerSurface = new JPanel();
        this.trackerSurface.setBorder(new LineBorder(Color.BLACK, 1));
        this.infoLabel = new JLabel("Waiting for events...");
        this.infoLabel.setBorder(new LineBorder(Color.DARK_GRAY, 8));
        this.infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.infoLabel.setVerticalAlignment(SwingConstants.CENTER);

        this.add(this.trackerSurface);
        this.add(this.infoLabel);

        this.trackerSurface.addMouseListener(new MouseTrackerListener());
    }

    private class MouseTrackerListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            infoLabel.setText(
                    String.format(
                            "X: %d, Y: %d",
                            e.getLocationOnScreen().x,
                            e.getLocationOnScreen().y
                    )
            );
        }
    }
}
