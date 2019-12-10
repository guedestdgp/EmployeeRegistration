package classes;

import java.io.Serializable;

public class Tester extends Employee implements Serializable {
    private int nbBugs;

    private final int gain_factor_error;

    {
        gain_factor_error = 10;
    }

    public Tester(int employeeId, String firstName, String lastName, int birthYear, double monthlySalary, int rate, int nbBugs, Vehicle vehicle) {
        super(employeeId, firstName, lastName, birthYear, monthlySalary, rate, vehicle);
        this.nbBugs = nbBugs;
    }

    @Override
    public String toDisplay() {
        return String.format("Name: %s %s, a Tester\nAge: %d\nEmployee has a %s\nOccupation rate: %d %\nAnnual income: %d\nHe/She has corrected %d bugs", this.getFirstName(), this.getLastName(), this.getAge(), this.getVehicle().toDisplay(), this.getRate(), annualIncome(), this.getNbBugs());
    }

    public int getGain_factor_error() {
        return gain_factor_error;
    }

    public int getNbBugs() {
        return nbBugs;
    }
}
