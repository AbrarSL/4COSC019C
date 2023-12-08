import java.io.Serializable;
import java.util.zip.DataFormatException;

public class Student {
    private final String name;
    private final int id;
    private final int mark;

    public Student(String name, int id, int mark) {
        this.name = name;
        this.id = id;
        this.mark = mark;
    }

    public static Student loadFromString(String data) throws DataFormatException {
        String[] lines = data.split("\n");

        if (lines.length < 3) {
            throw new DataFormatException();
        }

        try {
            String name = lines[0];
            int id = Integer.parseInt(lines[1]);
            int mark = Integer.parseInt(lines[2]);

            return new Student(name, id, mark);
        } catch (NumberFormatException exception) {
            throw new DataFormatException();
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return String.format("Name = %s%nID = %d%nMark = %d", this.name, this.id, this.mark);
    }

    public String saveToString() {
        return String.format(
                "%s%n%d%n%d%n",
                this.name,
                this.id,
                this.mark
        );
    }
}
