package Java_September_October.src.Java_29_08_2022.Aggregation.Mobile_Earphone;

public class Program51_Mobile {
    String brand;
    double price;

    Program51_Earphone e;

    @Override
    public String toString() {
        return "Mobile brand: "+this.brand+"\nMobile Price: "+this.price+"\nEarphone brand: "+e.brand+"\nEarphone price: "+e.price;
    }

    Program51_Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void insertEarphone(Program51_Earphone e)
    {
        if (this.e == null) {
            this.e = e;
            System.out.println("Earphone is inserted successful");
        }
        else {
            System.out.println("Earphone already exists!!");
        }
    }

    public void removeEarphone(Program51_Earphone e)
    {
        if (this.e == null) {
            System.out.println("Earphone object does not exist");
        }
        else {
            this.e = null;
            System.out.println("Earphone is removed successfully");
        }
    }

    public void details() {
        if (this.e == null) {
            System.out.println("No earphone is found to show details");
        }
        else {
            System.out.println(this);
        }
    }
}
