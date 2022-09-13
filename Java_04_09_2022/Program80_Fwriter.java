package Java_September_October.src.Java_04_09_2022;

import java.io.FileWriter;

public class Program80_Fwriter {
    public static void main(String[] args) {
        try {
            FileWriter fwrite = new FileWriter("D://Student.txt");

            fwrite.write("Yash\nShetty\nISIIS009\n");
            System.out.println("File written successfully!!");
            fwrite.close();
        } catch (Exception e) {
            System.out.println("Exception handled");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
