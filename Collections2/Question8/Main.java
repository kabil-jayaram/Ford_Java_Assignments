package Collections2.Question8;

import java.util.*;

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

public class Main {
    public static void main(String[] args) {
        Set<Book> bookShelf = new TreeSet<>(Comparator.comparingInt(Book::getPublicationYear).reversed());
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("BookShelf Operations");
            System.out.println("1 - Add Book");
            System.out.println("2 - Remove Book");
            System.out.println("3 - Display all Book");
            System.out.println("4 - Exit");
            System.out.print("Enter the choice: ");
            try {
                int ch = scanner.nextInt();
                scanner.nextLine();
                switch (ch) {
                    case 1:
                        System.out.println("Enter Book Title, Author and Publication Year to add: ");
                        String title = scanner.nextLine();
                        String author = scanner.nextLine();
                        int publicationYear = scanner.nextInt();
                        scanner.nextLine();
                        Book book = new Book(title, author, publicationYear);
                        bookShelf.add(book);
                        System.out.println("Book added: " + title + " by " + author + " (Year: " + publicationYear + ")");
                        break;
                    case 2:
                        System.out.print("Enter Book Publication Year to remove: ");
                        publicationYear = scanner.nextInt();
                        boolean flag = true;
                        for(Book currentBook : bookShelf) {
                            if(currentBook.getPublicationYear() == publicationYear) {
                                bookShelf.remove(currentBook);
                                System.out.println("Book with publication year " + publicationYear + " removed from the bookshelf");
                                flag = false;
                                break;
                            }
                        }
                        if(flag)
                            System.out.println("Book with publication year " + publicationYear + " not found in the bookshelf");
                        break;
                    case 3:
                        if(!bookShelf.isEmpty()) {
                            System.out.println("Books in descending order of ID: ");
                            for(Book currentBook : bookShelf)
                                System.out.println(currentBook.getPublicationYear() + " - " + currentBook.getTitle() + " by " + currentBook.getAuthor());
                        } else
                            System.out.println("BookShelf is empty");
                        break;
                    case 4:
                        System.out.println("Exiting the program.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between  1 and  4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
        }
    }
}
