package classes;

import java.io.Serializable;
import java.text.MessageFormat;

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
        return MessageFormat.format("Name: {0} {1}, a Tester\nAge: {2}\nEmployee has a {3}\nOccupation rate: {4}%\nAnnual income: {5}\nHe/She has corrected {6} bugs", this.getFirstName(), this.getLastName(), this.getAge(), this.getVehicle().toDisplay(), this.getRate(), this.annualIncome(), this.getNbBugs());
    }

    @Override
    double annualIncome() {
        //Making annual
        double income = this.getMonthlySalary() * 12;
        //Multiply by rate
        income *= (this.getRate() / 100);
        //$500 per client
        income += (getGain_factor_error() * this.getNbBugs());
        //I found nothing in the documentation how to get the days traveled.
        //gain_factor_travel
        return income;
    }

    public int getGain_factor_error() {
        return gain_factor_error;
    }

    public int getNbBugs() {
        return nbBugs;
    }
}
