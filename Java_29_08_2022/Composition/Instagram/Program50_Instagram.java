package Java_September_October.src.Java_29_08_2022;

public class Program50_Instagram {
    double version;
    Program50_User user;

    public String toString()
    {
        return "\nInstagram version: "+version+"\nUsername: "+user.username+"\nEmail ID: "+user.email+"\nPassword: "+user.pwd;
    }

    public Program50_Instagram(double version, Program50_User user) {
        this.version = version;
        this.user = user;
    }

    public void details()
    {
        System.out.println(this);
    }
}
