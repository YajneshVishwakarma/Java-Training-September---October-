
public class Program61_Bike extends Program61_Vehicle {
    public int getNoOfWheels()
    {
        return 2;
    }

    public static void main(String[] args) {
        Program61_Vehicle vehicle = new Program61_Bike();
        System.out.println("The number of wheels in the bike is "+vehicle.getNoOfWheels());
    }
}
