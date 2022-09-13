package Java_September_October.src.Java_04_09_2022;

import java.io.File;
import java.io.IOException;

public class Program79_FileOperation {
    public static void main(String[] args) {

        File f1 = new File("D://Student.txt");

        try {
            if (f1.createNewFile() || f1.isFile()) {
                System.out.println("File "+f1.getName()+" created successfully");

                System.out.println("File name: " + f1.getName());
                System.out.println("The Absolute path of the file is: "+f1.getAbsolutePath());
                System.out.println("Is the file writable?: "+f1.canWrite());
                System.out.println("Is the file readable?: "+f1.canRead());
                System.out.println("Is the file executable?: "+f1.canExecute());
                System.out.println("The length of the file is: "+f1.length());
            }
        } catch (IOException e) {
            System.out.println("Thank you");
            e.printStackTrace();
        }


    }
}
