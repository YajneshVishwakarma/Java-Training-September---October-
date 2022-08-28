
public class Program38 {

    static int a = 20;

    static
    {
        System.out.println("Hello laila");
        Program38.a = 40;
        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}
