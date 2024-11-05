import java.util.*;
class Book{
    private String title;
    private String author;
    private boolean isAvailable;

    //constructor
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.isAvailable = false;
    }

    //getter and setter
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isAvailable(){
        return isAvailable;
    }

    public void available(){
        this.isAvailable = true;
    }
    public void returnBook(){
        this.isAvailable = false;
    }
    public void displayDetails(){
        System.out.println("Title: " + title + ", Author: " + author + ", Status: " + (isAvailable ? "Issued" : "Available"));
    }
}

class Member{
    private String memberId;
    private String name;

    // Constructor
    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    // Getters
    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    // Display member details
    public void displayDetails() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
    }
}

class Library{
    private List<Book> bookList;
    private List<Member> memberList;

    // Constructor
    public Library() {
        bookList = new ArrayList<>();
        memberList = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        bookList.add(book);
    }

    // Method to add a member to the library
    public void addMember(Member member) {
        memberList.add(member);
    }

    // Method to issue a book to a member
    public void issueBook(String title, String memberId) {
        Book book = findBookByTitle(title);
        Member member = findMemberById(memberId);

        if (book != null && member != null) {
            if (!book.isAvailable()) {
                book.available();
                System.out.println("Book '" + book.getTitle() + "' has been issued to " + member.getName());
            } else {
                System.out.println("Book '" + book.getTitle() + "' is already issued.");
            }
        } else {
            if (book == null) {
                System.out.println("Book with title '" + title + "' not found.");
            }
            if (member == null) {
                System.out.println("Member with ID '" + memberId + "' not found.");
            }
        }
    }

    // Method to return a book
    public void returnBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null && book.isAvailable()) {
            book.returnBook();
            System.out.println("Book '" + book.getTitle() + "' has been returned.");
        } else {
            System.out.println("Book '" + title + "' is either not issued or not available.");
        }
    }

    // Method to search books by title
    public Book findBookByTitle(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Method to search books by author
    public void searchBooksByAuthor(String author) {
        boolean found = false;
        for (Book book : bookList) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                book.displayDetails();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by author '" + author + "'.");
        }
    }

    // Method to display all books
    public void displayAllBooks() {
        for (Book book : bookList) {
            book.displayDetails();
        }
    }

    // Method to find a member by ID
    private Member findMemberById(String memberId) {
        for (Member member : memberList) {
            if (member.getMemberId().equalsIgnoreCase(memberId)) {
                return member;
            }
        }
        return null;
    }

    // Method to display all members
    public void displayAllMembers() {
        for (Member member : memberList) {
            member.displayDetails();
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args){
        Library library = new Library();

        // Add some books to the library
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("1984", "George Orwell"));

        // Add some members to the library
        library.addMember(new Member("M001", "Alice Smith"));
        library.addMember(new Member("M002", "Bob Johnson"));

        // Display all books
        System.out.println("All Books:");
        library.displayAllBooks();

        // Display all members
        System.out.println("\nAll Members:");
        library.displayAllMembers();

        // Issue a book to a member
        System.out.println("\nIssuing a book:");
        library.issueBook("1984", "M001");

        // Try to issue the same book again
        System.out.println("\nIssuing the same book again:");
        library.issueBook("1984", "M002");

        // Return the book
        System.out.println("\nReturning the book:");
        library.returnBook("1984");

        // Search books by author
        System.out.println("\nSearching books by author 'Harper Lee':");
        library.searchBooksByAuthor("Harper Lee");

        // Search books by author that doesn't exist
        System.out.println("\nSearching books by author 'Piyush Anand':");
        library.searchBooksByAuthor("Piyush Anand");
    }
}
