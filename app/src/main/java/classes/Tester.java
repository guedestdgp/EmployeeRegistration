package classes;

public class Tester extends Employee {
    private int nbBugs;

    private final int gain_factor_error;

    {
        gain_factor_error = 10;
    }

    protected Tester(int employeeId) {
        super(employeeId);
    }

    @Override
    void toDisplay() {

    }

    public int getNbBugs() {
        return nbBugs;
    }

    public void setNbBugs(int nbBugs) {
        this.nbBugs = nbBugs;
    }

    public int getGain_factor_error() {
        return gain_factor_error;
    }
}
