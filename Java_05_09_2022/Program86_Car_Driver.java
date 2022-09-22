package Java_September_October.src.Java_05_09_2022;

class Car
{
    String brand;
    double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Brand: "+this.brand+"\nPrice: "+this.price;
    }

    @Override
    public boolean equals(Object obj) {
        Car car = (Car) obj;
        return this.brand.equals(car.brand) && this.price == car.price;
    }


    public int compareTo(Object obj)
    {
        Car car = (Car) obj;
        return this.brand.compareTo(car.brand);
    }
}

public class Program86_Car_Driver {
    public static void main(String[] args) {
        Car jaguar = new Car("Jaguar",1_000_000);

        System.out.println(jaguar);
    }
}
