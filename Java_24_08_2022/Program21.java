package Java_September_October.src.Java_24_08_2022;

import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("1.IDLY\n2.DOSA\n3.VADA\n4.TEA");
    int ch = scan.nextInt();

    switch(ch)
    {
        case 1 -> {
            System.out.println("IDLY is on the way");
        }

        case 2 -> {
            System.out.println("DOSA is on the way");
        }

        case 3 -> {
            System.out.println("VADA is on the way");
        }

        case 4 -> {
            System.out.println("TEA is on the way");
        }

        default -> {
            System.out.println("INVALID");
        }
    }
    }
}
