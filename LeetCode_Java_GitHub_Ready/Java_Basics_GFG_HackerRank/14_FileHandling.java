import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Java file handling example.");
        } catch (IOException e) {
            System.out.println("Write error: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            System.out.println("Read error: " + e.getMessage());
        }
    }
}
