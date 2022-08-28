
import java.util.Arrays;

public class Program40 {

    static double d = 10;

    static
    {
        d = 5.6;
    }

    static
    {
        System.out.println(d);
        m1();
    }

    public static void main(String[] args) {
        System.out.println(d);
//        int arr[][] = {{1,2},{2,3},{3,9}};
//
//        System.out.println(arr[0].length);
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
    }

    public static void m1()
    {
        d = 3.2;
    }
}
