package classes;

public class Motorcycle extends Vehicle {
    private Boolean sidecar;

    protected Motorcycle(int vehicleId, String make, String plate, String color, String category, Boolean sidecar) {
        super(vehicleId, make, plate, color, category);
        this.sidecar = sidecar;
    }

    @Override
    void toDisplay() {

    }
}
