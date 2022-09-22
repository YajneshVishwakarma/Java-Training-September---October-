package Java_September_October.src.Java_05_09_2022;

import java.util.Scanner;

//Write a java program to read N number of elements from the user to store it and then print it.

public class Program84_IntegerArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = scan.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        for (int i: array) {
            System.out.println(i+" ");
        }
    }
}
