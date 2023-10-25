public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String type, int year, int numberOfDoors) {
        super(type, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Override the base class method 'start'
    @Override
    public void start() {
        System.out.println("Engine is starting");
    }

    // Add a new method specific to the Car class
    public void drive() {
        System.out.println("Car is moving.");
    }

    // Override the base class method 'displayInfo'
    @Override
    public void display() {
        super.display();
        System.out.println("Doors: " + numberOfDoors);
    }
}
