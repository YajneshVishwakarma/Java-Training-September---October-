package Java_September_October.src.Java_29_08_2022.Composition.Car;

public class Program48_Car {
    String color;
    String name;
    double price;
    Program48_Engine e;

    @Override
    public String toString()
    {
        return "Car color: "+color+"\nCar name: "+name+"\nPrice: $"+price+"\nCC: "+e.cc+"\nEngine Number: "+e.engineNo;
    }

    Program48_Car(String color, String name, double price, Program48_Engine e) {
        this.color = color;
        this.name = name;
        this.price = price;
        this.e = e;
    }

    void details()
    {
        System.out.println(this);
    }

}
