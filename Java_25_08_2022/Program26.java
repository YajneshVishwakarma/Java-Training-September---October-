package Java_September_October.src.Java_25_08_2022;

import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the two numbers to swap");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("The value of a and b before swapping are "+a+", "+b);

        a ^= b;
        b ^= a;
        a ^= b;

//        a = a - b;
//        b = a + b;
//        a = b - a;

        System.out.println("The value of a and b after swapping are "+a+", "+b);

        System.out.println("Enter the two numbers to swap");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("The value of a and b before swapping are "+a+", "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("The value of a and b after swapping are "+a+", "+b);

    }
}
