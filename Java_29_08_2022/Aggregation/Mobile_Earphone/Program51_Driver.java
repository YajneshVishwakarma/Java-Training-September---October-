import java.util.Scanner;

public class Program51_Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Mobile brand and price");
        String brand = scan.nextLine();
        double price = scan.nextDouble();
        Program51_Mobile mobile = new Program51_Mobile(brand, price);

        System.out.println("Enter the Earphone brand, color, price");
        brand = scan.nextLine();
        String color = scan.nextLine();
        scan.nextLine();
        price = scan.nextDouble();

        mobile.insertEarphone(new Program51_Earphone(brand, color, price));
        mobile.details();
    }

}
