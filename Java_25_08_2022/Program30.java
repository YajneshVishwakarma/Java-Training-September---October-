package Java_September_October.src.Java_25_08_2022;

import java.util.Scanner;

public class Program30 {
    public static int rev(int num, int temp)
    {
        while(num > 0)
        {
            temp = temp * 10 + (num % 10);
            num = num / 10;
        }

        return temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number to print in reverse");
        int temp = 0, num = scan.nextInt();

        System.out.println("The reverse of the given number "+num+" is "+rev(num, temp));
    }
}
