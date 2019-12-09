package classes;

public class Car extends Vehicle {
    private String type;

    public Car(String make, String plate, String color, String type) {
        super(make, plate, color);
        this.type = type;
    }

    @Override
    void toDisplay() {

    }
}
