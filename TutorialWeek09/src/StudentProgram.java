import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class StudentProgram {
    private static final String FILE_PATH = "./programState.txt";
    private static final Scanner INPUT = new Scanner(System.in);
    private static List<Student> students = new ArrayList<>();

    public static void run() {
        while (true) {
            System.out.println("MENU");
            System.out.println("1\tAdd student to list and save to file.");
            System.out.println("2\tRead students list from a file and display on the screen.");
            System.out.println("3\tExit.");

            try {
                int choice = Integer.parseInt(getInput("Enter your choice: "));

                if (choice <= 0 || choice > 3) {
                    throw new Exception();
                }

                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        displayStudents();
                        break;
                    case 3:
                        return;
                }
            } catch (Exception ignored) {
                System.out.println("Enter a valid choice!");
            }
        }
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        System.out.flush();
        return INPUT.nextLine();
    }

    private static void addStudent() {
        try {
            String name = getInput("Enter student name: ");
            int id = Integer.parseInt(getInput("Enter student ID: "));
            int mark = Integer.parseInt(getInput("Enter marks: "));

            Student student = new Student(name, id, mark);
            students.add(student);
            saveStudents();
        } catch (Exception ignored) {
            System.out.println("Invalid input!");
        }
    }

    private static void displayStudents() {
        try {
            loadStudents();
        } catch (Exception ignored) {
            System.out.println("Couldn't load students!");
        }

        System.out.println("Students");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    private static void saveStudents() throws IOException {
        File saveFile = new File(FILE_PATH);
        saveFile.delete();

        try (FileWriter fileWriter = new FileWriter(saveFile);
            BufferedWriter writer = new BufferedWriter(fileWriter)) {
            for (Student student : students) {
                writer.write(student.saveToString());
            }
        }
    }

    private static void loadStudents() throws IOException {
        File saveFile = new File(FILE_PATH);
        List<Student> loadedStudents = new ArrayList<>();

        if (saveFile.exists()) {
            try (FileReader fileReader = new FileReader(saveFile);
                 BufferedReader reader = new BufferedReader(fileReader)) {
                List<String> lines = reader.lines().toList();

                if (lines.size() % 3 != 0) {
                    throw new IOException();
                }

                for (int i = 0; i < lines.size(); i += 3) {
                    Student student = new Student(
                            lines.get(i),
                            Integer.parseInt(lines.get(i + 1)),
                            Integer.parseInt(lines.get(i + 2))
                    );

                    loadedStudents.add(student);
                }
            } finally {
                students = loadedStudents;
            }
        }
    }
}
