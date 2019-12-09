package classes;

public class Motorcycle extends Vehicle {
    private Boolean sidecar;

    public Motorcycle(String make, String plate, String color, String category, Boolean sidecar) {
        super(make, plate, color, category);
        this.sidecar = sidecar;
    }

    @Override
    void toDisplay() {

    }
}
