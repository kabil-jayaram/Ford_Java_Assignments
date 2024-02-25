package Encapsulation.Question3;

class ShoppingCart {
    private String[] itemNames;
    private double[] itemPrices;
    private static int index = 0;

    public ShoppingCart() {
       this.itemNames = new String[10];
       this.itemPrices = new double[10];
    }

    public void addItem(String name, double price) {
        itemNames[index++] = name;
        itemPrices[index++] = price;
        System.out.println(name + " has be added to cart");
    }

    public void calculateTotalPrice() {
        double total = 0.0;
        for(double price : itemPrices)
            total += price;
        System.out.println("Total: " + total);
    }

    public void displayItemsInCart() {
        System.out.print("Items in Cart: ");
        for(String name : itemNames) {
            if (name != null)
                System.out.print(name + ", ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop",1200.0);
        cart.addItem("Headphones",150.0);
        cart.calculateTotalPrice();
        cart.displayItemsInCart();
    }
}
