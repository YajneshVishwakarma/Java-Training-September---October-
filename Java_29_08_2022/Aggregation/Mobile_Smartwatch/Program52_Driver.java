import java.util.Arrays;
import java.util.Hashtable;

public class Program52_Driver {
    public static void main(String[] args) {
        Program52_Mobile mobile = new Program52_Mobile(16, 256);
        mobile.connectWatch(new Program52_Smartwatch("Apple","Black",29999));
        mobile.details();
        mobile.disconnectWatch();


//        Hashtable<String, String> hash = new Hashtable<>();
//        hash.put("38383","jdjdjjd");
//        System.out.println(hash);
//        hash.clear();
//        System.out.println(hash);
//        int[] arr = new int[256];
//        Arrays.fill(arr,0);
//
//        String str = "asdfgahjkl";
//
//        for (int i = 0; i < str.length(); i++) {
//            if(arr[str.charAt(i)] == 1)
//            {
//                System.out.println(str.charAt(i));
//                break;
//            }
//            else
//            {
//                arr[str.charAt(i)] = 1;
//            }
//        }

    }
}
