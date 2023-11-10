import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


public class Bookstore {
    // Class variables
    private String name; // Name of the bookstore
    private int capacity; // Maximum number of books the bookstore can hold
    private int currentBookCount; // Current number of books in the bookstore
    private boolean isOpen; // Indicates if the bookstore is open or closed
    private double dailyRevenue; // Total revenue for the current day
    private List<String> bookTitles; // List of book titles available
    private Map<String, Integer> bookPrices; // Maps book titles to their prices
    private Map<String, Integer> bookStock; // Maps book titles to their stock numbers
    private int totalEmployees; // Total number of employees in the bookstore
    private String location; // Location of the bookstore

    // Constructor
    public Bookstore(String name, int capacity, String location) {
        this.name = name;
        this.capacity = capacity;
        this.location = location;
        this.currentBookCount = 0;
        this.isOpen = false;
        this.dailyRevenue = 0.0;
        this.bookTitles = new ArrayList<>();
        this.bookPrices = new HashMap<>();
        this.bookStock = new HashMap<>();
        this.totalEmployees = 0;
    }

    // Methods

    // Opens the bookstore
    public void openStore() {
        isOpen = true;
        // Additional logic for opening the store can be added here
    }

    // Closes the bookstore
    public void closeStore() {
        isOpen = false;
        // Additional logic for closing the store can be added here
    }

    // Adds a book to the bookstore
    public void addBook(String title, int price, int stock) {
        if (currentBookCount + stock <= capacity) {
            bookTitles.add(title);
            bookPrices.put(title, price);
            bookStock.put(title, stock);
            currentBookCount += stock;
        } else {
            // Handle the case where adding books would exceed capacity
        }
    }

    // Sells a book and updates revenue
    public boolean sellBook(String title) {
        if (isOpen && bookStock.getOrDefault(title, 0) > 0) {
            bookStock.put(title, bookStock.get(title) - 1);
            dailyRevenue += bookPrices.get(title);
            return true;
        } else {
            // Handle the case where the book is out of stock or store is closed
            return false;
        }
    }

    // Restocks a book
    public void restockBook(String title, int additionalStock) {
        if (bookStock.containsKey(title)) {
            int newStock = bookStock.get(title) + additionalStock;
            if (currentBookCount - bookStock.get(title) + newStock <= capacity) {
                bookStock.put(title, newStock);
                currentBookCount = currentBookCount - bookStock.get(title) + newStock;
            } else {
                // Handle the case where restocking would exceed capacity
            }
        } else {
            // Handle the case where the book does not exist
        }
    }

    // Calculates and returns total revenue
    public double calculateRevenue() {
        return dailyRevenue;
    }

    // Hires an employee
    public void hireEmployee() {
        totalEmployees++;
        // Additional logic for hiring an employee can be added here
    }

    // Fires an employee
    public void fireEmployee() {
        if (totalEmployees > 0) {
            totalEmployees--;
            // Additional logic for firing an employee can be added here
        } else {
            // Handle the case where there are no employees to fire
        }
    }

    // Gets the total number of books in the store
    public int getTotalBooks() {
        return currentBookCount;
    }

    // Gets the total number of employees
    public int getTotalEmployees() {
        return totalEmployees;
    }
}

