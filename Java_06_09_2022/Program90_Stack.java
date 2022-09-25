package Java_September_October.src.Java_06_09_2022;

import java.util.Stack;

public class Program90_Stack {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push("Hello");
        s.push("World");
        s.push("YouTube");
        s.push("Whatsapp");

        System.out.println(s);
        System.out.println(s.size());
    }
}
