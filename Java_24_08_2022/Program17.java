package Java_September_October.src.Java_24_08_2022;

import java.util.Scanner;

public class Program17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the character to check");
        char c = scan.next().charAt(0);
        char cc = c;

        c = Character.toUpperCase(c);

        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' )
        {
            System.out.println("The character "+cc+" given is a Vowel");
        }
        else
        {
            System.out.println("The character "+cc+" given is not a Vowel");
        }

    }
}
