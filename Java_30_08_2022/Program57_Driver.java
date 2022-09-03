package Java_September_October.src.Java_30_08_2022;

public class Program57_Driver {
    public static void main(String[] args) {
        Program57_Sheela sheela = new Program57_Sheela();
        System.out.println(sheela.a);
        System.out.println(sheela.b);

        Program57_Ram ram = new Program57_Ram();
        System.out.println(ram.a);
        System.out.println(ram.b);

        //Upcasting
        Program57_Sheela ram1 = new Program57_Ram();
        System.out.println(ram1.a);
        System.out.println(ram1.b);
        //Downcasting
        Program57_Ram sheela1 = (Program57_Ram) ram1;
        System.out.println(ram1.a);
        System.out.println(ram1.b);

        System.out.println(sheela1.a);
        System.out.println(sheela1.b);
    }
}
