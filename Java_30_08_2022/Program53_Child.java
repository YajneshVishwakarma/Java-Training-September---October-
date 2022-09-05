public class Program53_Child extends Program53_Parent {

    int a = 33;
    int b = 99;

    public static void main(String[] args) {
        Program53_Parent parent = new Program53_Parent();
        System.out.println(parent.a);
        System.out.println(parent.b);

        Program53_Child child = new Program53_Child();
        System.out.println(child.a);
        System.out.println(child.b);
    }
}
