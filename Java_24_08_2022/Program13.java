package Java_September_October.src.Java_24_08_2022;

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to check whether it is divisible by 3 & 5");
        int num = scan.nextInt();

        if (num % 3 == 0 && num % 5 == 0)
        {
            System.out.println("The number "+num+" is Divisible by 3 & 5");
        }
        else
        {
            System.out.println("The number "+num+" is not Divisible by 3 & 5");
        }

    }
}
