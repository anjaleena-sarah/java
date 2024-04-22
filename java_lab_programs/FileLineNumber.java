import java.io.*;
import java.util.Scanner;
public class FileLineNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input file name: ");
        String inputFileName = scanner.nextLine();
        System.out.print("Enter the output file name: ");
        String outputFileName = scanner.nextLine();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                writer.write(lineNumber + ": " + line);
                writer.newLine();
                lineNumber++;
            }
            reader.close();
            writer.close();
            System.out.println("File copied successfully with line numbers.");

        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
