package classes;

public class Car extends Vehicle {
    private String type;

    protected Car(int vehicleId) {
        super(vehicleId);
    }

    @Override
    void toDisplay() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
