package classes;

public class Car extends Vehicle {
    private String type;

    protected Car(int vehicleId, String make, String plate, String color, String category, String type) {
        super(vehicleId, make, plate, color, category);
        this.type = type;
    }

    @Override
    void toDisplay() {

    }
}
