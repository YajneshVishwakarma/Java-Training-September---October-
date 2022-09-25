package Java_September_October.src.Java_06_09_2022;

import java.util.LinkedList;

public class Program89_LinkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add("Hello");
        ll.add("World");
        ll.add("YouTube");
        ll.add("Whatsapp");

        System.out.println(ll);

        ll.add(null);
        ll.add(19.020);
        ll.add(232);

//        ll.set(0, "Start");
        ll.add(0, "Start");
        ll.add(ll.size(), "End");
        System.out.println(ll);
    }
}
