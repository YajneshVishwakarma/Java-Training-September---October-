package Java_September_October.src.Java_07_09_2022;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Program92_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Hello");
        lhs.add("World");
        lhs.add("hshsh");
        lhs.add("ueueue");
        lhs.add("293923");
        lhs.add("asksj");

        System.out.println(lhs);

        Iterator<String> i = lhs.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }

}
