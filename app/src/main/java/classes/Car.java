package classes;

import java.io.Serializable;

public class Car extends Vehicle implements Serializable {
    private String type;

    public Car(String make, String plate, String color, String type) {
        super(make, plate, color);
        this.type = type;
    }

    @Override
    public String toDisplay() {
        return String.format("car\n - Model: %s\n - Plate: %s\n - Color: %s\n - type: %s", this.getMake(), this.getPlate(), this.getColor(), this.type);
    }
}
