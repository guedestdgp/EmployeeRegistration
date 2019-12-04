package classes;

public class Motorcycle extends Vehicle {
    private Boolean sidecar;

    protected Motorcycle(int vehicleId, Boolean sidecar) {
        super(vehicleId);
        this.sidecar = sidecar;
    }

    @Override
    void toDisplay() {

    }
}
