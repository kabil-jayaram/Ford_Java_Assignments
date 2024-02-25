package Collections2.Question11;

import java.util.*;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class Main {
    public static void main(String[] args) {
        Set<Product> shoppingCart = new TreeSet<>(Comparator.comparingDouble(Product::getPrice).reversed());
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Shopping Cart Operations");
            System.out.println("1 - Add Product");
            System.out.println("2 - Remove Product");
            System.out.println("3 - Display all Products");
            System.out.println("4 - Exit");
            System.out.print("Enter the choice: ");
            try {
                int ch = scanner.nextInt();
                scanner.nextLine();
                switch (ch) {
                    case 1:
                        System.out.println("Enter Product Name, Price and Quantity to add: ");
                        String name = scanner.nextLine();
                        double price = scanner.nextDouble();
                        int quantity = scanner.nextInt();
                        scanner.nextLine();
                        Product product = new Product(name, price, quantity);
                        shoppingCart.add(product);
                        System.out.println("Product added: " + name + " - $" + price);
                        break;
                    case 2:
                        System.out.print("Enter Product Price to remove: ");
                        price = scanner.nextDouble();
                        boolean flag = true;
                        for(Product currentProduct : shoppingCart) {
                            if(currentProduct.getPrice() == price) {
                                shoppingCart.remove(currentProduct);
                                System.out.println("Product with price " + price + " removed from the shopping cart");
                                flag = false;
                                break;
                            }
                        }
                        if(flag)
                            System.out.println("Product with price " + price + " not found in the shopping cart");
                        break;
                    case 3:
                        if(!shoppingCart.isEmpty()) {
                            System.out.println("Products in descending order of price: ");
                            for(Product currentProduct : shoppingCart)
                                System.out.println(currentProduct.getName() + " - $" + currentProduct.getPrice());
                        } else
                            System.out.println("Shopping Cart is empty");
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
