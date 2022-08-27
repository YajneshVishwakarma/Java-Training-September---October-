
import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number you want to find the factorial of");
        long fact = 1, n = scan.nextLong();

        if (n == 0 || n == 1) {
            fact = 1;
        }
        else
        {
            for (int i = 2; i <= n; i++) {
                fact *= i;
                System.out.println(fact);
            }
        }

        if (n >= 0)
        {
            System.out.println("The factorial of the number N is "+fact);
        }
        else
        {
            System.out.println("#### The number N is invalid ####");
        }
    }
}
