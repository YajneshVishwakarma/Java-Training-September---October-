package Java_September_October.src.Java_24_08_2022;

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the 3 numbers");

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if (a > b && a > c)
        {
            System.out.println("A: "+a+"  is the greatest of three");
        }
        else if (b > c)
        {
            System.out.println("B: "+b+" is the greatest of three");
        }
        else
        {
            System.out.println("C: "+c+" is the greatest of three");
        }
    }
}
