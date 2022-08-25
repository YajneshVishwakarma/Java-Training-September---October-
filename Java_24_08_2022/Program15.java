package Java_September_October.src.Java_24_08_2022;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the character to check");
        char n = scan.next().charAt(0);

        if (n >= 'a' && n<='z' || n >= 'A' && n <= 'Z')
        {
            System.out.println("The given data "+n+" is an Alphabet");
        }
        else if (n >= '0' && n <= '9')
        {
            System.out.println("The given data "+n+" is an integer");
        }
        else
        {
            System.out.println("The given data "+n+" is an Special character");
        }

//        Pattern pat1 = Pattern.compile("^[0-9]*$");
//        Pattern pat2 = Pattern.compile("^[a-zA-Z0-9]*$");
//        Pattern pat3 = Pattern.compile("^[^a-zA-Z0-9]*$");
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter the data to check the Data type");
//
//        String n = scan.next();
//
//        if (pat1.matcher(String.valueOf(n)).matches())
//        {
//            System.out.println("Integer");
//        }
//        else if (pat2.matcher(String.valueOf(n)).matches())
//        {
//            System.out.println("String");
//        }
//        else if (pat3.matcher(String.valueOf(n)).matches())
//        {
//            System.out.println("Special Character");
//        }
//        else
//        {
//            System.out.println("Mixed string");
//        }

    }
}
//
//class Solution{
//    long ExtractNumber(String S){
//        //code here
//        int num = Integer.MIN_VALUE, i = 0;
//        Pattern pat = Pattern.compile("\\d*");
//        Matcher match = pat.matcher(S);
//
//        while(match.find())
//        {
////            num = (num > Integer.parseInt(match.group(i))) ? Integer.parseInt(match.group(i)) : num;
////            i++;
//            System.out.println(match.group());
//            i++;
//        }
//
//        return num;
//    }
//}
//
//public class Program15 {
//    public static void main(String[] args) {
//        System.out.println(new Solution().ExtractNumber("This is alpha 5057 and 97"));
//    }
//}