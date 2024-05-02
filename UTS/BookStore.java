import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface Reviewable {
    void review();
}

abstract class Book {
    protected String title;
    protected String author;
    protected double price;
    protected int stock;

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract void displayInfo();
}

class ComicBook extends Book implements Reviewable {
    private String artist;

    public ComicBook(String title, String author, double price, int stock, String artist) {
        super(title, author, price, stock);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Artist: " + artist);
        System.out.println("Stock: " + stock);
    }

    @Override
    public void review() {
        System.out.println("Reviewing comic book: " + title);
    }
}

public class BookStore {
    private Map<String, Book> inventory;
    private Scanner scanner;

    public BookStore() {
        this.inventory = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void addBook() {
        System.out.println("Enter book details:");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        System.out.print("Stock: ");
        int stock = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Artist (for Comic Books): ");
        String artist = scanner.nextLine();

        ComicBook newComicBook = new ComicBook(title, author, price, stock, artist);
        inventory.put(title, newComicBook);
    }

    public void updateBook(String title) {
        Book book = inventory.get(title);
        if (book != null) {
            System.out.println("Enter new details for book: " + title);
            System.out.print("New Author: ");
            book.author = scanner.nextLine();
            System.out.print("New Price: ");
            book.price = scanner.nextDouble();
            System.out.print("New Stock: ");
            book.stock = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            if (book instanceof ComicBook) {
                System.out.print("New Artist: ");
                ((ComicBook) book).setArtist(scanner.nextLine()); // Use setter method
            }
            System.out.println("Book updated successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }

    public void deleteBook(String title) {
        if (inventory.containsKey(title)) {
            inventory.remove(title);
            System.out.println("Book deleted successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }

    public void sellBook(String title, int quantity) {
        Book book = inventory.get(title);
        if (book != null && book.getStock() >= quantity) {
            book.setStock(book.getStock() - quantity);
            System.out.println("Sold " + quantity + " copies of " + title);
        } else {
            System.out.println("Insufficient stock for " + title);
        }
    }

    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty!");
        } else {
            System.out.println("Current Inventory:");
            for (Book book : inventory.values()) {
                book.displayInfo();
            }
        }
    }

    public void showMenu() {
        System.out.println("\n=== Book Store Menu ===");
        System.out.println("1. List Books");
        System.out.println("2. Add Book");
        System.out.println("3. Update Book");
        System.out.println("4. Delete Book");
        System.out.println("5. Sell Book");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public void processChoice(int choice) {
        switch (choice) {
            case 1:
                displayInventory();
                break;
            case 2:
                addBook();
                break;
            case 3:
                System.out.print("Enter title of the book to update: ");
                String updateTitle = scanner.nextLine();
                updateBook(updateTitle);
                break;
            case 4:
                System.out.print("Enter title of the book to delete: ");
                String deleteTitle = scanner.nextLine();
                deleteBook(deleteTitle);
                break;
            case 5:
                System.out.print("Enter title of the book to sell: ");
                String sellTitle = scanner.nextLine();
                System.out.print("Enter quantity to sell: ");
                int sellQuantity = scanner.nextInt();
                sellBook(sellTitle, sellQuantity);
                break;
            case 6:
                System.out.println("Exiting program...");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }

    public static void main(String[] args) {
        BookStore store = new BookStore();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            store.showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            store.processChoice(choice);
        }
    }
}
