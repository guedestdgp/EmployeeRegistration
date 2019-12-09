package classes;

public class Car extends Vehicle {
    private String type;

    public Car(String make, String plate, String color, String category, String type) {
        super(make, plate, color, category);
        this.type = type;
    }

    @Override
    void toDisplay() {

    }
}
