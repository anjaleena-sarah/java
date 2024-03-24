import java.util.*;
import java.io.*;

public class Copyfile {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        FileOutputStream fout;
        FileInputStream fin1, fin2;
        try {
            System.out.println("Enter The Name of the Source file1: ");
            String sname1 = s.nextLine();
            fin1 = new FileInputStream(sname1);
            System.out.println("Enter The Name of the Source file2: ");
            String sname2 = s.nextLine();
            fin2 = new FileInputStream(sname2);
            System.out.println("Enter The Name of the Destination file: ");
            String dname = s.nextLine();
            fout = new FileOutputStream(dname);

            int n = fin1.read();
            while (n != -1) {
                fout.write(n);
                n = fin1.read();
            }
            fout.write("\n".getBytes());
            n = fin2.read();
            while (n != -1) {
                fout.write(n);
                n = fin2.read();
            }
            System.out.println("Files merged succesfully.");
            fout.close();
            fin1.close();
            fin2.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
        s.close();
    }
}
