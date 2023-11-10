
public class BookstoreApp {
    public static void main(String[] args) {
        // Create a bookstore instance
        Bookstore myBookstore = new Bookstore("My Bookstore", 500, "123 Main Street");

        // Open the bookstore
        myBookstore.openStore();

        // Add some books
        myBookstore.addBook("The Great Gatsby", 10, 5);
        myBookstore.addBook("1984", 15, 3);

        // Create a customer
        Person customer = new Person("John Doe", 30, "456 Elm Street", "john@example.com");
        customer.addBalance(50); // Add some balance to the customer's account

        // Customer buys a book
        if (myBookstore.sellBook("The Great Gatsby")) {
            customer.purchaseBook("The Great Gatsby", 10);
        }

        // Display bookstore and customer details
        System.out.println("Total revenue of bookstore: " + myBookstore.calculateRevenue());
        System.out.println("Total books purchased by customer: " + customer.getTotalBooksPurchased());

        // Close the bookstore
        myBookstore.closeStore();
    }
}

