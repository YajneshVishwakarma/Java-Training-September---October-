package Java_September_October.src.Java_25_08_2022;

import java.util.Scanner;

public class Program28 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the integer to check if it is a palindrome");
        int pal = scan.nextInt();
        int temp = 0, comp = pal;

        while(pal > 0)
        {
            temp = temp * 10 + (pal % 10);
            pal = pal / 10;
        }

        if(temp == comp)
        {
            System.out.println("The given integer "+temp+" is a palindrome");
        }
        else {
            System.out.println("The given integer "+temp+" is not a palindrome");
        }


    }
}
