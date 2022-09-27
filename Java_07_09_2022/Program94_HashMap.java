package Java_September_October.src.Java_07_09_2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Program94_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        HashMap<String, Integer> hashMap1 = new HashMap<>();

        hashMap.put("Yajnesh",14441);
        hashMap.put("Yajnesh1",1221);
        hashMap.put("Yajnesh2",1221);
        hashMap.put("Yajnesh3",1221);
        hashMap.put("Yajnesh4",1221);
        hashMap.put(null, null);


        hashMap1.put("wdwdjnesh",142323);
        hashMap1.put("wdwdjnesh1",12323);
        hashMap1.put("wdwdjnesh2",12323);
        hashMap1.put("wdwdjnesh3",12323);
        hashMap1.put("wdwdjnesh4",12323);

        System.out.println(hashMap);

        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            System.out.println("Key: " + map.getKey() + "\nValue: " + map.getValue());
            System.out.println();
        }

        hashMap.putAll(hashMap1);
        System.out.println(hashMap);

        System.out.println(hashMap.get("wdwdjnesh"));

        System.out.println(hashMap.keySet());

        String[] aa = new String("Hello world").split("");

        System.out.println(Arrays.toString(aa));

        for (Map.Entry<String, Integer> map : hashMap.entrySet()) {
            System.out.println(map.getKey()+" "+ map.getValue());
        }
    }
}
