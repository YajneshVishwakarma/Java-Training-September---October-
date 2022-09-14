import java.util.Objects;

public class Program68_Hash {
    String name;
    String address;

    public Program68_Hash(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return this.name+" "+this.address;
    }

    @Override
    public boolean equals(Object obj) {
        Program68_Hash object = (Program68_Hash) obj;
        return this.name.equals(object.name) && this.address.equals(object.address);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name,address);
    }

    public static void main(String[] args) {
        Program68_Hash hash = new Program68_Hash("Yajnesh","Manipal");
        Program68_Hash hash2 = new Program68_Hash("Yajnesh","Manipal");

        System.out.println(hash);
        System.out.println(hash.hashCode());
        System.out.println(hash.equals(hash2));
    }
}
