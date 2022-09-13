package Java_September_October.src.Java_04_09_2022;

import java.io.File;
import java.io.IOException;

public class Program78_FileException {
    public static void main(String[] args) {
        File f1 = new File("D://Student.txt");

        try {
            if (f1.createNewFile()) {
                System.out.println("File "+f1.getName()+" created successfully");
            }
        } catch (IOException e) {
            System.out.println("Thank you");
            e.printStackTrace();
        }
    }
}
