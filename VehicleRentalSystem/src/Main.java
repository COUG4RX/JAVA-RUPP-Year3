class Vehicle {
    // Properties
    String manufacturer;
    String model;
    int year;
    double baseRentalPrice;
    int rentalDays;

    // Constructor
    public Vehicle(String manufacturer, String model, int year, double baseRentalPrice, int rentalDays) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.baseRentalPrice = baseRentalPrice;
        this.rentalDays = rentalDays;
    }

    // Method to calculate rental cost
    public double calculateRentalCost() {
        double totalCost = baseRentalPrice * rentalDays;

        // Apply discount if rented for more than 30 days
        if (rentalDays > 30) {
            totalCost *= 0.8; // 20% discount
        }

        return totalCost;
    }
}

// Car class extending Vehicle
class Car extends Vehicle {
    // Additional property
    int numberOfSeats;

    // Constructor
    public Car(String manufacturer, String model, int year, double baseRentalPrice, int rentalDays, int numberOfSeats) {
        super(manufacturer, model, year, baseRentalPrice, rentalDays);
        this.numberOfSeats = numberOfSeats;
    }
}

// Motorcycle class extending Vehicle
class Motorcycle extends Vehicle {
    // Additional property
    boolean needHelmet;

    // Constructor
    public Motorcycle(String manufacturer, String model, int year, double baseRentalPrice, int rentalDays, boolean needHelmet) {
        super(manufacturer, model, year, baseRentalPrice, rentalDays);
        this.needHelmet = needHelmet;
    }
}

class VehicleRentalSystem {
    public static void main(String[] args) {
        // Create instances of Car and Motorcycle
        Car car = new Car("toyota", "prius", 2023, 200.0, 20, 10);
        Motorcycle motorcycle = new Motorcycle("Honda", "scoopy", 2023, 120.0, 15, true);

        // Display rental details
        displayRentalDetails(car);
        displayRentalDetails(motorcycle);
    }

    public static void displayRentalDetails(Vehicle vehicle) {
        System.out.println("Vehicle: " + vehicle.manufacturer + " " + vehicle.model);
        System.out.println("Rental cost: $" + vehicle.calculateRentalCost());
        System.out.println("-----------------------------------------");
    }
}