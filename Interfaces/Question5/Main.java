package Interfaces.Question5;

import java.util.ArrayList;

interface Product {
    public double calculatePrice();
}

interface ShoppingCart {
    public void addToCart(Product product);
    public double calculateTotalPrice();
}

class ElectronicProduct implements Product {
    private double price;

    public ElectronicProduct(double price) {
        this.price = price;
    }

    public double calculatePrice() {
        this.price += this.price * 0.18;
        return this.price;
    }

    public double getPrice() {
        return price;
    }
}

class ClothingProduct implements Product {
    private double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    public double calculatePrice() {
        this.price += this.price * 0.09;
        return this.price;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCartImpl implements ShoppingCart {
    private int total;
    private ArrayList<Product> products = new ArrayList<>();
    public void addToCart(Product product) {
        products.add(product);
    }
    public double calculateTotalPrice() {
        for(Product product : products) {
            if(product instanceof ElectronicProduct) {
                ElectronicProduct electronicProduct = (ElectronicProduct) product;
                total += electronicProduct.getPrice();
            }
            else {
                ClothingProduct clothingProduct = (ClothingProduct) product;
                total += clothingProduct.getPrice();
            }
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        ElectronicProduct laptop = new ElectronicProduct(45000);
        System.out.println("Laptop Price: " + laptop.calculatePrice());

        ClothingProduct shirt = new ClothingProduct(1500);
        System.out.println("Shirt Price: " + shirt.calculatePrice());

        ShoppingCartImpl shoppingCart = new ShoppingCartImpl();
        shoppingCart.addToCart(laptop);
        System.out.println("Total: " + shoppingCart.calculateTotalPrice());

        shoppingCart.addToCart(shirt);
        System.out.println("Total: " + shoppingCart.calculateTotalPrice());
    }
}
