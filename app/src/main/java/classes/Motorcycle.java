package classes;

public class Motorcycle extends Vehicle {
    private Boolean sidecar;

    protected Motorcycle(int vehicleId) {
        super(vehicleId);
    }

    @Override
    void toDisplay() {

    }

    public Boolean getSidecar() {
        return sidecar;
    }

    public void setSidecar(Boolean sidecar) {
        this.sidecar = sidecar;
    }
}
