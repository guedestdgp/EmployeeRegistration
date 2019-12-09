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
        return null;
    }

    public Boolean getSidecar() {
        return sidecar;
    }
}
