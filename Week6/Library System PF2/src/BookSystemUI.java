import java.util.ArrayList;
import java.util.Scanner;

public class BookSystemUI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Book> listOfBooks = new ArrayList<>();
        int choice;

        do {
            displayMenu();
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    addBook(input, listOfBooks);
                    break;
                case 2:
                    viewBooks(listOfBooks);
                    break;
                case 3:
                    updateBookPrice(input, listOfBooks);
                    break;
                case 4:
                    removeBook(input, listOfBooks);
                    break;
                case 5:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

    }

    public static void displayMenu() {
        System.out.println("\n=== Library System Menu (CRUD) ===");
        System.out.println("1. Add Book");
        System.out.println("2. View All Books");
        System.out.println("3. Update Book Price");
        System.out.println("4. Remove Book");
        System.out.println("5. Exit");
        System.out.print("Enter choice: ");
    }

    public static void addBook(Scanner input, ArrayList<Book> listOfBooks) {
        System.out.print("Enter title: ");
        String title = input.nextLine();

        System.out.print("Enter author: ");
        String author = input.nextLine();

        System.out.print("Enter ISBN: ");
        String isbn = input.nextLine();

        System.out.print("Enter price: ");
        double price = input.nextDouble();
        input.nextLine();

        listOfBooks.add(new Book(title, author, isbn, price));
        System.out.println("Book added.");
    }

    public static void viewBooks(ArrayList<Book> listOfBooks) {
        if (listOfBooks.size() == 0) {
            System.out.println("No books stored.");
            return;
        }

        for (int i = 0; i < listOfBooks.size(); i++) {
            System.out.println("Index " + i + ": " + listOfBooks.get(i));
        }
    }

    public static void updateBookPrice(Scanner input, ArrayList<Book> listOfBooks) {
        if (listOfBooks.size() == 0) {
            System.out.println("No books stored.");
            return;
        }

        System.out.print("Enter book index: ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 0 || index >= listOfBooks.size()) {
            System.out.println("Invalid index.");
            return;
        }

        System.out.print("Enter new price: ");
        double newPrice = input.nextDouble();
        input.nextLine();

        listOfBooks.get(index).setPrice(newPrice);
        System.out.println("Price updated.");
    }

    public static void removeBook(Scanner input, ArrayList<Book> listOfBooks) {
        if (listOfBooks.size() == 0) {
            System.out.println("No books stored.");
            return;
        }

        System.out.print("Enter book index: ");
        int index = input.nextInt();
        input.nextLine();

        if (index < 0 || index >= listOfBooks.size()) {
            System.out.println("Invalid index.");
            return;
        }

        listOfBooks.remove(index);
        System.out.println("Book removed.");
    }
}
