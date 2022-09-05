package Java_September_October.src.Java_01_09_2022;

public class Program66_Book {
    String name;
    String author;
    String price;

    public Program66_Book(String name, String author, String price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book Details\nBook name: "+this.name+"\nAuthor name: "+this.author+"\nPrice: "+this.price;
    }

    public static void main(String[] args) {
        Program66_Book book = new Program66_Book("How to make a lady cat fall in love with you?","Naveen","199.90");
        System.out.println(book);
    }
}
