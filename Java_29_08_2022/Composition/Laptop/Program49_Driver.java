package Java_September_October.src.Java_29_08_2022.Composition.Laptop;

import java.util.Scanner;

public class Program49_Driver {
    public static void main(String[] args) {

        Program49_Laptop laptop = new Program49_Laptop("Asus", "Black", 59999.00, new Program49_MotherBoard("Intel", 499999, 500));
        laptop.details();
    }
}
