package Java_September_October.src.Java_25_08_2022;

import java.util.Scanner;

public class Program29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number to check if it is a prime number");
        int num = scan.nextInt();
        boolean flag = false;

        if (num <= 1 )
        {
            num = 2;
        }

        for (int i = 2; i <= num/2 ; i++) {
            if (num % i == 0)
            {
                System.out.println("Divisible by "+i);
                flag = true;
            }
        }

        if (flag)
        {
            System.out.println("The given number is not a Prime nummber");
        }
        else {
            System.out.println("The given number is a Prime nummber");
        }
    }
}
