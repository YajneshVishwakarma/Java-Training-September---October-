
public class Program41 {

    String address;
    long mob;

    String degree = "Good evening";

    public void display()
    {
        System.out.println("Good Morning");
    }

    public void displayDetails() {
        System.out.println(degree);
        System.out.println(mob);
        System.out.println(address);
    }

    public static void main(String[] args) {
        Program41 p41 = new Program41();

        p41.address = "New Jersey";
        p41.mob = 9832329845l;
        p41.display();
        p41.displayDetails();
    }
}
