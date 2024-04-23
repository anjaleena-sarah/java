import java.io.*;
import java.util.*;
public class FilecountOut {
    public static void main(String args[]) {
        FileInputStream fin;
        Scanner s = new Scanner(System.in);
        try { 
            System.out.println("Enter the name of the file");// a.txt
            String fname = s.nextLine();
            fin = new FileInputStream(fname);
            int chars = fin.available();
            int ch = fin.read();
            char letter;
            int words = 1, lines = 1;
            while (ch != -1) {
                letter = (char) ch;
                if (letter == '\n') {
                    words++;
                    lines++;
                } else if (letter == ' ')
                    words++;
                ch = fin.read();
            }
            System.out.println("Numbers of Characters in this file: " + chars);
            System.out.println("Numbers of Words in this file: " + words);
            System.out.println("Numbers of Lines in this file: " + lines);
            fin.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        s.close();
    }
}
