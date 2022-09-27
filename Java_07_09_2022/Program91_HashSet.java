package Java_September_October.src.Java_07_09_2022;

import java.util.HashSet;

public class Program91_HashSet {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        hashSet.add(22);
        hashSet.add(22);
        hashSet.add(34);
        hashSet.add(99);
        hashSet.add(220);
        hashSet.add("23");
        hashSet.add("23");

        HashSet hashSet2 = new HashSet();

        hashSet2.add("23");
        hashSet2.add(222);
        hashSet2.add(354);
        hashSet2.add(993);
        hashSet2.add(2420);
        hashSet2.add("23");
        hashSet2.add("23");

        System.out.println(hashSet);
        System.out.println(hashSet2);

        hashSet.addAll(hashSet2);
        System.out.println(hashSet);

        System.out.println(hashSet.equals(hashSet2));

        String name = "Yajnesh";
        System.out.println(name.contains("nes"));

        System.out.println(name.getClass().getSimpleName().equals("String"));
        System.out.println(hashSet.contains("23"));

        for (Object obj: hashSet) {
            System.out.print(obj+" ");
        }
        System.out.println();

        hashSet.remove("23");
        System.out.println(hashSet);
    }
}
