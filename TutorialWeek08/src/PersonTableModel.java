import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class PersonTableModel extends AbstractTableModel {
    private String[] columnNames = {"Name", "Date of Birth", "Type"};
    private final ArrayList<Person> persons;

    public PersonTableModel(ArrayList<Person> persons) {
        this.persons = persons;
    }

    @Override
    public int getRowCount() {
        return this.persons.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object valueAt = null;
        Person person = this.persons.get(rowIndex);

        switch (columnIndex) {
            case 0:
                valueAt = person.getName();
                break;
            case 1:
                valueAt = person.getDateOfBirth();
                break;
            case 2:
                valueAt = person instanceof Teacher ? "Teacher" : "Student";
                break;
        }

        return valueAt;
    }
}
