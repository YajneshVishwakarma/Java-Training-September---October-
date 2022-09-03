package Java_September_October.src.Java_30_08_2022;

public class Program58_Super_Driver {
    public static void main(String[] args) {
        Program58_Super_Vegetable parent  = new Program58_Super_Vegetable("Vegetables","green/white/red");
        System.out.println(parent.name);
        System.out.println(parent.color);

        Program58_Super_Tomato child = new Program58_Super_Tomato("Tomato","Red", "9.00");
        System.out.println(child.name);
        System.out.println(child.color);
        System.out.println(child.price);

    }
}
