package Java_September_October.src.Java_30_08_2022;

public class Program56_CollegeDriver {
    public static void main(String[] args) {
        Program56_College college = new Program56_College("Alvas", "Mijar");

        Program56_College college1 = college;
        Program56_College college2 = college1;

        college2.details();

        college2.place = "Moodubidre";

        college2.details();
    }
}
