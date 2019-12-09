package classes;

public class Tester extends Employee {
    private int nbBugs;

    private final int gain_factor_error;

    {
        gain_factor_error = 10;
    }

    public Tester(int employeeId, String firstName, String lastName, int age, int birthYear, double monthlySalary, int nbBugs, Vehicle vehicleId) {
        super(employeeId, firstName, lastName, age, birthYear, monthlySalary, vehicleId);
        this.nbBugs = nbBugs;
    }

    @Override
    void toDisplay() {

    }

    public int getGain_factor_error() {
        return gain_factor_error;
    }
}
