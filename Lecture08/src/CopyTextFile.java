import java.io.*;

public class CopyTextFile {
    public static void run() throws IOException {
        File inputFile = new File("text.txt");
        File outputFile = new File("text_copy.txt");

        FileReader fileReader = new FileReader(inputFile);
        FileWriter fileWriter = new FileWriter(outputFile);

        int c;
        while ((c = fileReader.read()) != -1) {
            fileWriter.write(c);
        }

        fileReader.close();
        fileWriter.close();
    }
}
