import java.util.Arrays;

public class Program67_College {
    String name;
    String address;
    int noOfStudents;

    public String toString() {
        return "College Details:\nCollege Name: "+this.name+"\nCollege Address: "+this.address+"\nNumber of Students: "+this.noOfStudents;
    }

    public Program67_College(String name, String address, int noOfStudents) {
        this.name = name;
        this.address = address;
        this.noOfStudents = noOfStudents;
    }

    public void arr(int[] arr) {
        Arrays.fill(arr,1);
    }

    public static void main(String[] args) {
        Program67_College alvas = new Program67_College("Alvas Institute of Engineering and Technology", "Mijar", 990);
        System.out.println(alvas);

        int arr[] = new int[10];
        Arrays.fill(arr,99);

        System.out.println(Arrays.toString(arr));
        alvas.arr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
