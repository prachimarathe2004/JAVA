class Book {
    String title;
    String author;
    double price;
    
    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "Prachi", 250);
        Book book2 = new Book("Spring Boot", "John", 300);

        book1.displayBook();
        book2.displayBook();
    }
}
