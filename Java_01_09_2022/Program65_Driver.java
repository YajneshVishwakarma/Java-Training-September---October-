package Java_September_October.src.Java_01_09_2022;

public class Program65_Driver extends Program65_Class implements Program65_Interface
{
    @Override
    public void m1() {
        System.out.println("M1 called from Interface");
    }

    @Override
    public void m2() {
        System.out.println("M2 called from Class");
    }

    public static void main(String[] args) {
        Program64_InterfaceDriver interfaceDriver = new Program64_InterfaceDriver();

        interfaceDriver.m1();
        interfaceDriver.m2();

//        interfaceDriver.m3();
    }
}
