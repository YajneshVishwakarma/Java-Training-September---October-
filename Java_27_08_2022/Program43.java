package Java_September_October.src.Java_27_08_2022;

class Eraser
{
    String name;
    String color;
    double price;

    Eraser()
    {

    }

    Eraser(String name)
    {
        this.name = name;
    }

    Eraser(String name, String color) {
        this(name);
        this.color = color;
    }

    Eraser(String name, String color, double price) {
        this(name, color);
        this.price = price;
    }

    public void details() {
        System.out.println(name);
        System.out.println(color);
        System.out.println(price);
    }
}

public class Program43 {
    public static void main(String[] args) {
        Eraser ers  = new Eraser("Nyaveen","Black",22);
        ers.details();
    }
}
