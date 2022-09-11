package Java_September_October.src.Java_03_09_2022;

import java.util.Scanner;

public class Program73_Exception {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.println("Enter a");
            int a = scan.nextInt();

            System.out.println("Enter b");
            int b = scan.nextInt();

            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
