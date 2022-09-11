package Java_September_October.src.Java_03_09_2022;

public class Program71_Wrapper {
    public static void main(String[] args) {

        byte byteValue = 11;
        Byte ByteValue = byteValue;

        int intValue = 99999;
        Integer IntValue = intValue;

        char charValue = 'a';
        Character characterValue = charValue;

        boolean bool = true;
        Boolean Bool = bool;

        float floatValue = 19.9f;
        Float FloatValue = floatValue;
//        floatValue = FloatValue;
//        System.out.println("================"+floatValue);

        double doubleValue = 1999.9999d;
        Double DoubleValue = doubleValue;

        System.out.println(byteValue);
        System.out.println(ByteValue +"\n");

        System.out.println(intValue);
        System.out.println(IntValue +"\n");

        System.out.println(charValue);
        System.out.println(characterValue +"\n");

        System.out.println(bool);
        System.out.println(Bool +"\n");

        System.out.println(floatValue);
        System.out.println(FloatValue +"\n");

        System.out.println(doubleValue);
        System.out.println(DoubleValue +"\n");

        byteValue = ByteValue.byteValue();
        System.out.println(byteValue);

    }
}
