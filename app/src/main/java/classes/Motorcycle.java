package classes;

public class Motorcycle extends Vehicle {
    private Boolean sidecar;

    public Motorcycle(String make, String plate, String color, Boolean sidecar) {
        super(make, plate, color);
        this.sidecar = sidecar;
    }

    @Override
    void toDisplay() {

    }
}
