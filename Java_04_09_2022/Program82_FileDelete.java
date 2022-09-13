package Java_September_October.src.Java_04_09_2022;

import java.io.File;

public class Program82_FileDelete {
    public static void main(String[] args) {
        try {
            File file = new File("D://Student.txt");

            if (file.delete())
            {
                System.err.println("File Deleted successfully!!!");
            }
        } catch (Exception e) {
            System.err.println("Error occurred\nException handled");
            throw new RuntimeException(e);
        }
    }
}
