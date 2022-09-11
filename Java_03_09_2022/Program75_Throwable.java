package Java_September_October.src.Java_03_09_2022;

public class Program75_Throwable {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (Throwable e) {
            System.out.println("Exiting program");
        }
    }
}
