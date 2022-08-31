package Java_September_October.src.Java_29_08_2022.Composition.Laptop;

public class Program49_Laptop {

    String name;

    String color;
    double price;
    Program49_MotherBoard mb;

    @Override
    public String toString()
    {
        return "Laptop name: "+name+"\nLaptop color: "+color+"\nLaptop Price: $"+price+"\nMotherBoard brand: "+mb.brand+"\nMotherBoard Capacity: "+mb.capacity+"\nMotherBoard memory: "+mb.memory+" GB";
    }


    public Program49_Laptop(String name, String color, double price, Program49_MotherBoard mb) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.mb = mb;
    }

    public void details()
    {
        System.out.println(this);
    }
}
