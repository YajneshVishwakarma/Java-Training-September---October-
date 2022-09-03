package Java_September_October.src.Java_30_08_2022;

public class Program56_College {
    String name;
    String place;

    @Override
    public String toString()
    {
        return "College Name: "+this.name+"\nCollege Place: "+this.place;
    }

    Program56_College(String name, String place) {
        this.name = name;
        this.place = place;
    }

    void details() {
        System.out.println(this);
    }
}
