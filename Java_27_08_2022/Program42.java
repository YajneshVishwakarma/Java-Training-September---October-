
public class Program42 {

    String color = "Red";
    int price = 99;

    {
        System.out.println("You can send a message");
    }

    public void details()
    {
        System.out.println(color);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Program42 p42 = new Program42();

        p42.details();
    }
}
