package classes;

import java.io.Serializable;

public class Motorcycle extends Vehicle implements Serializable {
    private Boolean sidecar;

    public Motorcycle(String make, String plate, String color, Boolean sidecar) {
        super(make, plate, color);
        this.sidecar = sidecar;
    }

    @Override
    public String toDisplay() {
        return String.format("motorcycle\n - Model: %s\n - Plate: %s\n - Color: %s\n - %sa sidecar", this.getMake(), this.getPlate(), this.getColor(), this.getSidecar() ? "with" : "without");
    }

    public Boolean getSidecar() {
        return sidecar;
    }
}
