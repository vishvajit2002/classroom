package TestAug31;

import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}

class Library {
    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Book added: " + book);
        } else {
            System.out.println("Library is full. Can't add more books.");
        }
    }

    public void removeBook(int index) {
        if (index >= 0 && index < count) {
            books[index] = null;
            System.out.println("Book removed at index: " + index);
        } else {
            System.out.println("Invalid index. No book removed.");
        }
    }

    public void listBooks() {
        System.out.println("Books in the library:");
        for (int i = 0; i < count; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the capacity of the library: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Library library = new Library(capacity);

        for (int i = 0; i < capacity; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            System.out.print("ISBN: ");
            String ISBN = scanner.nextLine();

            library.addBook(new Book(title, author, ISBN));
        }

        System.out.println("\nBooks in the library:");
        library.listBooks();

        System.out.print("\nEnter the index of the book to remove: ");
        int index = scanner.nextInt();

        library.removeBook(index);

        System.out.println("\nBooks in the library after removal:");
        library.listBooks();

        scanner.close();
    }
}
