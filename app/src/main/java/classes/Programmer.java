package classes;

import java.io.Serializable;
import java.text.MessageFormat;

public class Programmer extends Employee implements Serializable {
    private int nbProjects;

    private final int gain_factor_project;

    {
        gain_factor_project = 200;
    }

    public Programmer(int employeeId, String firstName, String lastName, int birthYear, double monthlySalary, int rate, int nbProjects, Vehicle vehicle) {
        super(employeeId, firstName, lastName, birthYear, monthlySalary, rate, vehicle);
        this.nbProjects = nbProjects;
    }

    @Override
    public String toDisplay() {
        return String.format("Name: %s %s, a Programmer\nAge: %d\nEmployee has a %s\nOccupation rate: %d%%\nAnnual income: $%.2f\nHe/She has completed %d projects", this.getFirstName(), this.getLastName(), this.getAge(), this.getVehicle().toDisplay(), this.getRate(), this.annualIncome(), this.nbProjects);
    }

    @Override
    double annualIncome() {
        /* Making annual */
        double income = this.getMonthlySalary() * 12;
        /* Multiply by rate */
        income *= (this.getRate() / 100.0);
        /* $200 per project */
        income += (gain_factor_project * this.nbProjects);
        return income;
    }

    public int getGain_factor_project() {
        return gain_factor_project;
    }
}
