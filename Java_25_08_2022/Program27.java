
import java.util.Scanner;

public class Program27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Find the factors of a given number");
        int factor = scan.nextInt();

        System.out.print("The factors of "+factor+" are:");
        for (int i = 1; i <= factor; i++) {
            if (factor % i == 0)
            {
                System.out.print(" "+i);
            }
        }
    }
}
