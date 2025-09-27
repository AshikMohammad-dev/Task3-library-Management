import java.awt.print.Book;
import java.util.ArrayList;

public class library {
    private ArrayList<book> books = new ArrayList<>();

    public void addBook(book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("\n Available Books:");
        for (book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(String title) {
        for (book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issue();
                System.out.println("Book issued: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not available or already issued!");
    }

    public void returnBook(String title) {
        for (book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned: " + book.getTitle());
                return;
            }
        }
        System.out.println("This book was not issued.");
    }
}
