package classes;

abstract class Vehicle {
    private int vehicleId;
    private String make;
    private String plate;
    private String color;
    private String category;

    protected Vehicle(int vehicleId) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.plate = plate;
        this.color = color;
        this.category = category;
    }

    abstract void toDisplay();

}
