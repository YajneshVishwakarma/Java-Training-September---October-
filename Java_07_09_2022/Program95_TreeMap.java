package Java_September_October.src.Java_07_09_2022;

import java.util.TreeMap;

public class Program95_TreeMap {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1, "aaaaaa");
        treeMap.put(2, "bbbbbb");
        treeMap.put(3, "cccccc");
        treeMap.put(4, "dddddddd");
        treeMap.put(5, "eeeeee");
        treeMap.put(6, "ffffff");
        treeMap.put(7, "gggggg");

        System.out.println(treeMap);

        treeMap.remove(3);

        System.out.println(treeMap);

    }
}
