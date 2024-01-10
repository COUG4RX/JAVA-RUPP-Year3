import java.util.Date;

class RentalSystem {

    public RentalSystem() {
        // Simulate rentals in the constructor
        Car car = new Car("GTR R34", 100);
        rentVehicle(car, 10);
        Motorcycle motorcycle = new Motorcycle("Neiman Marcus", 70);
        rentVehicle(motorcycle, 5);
    }
    public void rentVehicle(Vehicle vehicle, int rentalDays) {
        Date rentalDate = new Date();
        double rentalCost = vehicle.calculateRentalCost(rentalDays);

        System.out.println("Renting " + vehicle.getModel() + ":");
        System.out.println("- Rental cost: $" + rentalCost);
        System.out.println("- Rental period: " + rentalDays + " days");
        System.out.println("- Rental date: " + rentalDate);
        System.out.println();
    }

    public static void main(String[] args) {
        new RentalSystem();
    }
}

abstract class Vehicle {
    private String model;
    private double dailyRate;

    public Vehicle(String model, double dailyRate) {
        this.model = model;
        this.dailyRate = dailyRate;
    }

    public String getModel() {
        return model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public abstract double calculateRentalCost(int rentalDays);
}

class Car extends Vehicle {

    public Car(String model, double dailyRate) {
        super(model, dailyRate);
    }

    public double calculateRentalCost(int rentalDays) {
        // Add any specific car rental calculations here
        return rentalDays * getDailyRate();
    }
}

class Motorcycle extends Vehicle {

    public Motorcycle(String model, double dailyRate) {
        super(model, dailyRate);
    }

    public double calculateRentalCost(int rentalDays) {
        // Add any specific motorcycle rental calculations here
        return rentalDays * getDailyRate();
    }
}
