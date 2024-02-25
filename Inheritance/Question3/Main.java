package Inheritance.Question3;

class Vehicle {
    private String make;
    private String model;
    private double rentalPrice;
    private boolean rented;

    public Vehicle(String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.rented = false;
    }

    public void rent() {
        if(!rented) {
            rented = true;
            System.out.println("Vehicle rented: " + make + " " + model);
        } else {
            System.out.println("Vehicle is already rented");
        }
    }

    public double calculateRentalCost(int days) {
        return rentalPrice * days;
    }

    public void returnVehicle() {
        if(rented) {
            rented = false;
            System.out.println("Vehicle returned: " + make + " " + model);
        } else {
            System.out.println("Vehicle is not currently rented");
        }
    }
}

class Car extends Vehicle {
    private int noOfSeats;

    public Car(String make, String model, double rentalPrice, int noOfSeats) {
        super(make, model, rentalPrice);
        this.noOfSeats = noOfSeats;
    }
}

class Motorcycle extends Vehicle {
    private double engineDisplacement;

    public Motorcycle(String make, String model, double rentalPrice, double engineDisplacement) {
        super(make, model, rentalPrice);
        this.engineDisplacement = engineDisplacement;
    }
}

class Truck extends Vehicle {
    private int cargoCapacity;

    public Truck(String make, String model, double rentalPrice, int cargoCapacity) {
        super(make, model, rentalPrice);
        this.cargoCapacity = cargoCapacity;
    }
}

public class Main {
    public static void main(String[] args) {
        Car sedan = new Car("Nissan","R-32",90.0, 4);
        Motorcycle sportBike = new Motorcycle("Harley-Davidson","Sprotster",30.0,500.0);
        Truck truck = new Truck("Ford","F-150 Ligthning",80.0,700);

        sedan.rent();
        System.out.println("Rental  Cost: " + sedan.calculateRentalCost(5));
        sedan.returnVehicle();
    }
}
