package Java_September_October.src.Java_05_09_2022;

import java.util.Objects;

class Book
{
    String bookName;
    int id;

    public Book(String bookName, int id) {
        this.bookName = bookName;
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Book name: "+this.bookName+"\nBook ID: "+this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return (this.bookName.equals(book.bookName)) && (this.id == book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.bookName,this.id);
    }

    public int compareTo(Object obj) {
        Book b = (Book) obj;
        return this.bookName.compareTo(b.bookName);
    }
}

public class Program85_ArrayLibrary {
    static void sort(Book[] books)
    {
        for (int i = 0; i < books.length; i++) {
            for (int j = 0; j < books.length - i -1; j++) {
                if(books[j].id > books[j+1].id)
                {
                    Book temp = books[j];
                    books[j] = books[j+1];
                    books[j+1] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        Book[] book = new Book[4];


        book[0] = new Book("Angels and demons",444);
        book[1] = new Book("Demons and angels",333);
        book[2] = new Book("Angels and demons",222);
        book[3] = new Book("Demons and angels",111);

        System.out.println(book[0]);
        System.out.println(book[1]);
        System.out.println(book[0].equals(book[1]));
        System.out.println(book[1].equals(book[0]));
        System.out.println(book[0].hashCode());
        System.out.println(book[1].hashCode());

        System.out.println(book[0].compareTo(book[1]));

        sort(book);

        for (Book b: book) {
            System.out.println(b);
        }
    }
}
