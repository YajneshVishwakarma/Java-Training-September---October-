package Java_September_October.src.Java_25_08_2022;

import java.util.Scanner;

public class Program34 {
    static double areaOfCircle(double r)
    {
        return (Math.PI * r * r);
    }
    static double areOfRect(int x, int y)
    {
        return (x * y);
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        double r = scan.nextDouble();

        System.out.println("Area of the given radius of the circle is "+areaOfCircle(r));


        System.out.println("Enter the length and breadth of the rectangle");
        int x = scan.nextInt();
        int y = scan.nextInt();

        System.out.println("Area of the given length and breadth of the rectangle is "+areOfRect(x,y));


    }
}
