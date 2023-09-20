+class Car {
    // Attributes
    private String brand;
    private String model;
    private int year;
    private double fuelLevel;

    // Constructor
    public Car(String make, String model, int year) {
        this.brand = make;
        this.model = model;
        this.year = year;
        this.fuelLevel = 0.0; // Initialize fuel level to empty
    }

    // Methods
    public void start() {
        if (fuelLevel > 0) {
            System.out.println("The car is starting.");
        } else {
            System.out.println("No fuel. Please refill the tank.");
        }
    }

    public void drive(int distance) {
        if (fuelLevel > 0) {
            System.out.println("Driving " + distance + " miles.");
            fuelLevel -= distance * 0.1; // Assuming 0.1 gallons of fuel per mile
        } else {
            System.out.println("No fuel. Please refill the tank.");
        }
    }

    public void refuel(double gallons) {
        fuelLevel += gallons;
        System.out.println("Added " + gallons + " gallons of fuel.");
    }

    // Getter methods
    public String getbrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    // Setter method
    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}

// main class

public class Project {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Crown", 2023);

        // Access and modify car attributes
        System.out.println("Brand: " + myCar.getbrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());

        // Refuel the car
        myCar.refuel(10.0);
        System.out.println("Fuel Level: " + myCar.getFuelLevel());

        // Start and drive the car
        myCar.start();
        myCar.drive(50);
        System.out.println("Fuel Level: " + myCar.getFuelLevel());
    }
}
