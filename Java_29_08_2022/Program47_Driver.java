package Java_September_October.src.Java_29_08_2022;

import java.util.Scanner;

public class Program47_Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Swiggy swiggy = new Swiggy();

        System.out.println("Enter the Hotel name");
        String hotelName = scan.nextLine();
        swiggy.setHotelName(hotelName);

        System.out.println("Enter the GST number");
        int gstNo = scan.nextInt();
        swiggy.setGstNo(gstNo);

        System.out.println("Enter the Address");
        String address = scan.nextLine();
        scan.nextLine();
        swiggy.setAddress(address);

        System.out.println("Enter the Bill");
        String bill = scan.nextLine();
        swiggy.setBill(bill);

        swiggy.details();

    }
}
