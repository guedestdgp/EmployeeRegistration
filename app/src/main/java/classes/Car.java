package classes;

public class Car extends Vehicle {
    private String type;

    protected Car(int vehicleId, String type) {
        super(vehicleId);
        this.type = type;
    }

    @Override
    void toDisplay() {

    }
}
