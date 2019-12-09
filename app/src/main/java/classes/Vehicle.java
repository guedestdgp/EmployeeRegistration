package classes;

import java.io.Serializable;

public abstract class Vehicle implements Serializable {
    private String make;
    private String plate;
    private String color;

    Vehicle(String make, String plate, String color) {
        this.make = make;
        this.plate = plate;
        this.color = color;
    }

    abstract void toDisplay();

}
