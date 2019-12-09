package classes;

public abstract class Vehicle {
    private String make;
    private String plate;
    private String color;
    private String category;

    Vehicle(String make, String plate, String color, String category) {
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    abstract void toDisplay();

}
