package Java_September_October.src.Java_02_09_2022;

public class Program69_String {
    public static void main(String[] args) {

        String str = "Hello";
        str = str.concat(" World");

        System.out.println(str);

        String s1 = "Sudeepa";
        String s2 = "Aishwarya";
        String s3 = s1.concat(" Aishwarya");

        System.out.println(s3);

        s1 = "Sahanna";

        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.lastIndexOf('a'));

        int index = s1.indexOf('a');
        index  = s1.indexOf('a',index + 1);
        System.out.println(index);
    }
}
