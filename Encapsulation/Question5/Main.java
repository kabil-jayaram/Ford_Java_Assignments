package Encapsulation.Question5;

class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }
}

class Library {
    private Book[] books;
    private static int index = 0;

    public Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(Book book) {
        books[index++] = book;
        System.out.println(book.getTitle() + " added to library");
    }

    public Book findBookByISBN(String ISBN) {
        for(Book book : books) {
            if(book.getISBN() == ISBN)
                return book;
        }
        return null;
    }

    public void displayBooks() {
        System.out.print("Books in library: ");
        for(Book book : books) {
            if(book != null)
                System.out.println(book.getTitle() + " " + book.getAuthor() + " " + book.getISBN());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Library library = new Library(10);
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780141182636");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0061120081");

        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();
        Book foundBook = library.findBookByISBN("0061120081");
        System.out.println("Found Book: " + foundBook.getTitle());
    }
}
