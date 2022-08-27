package Java_September_October.src.Java_25_08_2022;

import java.util.Scanner;

public class Program35 {

    static void display(double percentage1, double marks1, double percentage2, double marks2)
    {
        System.out.println("The highest percentage and marks between the two are " + (percentage1 > percentage2 ? percentage1+"% "+marks1 : percentage2+"% "+marks2)+" marks");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the percentage and marks of student1");
        double percentage1 = scan.nextDouble();
        double marks1 = scan.nextDouble();

        System.out.println("Enter the percentage and marks of student2");
        double percentage2 = scan.nextDouble();
        double marks2 = scan.nextDouble();

        display(percentage1, marks1, percentage2, marks2);


    }
}
