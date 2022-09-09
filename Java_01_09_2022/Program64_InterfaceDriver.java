
public class Program64_InterfaceDriver implements Program64_Interface2{
    @Override
    public void m1() {
        System.out.println("M1 called");
    }

    @Override
    public void m2() {
        System.out.println("M2 called");
    }

    public static void main(String[] args) {
        Program64_InterfaceDriver interfaceDriver = new Program64_InterfaceDriver();
        interfaceDriver.m1();
        interfaceDriver.m2();
    }

}
