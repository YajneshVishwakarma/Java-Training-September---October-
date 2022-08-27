package Java_September_October.src.Java_25_08_2022;

import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Multiplication table you want");
        int n = scan.nextInt();
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%3d X %2d = %3d\n",n,i,(n*i));
        }


    }
}
