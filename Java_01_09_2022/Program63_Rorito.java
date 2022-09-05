package Java_September_October.src.Java_01_09_2022;

public class Program63_Rorito extends Program63_Pen {
    @Override
    public void Pen() {
        System.out.println("Rorito created");
    }

    public static void main(String[] args) {
        Program63_Pen roritoPen = new Program63_Rorito();
        roritoPen.Pen();

        Program63_Rorito rorito = new Program63_Rorito();
        rorito.display();
    }
}
