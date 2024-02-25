package Inheritance.Question2;

class Product {
    private String name;
    private double price;
    private String description;

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}

class Electronics extends Product {
    private String manufacturer;

    public Electronics(String name, double price, String description, String manufacturer) {
        super(name, price, description);
        this.manufacturer = manufacturer;
    }
    
    public String toString() {
        return "Electronics Name: " + this.getName() + " \nPrice " + this.getPrice() + " \nDescription: " + this.getDescription() + " \nManufacturer: " + manufacturer;
    }
}

class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String description, String size) {
        super(name, price, description);
        this.size = size;
    }
    
    public String toString() {
        return "Clothing Name: " + this.getName() + " \nPrice " + this.getPrice() + " \nDescription: " + this.getDescription() + " \nSize: " + size;
    }
}

class Books extends Product {
    private String author;
    private String publisher;

    public Books(String name, double price, String description, String author, String publisher) {
        super(name, price, description);
        this.author = author;
        this.publisher = publisher;
    }

    public String toString() {
        return "Book Name: " + this.getName() + " \nPrice " + this.getPrice() + " \nDescription: " + this.getDescription() + " \nAuthor: " + author + " \nPublisher: " + publisher;
    }
}

public class Main {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 999.99,"High Performance Laptop", "Asus");
        System.out.println(laptop + "\n");

        Clothing shirt = new Clothing("T-Shirt",299.99,"Cotton T-Shirt","M");
        System.out.println(shirt + "\n");

        Books novel = new Books("The Great Novel",499.99,"Bestseller","Tom Ronin","Tenning Publishers");
        System.out.println(novel + "\n");
    }
}
