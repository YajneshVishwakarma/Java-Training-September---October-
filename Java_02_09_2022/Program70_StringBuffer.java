public class Program70_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Pushvin");
        StringBuffer sb2 = new StringBuffer("Pushvin");
        StringBuffer sb3 = sb1;


        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb3 == sb1);

        StringBuffer h = new StringBuffer("Hello");
        StringBuffer w = new StringBuffer(" World");

        h.append(w);
        w = h;
        System.out.println(h);
        System.out.println(w);
        h.append(" Appended String");
        System.out.println(h);
        System.out.println(w);
        System.out.println(w == h);
    }
}
