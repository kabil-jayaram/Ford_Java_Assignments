package Interfaces.Question1;

interface LibraryItem {
    public int getId();
    public boolean getAvailable();
    public void setAvailable(boolean available);
}

interface LibraryUser {
    public void borrow(int id, LibraryItem libraryItem);
    public void returnItem(int id, LibraryItem libraryItem);
}

class Book implements LibraryItem {
    private int id;
    private boolean available = true;

    public Book(int id) {
        this.id = id;
        System.out.println("Creating a Book with ID " + this.id);
    }
    public int getId() {
        return id;
    }

    public boolean getAvailable() {
        return available;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class DVD implements LibraryItem{
    private int id;
    private boolean available = true;

    private String type;

    public DVD(int id, String type) {
        this.id = id;
        this.type = type;
        System.out.println("Creating a DVD with ID " + this.id);
    }

    public int getId() {
        return id;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class LibraryMember implements LibraryUser {
    private int id;
    private String name;

    public LibraryMember(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void borrow(int id, LibraryItem libraryItem) {
        if(libraryItem instanceof Book) {
            if(libraryItem.getAvailable()) {
                libraryItem.setAvailable(false);
                System.out.println("Book with ID " + libraryItem.getId() + " is borrowed by " + this.getName());
            }
            else
                System.out.println("Book with ID " + libraryItem.getId() +  " is not available");
        } else {
            DVD dvd = (DVD) libraryItem;
            if(libraryItem.getAvailable())
                System.out.println("DVD with ID " + dvd.getId() + " of Type " + dvd.getType() + " is borrowed by " + this.getName());
            else
                System.out.println("DVD with ID " + dvd.getId() +  " of Type " +dvd.getType() + " is not available");
        }
    }

    public void returnItem(int id, LibraryItem libraryItem) {
        if(libraryItem instanceof Book) {
            if(!(libraryItem.getAvailable())){
                libraryItem.setAvailable(true);
                System.out.println("Book with ID " + libraryItem.getId() + " is returned by " + this.getName());
            }
            else
                System.out.println("Book with ID " + libraryItem.getId() +  " is not available");
        } else {
            DVD dvd = (DVD) libraryItem;
            if(!(libraryItem.getAvailable()))
                System.out.println("DVD with ID " + dvd.getId() + " of Type " + dvd.getType() + " is returned by " + this.getName());
            else
                System.out.println("DVD with ID " + dvd.getId() +  " of Type " +dvd.getType() + " is not available");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Book book = new Book(104);
        DVD dvd = new DVD(165, "Blu-ray");

        LibraryMember libraryMember = new LibraryMember(65, "Ram");

        libraryMember.borrow(104, book);
        libraryMember.borrow(165, dvd);
    }
}
