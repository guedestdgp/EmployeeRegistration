package classes;

public abstract class Vehicle {
    private String make;
    private String plate;
    private String color;

    Vehicle(String make, String plate, String color) {
        this.make = make;
        this.plate = plate;
        this.color = color;
    }

    abstract void toDisplay();

}
