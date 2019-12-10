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
        return MessageFormat.format("Name: {0} {1}, a Programmer\nAge: {2}\nEmployee has a {3}\nOccupation rate: {4}%\nAnnual income: {5}\nHe/She has completed {6} projects", this.getFirstName(), this.getLastName(), this.getAge(), this.getVehicle().toDisplay(), this.getRate(), this.annualIncome(), this.nbProjects);
    }

    @Override
    double annualIncome() {
        //Making annual
        double income = this.getMonthlySalary() * 12;
        //Multiply by rate
        income *= (this.getRate() / 100);
        //$500 per client
        income += (gain_factor_project * this.nbProjects);
        //I found nothing in the documentation how to get the days traveled.
        //gain_factor_travel
        return income;
    }

    public int getGain_factor_project() {
        return gain_factor_project;
    }
}
