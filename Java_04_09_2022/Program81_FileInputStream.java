package Java_September_October.src.Java_04_09_2022;

import java.io.FileInputStream;
import java.util.Scanner;

public class Program81_FileInputStream {
    public static void main(String[] args) {
        try
        {
            FileInputStream fin = new FileInputStream("D://Student.txt");
            Scanner scan = new Scanner(System.in);

            while (scan.hasNext()) {
                String data = scan.nextLine();
                System.out.println(data);
            }
            scan.close();

        } catch (Exception e) {
            System.out.println("File not found");
            throw new RuntimeException(e);
        }
    }
}
