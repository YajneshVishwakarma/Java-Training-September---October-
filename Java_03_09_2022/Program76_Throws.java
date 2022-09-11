package Java_September_October.src.Java_03_09_2022;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program76_Throws {

    static void f1() throws FileNotFoundException{
        FileInputStream fInput = new FileInputStream("d:\\xyz.txt");
    }

    public static void main(String[] args)  {
        System.out.println("Main Started");
        try
        {
            System.out.println("Function called");
            f1();
            System.out.println("Function returned");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Exception handled successfully");
        }
        System.out.println("Main Ended");

    }
}
