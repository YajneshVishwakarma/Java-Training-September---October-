package Java_September_October.src.Java_03_09_2022;

public class OutOfServiceException extends Exception {
    OutOfServiceException()
    {
        System.out.println("No partners found for this age group");
    }
}
