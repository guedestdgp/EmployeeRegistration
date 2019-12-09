package classes;

import java.io.Serializable;

public class Car extends Vehicle implements Serializable {
    private String type;

    public Car(String make, String plate, String color, String type) {
        super(make, plate, color);
        this.type = type;
    }

    @Override
    void toDisplay() {

    }
}
