package Java_September_October.src.Java_05_09_2022;

public class Program83_Arrays {
    public static void main(String[] args) {
        String[] arr = new String[10];

        for (String i : arr) {
            System.out.print(i+" ");
        }

        int[] a = {1,2,3,4,5,6,7,8,9,0};
        System.out.println();

        for (int i : a) {
            System.out.print(i + " ");
        }

        a[0] = 999;
        a[1] = 999;
        a[2] = 999;
        a[3] = 999;
        a[4] = 999;
        a[9] = 999;

        System.out.println();

        for (int i : a) {
                System.out.print(i+" ");
        }

        String[] str = {"apple","banana","mango","strawberry"};
        System.out.println();

        for (String i : str) {
            System.out.print(i+" ");
        }
    }
}
