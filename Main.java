import java.awt.print.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        library library = new library();

        // Adding some books
        library.addBook(new book("Java Basics", "James Gosling"));
        library.addBook(new book("Effective Java", "Joshua Bloch"));
        library.addBook(new book("Clean Code", "Robert C. Martin"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    library.showBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = scanner.nextLine();
                    library.issueBook(issueTitle);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    return;
                default:
                    System.out.println(" Invalid option! Try again.");
            }
        }
    }
}
