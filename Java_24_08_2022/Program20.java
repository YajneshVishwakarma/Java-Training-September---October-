package Java_September_October.src.Java_24_08_2022;

import java.util.Scanner;

public class Program20 {

    static int a,b;
    static Scanner scan = new Scanner(System.in);

    static void read()
    {
        System.out.println("Enter the value of a");
        a = scan.nextInt();
        System.out.println("Enter the value of b");
        b = scan.nextInt();
    }

    public static void main(String[] args) {

        System.out.println("Enter your choice\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        int ch = scan.nextInt();

        switch (ch) {
            case 1 -> {
                read();
                System.out.println("The Result of Addition: " + (a + b));
            }
            case 2 -> {
                read();
                System.out.println("The Result of Subtraction: " + (a - b));
            }
            case 3 -> {
                read();
                System.out.println("The Result of Multiplication: " + (a * b));
            }
            case 4 -> {
                read();
                System.out.println("The Result of Division: " + (a / b));
            }
            default -> System.out.println("Invalid Choice");
        }
    }
}
