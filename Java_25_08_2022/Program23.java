
import java.util.Scanner;

public class Program23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the N value up to which you want to print");
        int sum = 0,n = scan.nextInt();

        for (int i = 1; i <= n; i++)
        {
            System.out.printf("%5d",i);
            if (i % 10 == 0)
                System.out.println();
        }

        System.out.println("\nEnter the N value to which you want to print the sum");
        n = scan.nextInt();

        for (int i = 1; i <=n ; i++) {
            sum += i;
        }

        System.out.println("The Sum of the N elements are "+sum);
    }
}
