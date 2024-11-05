import java.util.*;
class Book{
    private String title;
    private String author;
    private double price;
    private String ISBN;

    //constructor
    public Book(String title, String author, double price, String ISBN){
        this.title = title;
        this.author = author;
        this.price = price;
        this. ISBN = ISBN;
    }

    //getter and setter
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getISBN(){
        return ISBN;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    // Method to apply a discount
    public void applyDiscount(double discountPercentage) {
        if(discountPercentage > 0 && discountPercentage <= 100) {
            this.price = this.price - (this.price * discountPercentage / 100);
        } else {
            System.out.println("Invalid discount percentage. Please enter a value between 0 and 100.");
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("ISBN: " + ISBN);
    }


}
public class BookManagementSystem {
    public static void main(String[] args){
        Book book = new Book("Effective Java", "Joshua Bloch", 45.99, "978-0134685991");
        // Displaying book details before applying discount
        book.displayBookDetails();

        // Applying a 10% discount
        book.applyDiscount(10);

        // Displaying book details after applying discount
        System.out.println("\nAfter applying 10% discount:");
        book.displayBookDetails();
    }
}
