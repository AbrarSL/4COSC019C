import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class TableExample extends JFrame {
    private final JTable table;
    private final PersonTableModel model;

    public TableExample(String title, int width, int height) {
        Random random = new Random();
        String[] names = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "U"};
        String[] courses = {"SE", "CS", "BIS", "AIDS", "BM", "BA"};
        ArrayList<Person> people = new ArrayList<>();

        for (String name : names) {
            if (random.nextBoolean()) {
                people.add(new Teacher(
                        name,
                        random.nextInt(2000),
                        random.nextInt(12),
                        random.nextInt(30),
                        random.nextInt(1000, 10000)
                ));
            } else {
                people.add(new Student(
                        name,
                        random.nextInt(2000),
                        random.nextInt(12),
                        random.nextInt(30),
                        courses[random.nextInt(courses.length)]
                ));
            }
        }

        this.model = new PersonTableModel(people);
        this.table = new JTable();
        this.table.setModel(this.model);
        this.table.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component renderer = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (value == "Teacher") {
                    renderer.setBackground(Color.GREEN);
                } else {
                    renderer.setBackground(Color.BLUE);
                }
                return renderer;
            }
        });

        this.add(this.table);
        this.setTitle(title);
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
