package Java_September_October.src.Java_24_08_2022;

import java.util.regex.Pattern;

public class Program19 {
    public static void main(String[] args) {
        int random;

//        for (int i = 0; ; i++) {
//            random = (int) Math.floor((Math.random()*7)+1);
//            System.out.println(random);
//
//            if(Pattern.matches("^[^1-7]$",Integer.toString(random)))
//            {
//                System.out.println("#######"+random+"##########");
//                break;
//            }
//        }

        random = (int) Math.floor((Math.random()*7)+1);


        switch (random)
        {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}
