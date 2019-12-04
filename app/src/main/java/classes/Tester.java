package classes;

public class Tester extends Employee {
    private int nbBugs;

    private final int gain_factor_error;

    {
        gain_factor_error = 10;
    }

    protected Tester(int employeeId, String name, int age, int birthYear, double monthlySalary, int nbBugs) {
        super(employeeId, name, age, birthYear, monthlySalary);
        this.nbBugs = nbBugs;
    }

    @Override
    void toDisplay() {

    }

    public int getGain_factor_error() {
        return gain_factor_error;
    }
}
