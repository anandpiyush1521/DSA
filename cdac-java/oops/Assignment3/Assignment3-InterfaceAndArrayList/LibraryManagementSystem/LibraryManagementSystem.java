import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    private ArrayList<Book> bookCollection;

    // Constructor
    public LibraryManagementSystem() {
        bookCollection = new ArrayList<>();
    }

    // Method to add a new book
    public void addBook(Book book) {
        bookCollection.add(book);
        System.out.println("Book added: " + book);
    }

    // Method to remove a book based on its ISBN
    public void removeBook(String isbn) {
        for (int i = 0; i < bookCollection.size(); i++) {
            if (bookCollection.get(i).getIsbn().equals(isbn)) {
                System.out.println("Book removed: " + bookCollection.get(i));
                bookCollection.remove(i);
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    // Method to search for a book by title
    public Book searchBook(String title) {
        for (Book book : bookCollection) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Return null if not found
    }

    // Method to display all books in the collection
    public void displayAllBooks() {
        if (bookCollection.isEmpty()) {
            System.out.println("No books in the collection.");
            return;
        }
        System.out.println("Books in the collection:");
        for (Book book : bookCollection) {
            System.out.println(book);
        }
    }

    // Main method for testing the Library Management System
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("Enter title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter publication year: ");
                    int publicationYear = scanner.nextInt();
                    library.addBook(new Book(title, author, isbn, publicationYear));
                    break;
                case 2:
                    // Remove Book
                    System.out.print("Enter ISBN of the book to remove: ");
                    String isbnToRemove = scanner.nextLine();
                    library.removeBook(isbnToRemove);
                    break;
                case 3:
                    // Search Book
                    System.out.print("Enter title of the book to search: ");
                    String searchTitle = scanner.nextLine();
                    Book foundBook = library.searchBook(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Found book: " + foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    // Display All Books
                    library.displayAllBooks();
                    break;
                case 5:
                    System.out.println("Exiting the system.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
