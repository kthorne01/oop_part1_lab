import java.util.List;
import java.util.ArrayList;

public class Person {
    // Class variables
    private String name; // Person's name
    private int age; // Person's age
    private String address; // Person's address
    private String email; // Person's email
    private double balance; // Person's monetary balance
    private boolean isMember; // Lets us know if the person is a bookstore member
    private List<String> borrowedBooks; // List of borrowed book titles
    private List<String> purchasedBooks; // List of purchased book titles
    private int totalBooksPurchased; // Total number of books purchased
    private double spending; // Total spending in the bookstore
    private boolean isEmployee; // Lets us know if the person is an employee of the bookstore

    // Constructor
    public Person(String name, int age, String address, String email) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        // Can initialize other fields if necessary
    }

    public void addBalance(double amount) {
        this.balance += amount;
        // Additional logic (if any) for adding to balance
    }

    public int getTotalBooksPurchased() {
        return this.totalBooksPurchased;
    }

    // Update the purchaseBook method to increment totalBooksPurchased

    public void purchaseBook(String bookTitle, double price) {
        if (this.balance >= price) {
            this.balance -= price; // Deduct the price from the balance
            this.spending += price; // Increase total spending
            if (purchasedBooks == null) {
                purchasedBooks = new ArrayList<>(); // Initialize if null
            }
            purchasedBooks.add(bookTitle); // Add the book to the purchased list
        } else {
            // Handle the case where the balance is insufficient
        }
    }

}
