import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String location;
    private List<Book> books;

    public Library(String name, String location) {
        this.name = name;
        this.location = location;
        this.books = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", books=" + books +
                '}';
    }

    public static void main(String[] args) {
        Library library = new Library("Central Library", "Main Street");
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        library.addBook(book1);
        library.addBook(book2);

        System.out.println(library);
    }
}