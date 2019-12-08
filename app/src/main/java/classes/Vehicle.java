package classes;

abstract class Vehicle {
    private int vehicleId;
    private String make;
    private String plate;
    private String color;
    private String category;

    Vehicle(int vehicleId, String make, String plate, String color, String category) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    abstract void toDisplay();

}
