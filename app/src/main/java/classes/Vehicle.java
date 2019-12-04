package classes;

abstract class Vehicle {
    protected int vehicleId;
    protected String make;
    protected String plate;
    protected String color;
    protected String category;

    protected Vehicle(int vehicleId, String make, String plate, String color, String category) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    abstract void toDisplay();

}
