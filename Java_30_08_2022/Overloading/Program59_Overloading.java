package Java_September_October.src.Java_30_08_2022.Overloading;

public class Program59_Overloading {
    public static void login(String userName, int passwd) {
        System.out.println("Logged in using username & passwd");
    }

    public static void login(long phoneNo, int otp) {
        System.out.println("Logged in using Phone number & OTP");
    }

    public static void login(String mailId, String passwd) {
        System.out.println("Logged in using Mail ID & passwd");
    }

    public static void main(String[] args) {
        Program59_Overloading overloading = new Program59_Overloading();
        overloading.login("Yash", 420);
        overloading.login(8808334433l, 901);
        overloading.login("ShettyYash1111@gmail.com", "Angela_Angela");
    }
}
