package Java_September_October.src.Java_30_08_2022;

public class Program54_Aeroplane extends Program54_Vehicle {
    void takeOff() {
        System.out.println("Flight is taking off");
    }

    public static void main(String[] args) {
        Program54_Vehicle vehicle = new Program54_Vehicle();
        System.out.println(vehicle.engine);
        System.out.println(vehicle.steering);
        vehicle.goForward();
        vehicle.accelerate();

        Program54_Aeroplane aeroplane = new Program54_Aeroplane();
        aeroplane.engine = "Aeroplane engine";
        aeroplane.steering = "2 steerings";

        System.out.println(aeroplane.engine);
        System.out.println(aeroplane.steering);
        aeroplane.goForward();
        aeroplane.accelerate();
        aeroplane.takeOff();


    }
}
