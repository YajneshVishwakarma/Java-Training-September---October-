public class Program52_Mobile {
    int ram;
    int rom;

    Program52_Smartwatch sw = null;

    @Override
    public String toString() {
        return "Mobile RAM: "+ram+"\nMobile ROM: "+rom+" GB\nSmartwatch brand: "+this.sw.brand+" GB\nSmartwatch color: "+this.sw.color+"\nSmartwatch price: "+this.sw.price;
    }

    public Program52_Mobile(int ram, int rom) {
        this.ram = ram;
        this.rom = rom;
    }

    public void connectWatch(Program52_Smartwatch sw) {
        if (this.sw != null) {
            System.out.println("Smartwatch already present");
        }
        else
        {
            this.sw = sw;
            System.out.println("Smartwatch paired!!");
        }
    }

    public void disconnectWatch() {
        if (this.sw == null) {
            System.out.println("Smartwatch already disconnected");
        }
        else
        {
            this.sw = null;
            System.out.println("Smartwatch unpaired!!");
        }
    }


    public void details() {
        System.out.println(this);
    }
}
