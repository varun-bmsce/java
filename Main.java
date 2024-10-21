import java.util.Scanner;

class Book {
    public String name; // Public member
    private String author; // Private member
    double price;
    int num_pages;

    // Constructor to initialize the Book
    public Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    // Method to display book details
    public void display() {
        System.out.println(this);
    }

    // Override toString method
    @Override
    public String toString() {
        return "Name: " + name + ", Author: " + author + ", Price: " + price + ", Pages: " + num_pages;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Number of Pages: ");
            int num_pages = sc.nextInt();
            sc.nextLine(); // Consume newline

            books[i] = new Book(name, author, price, num_pages);
        }

        System.out.println("\nBook Details:");
        for (Book book : books) {
            book.display();
        }

        sc.close();
    }
}
