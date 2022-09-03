package Java_September_October.src.Java_30_08_2022.Overriding;

public class Program60_Driver {
    public static void main(String[] args) {
        Program60_Vtu vtu = new Program60_Vtu();

        vtu.display();

        Program60_Alvas alvas = new Program60_Alvas();
        alvas.display();

        Program60_Vtu vtu2 = new Program60_Alvas();
        vtu2.display();
    }
}
