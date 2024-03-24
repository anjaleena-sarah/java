import java.util.*;
import java.io.*;
class Mergefile {
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
            int m = fin2.read();
            while (n != -1 || m != -1) {
                while (n != -1 && n != '\n') {
                    fout.write(n);
                    n = fin1.read();
                }
                while (m != -1 && m != '\n') {
                    fout.write(m);
                    m = fin2.read();
                }
                fout.write('\n');
                n = fin1.read();
                m = fin2.read();
            }
            System.out.println("File Merged successfully.");
            fout.close();
            fin1.close();
            fin2.close();
            s.close();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
