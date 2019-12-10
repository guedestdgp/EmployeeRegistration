package classes;

import java.io.Serializable;

public class Manager extends Employee implements Serializable {
    private int nbClients;

    private final int gain_factor_client;

    {
        gain_factor_client = 500;
    }

    private final int gain_factor_travel;

    {
        gain_factor_travel = 100;
    }

    public Manager(int employeeId, String firstName, String lastName, int birthYear, double monthlySalary, int rate, int nbClients, Vehicle vehicle) {
        super(employeeId, firstName, lastName, birthYear, monthlySalary, rate, vehicle);
        this.nbClients = nbClients;
    }

    @Override
    public String toDisplay() {
        return String.format("Name: %s %s, a Manager\nAge: %d\nEmployee has a %s\nOccupation rate: %d%%\nAnnual income: $%.2f\nHe/She has brought %d new clients", this.getFirstName(), this.getLastName(), this.getAge(), this.getVehicle().toDisplay(), this.getRate(), this.annualIncome(), this.nbClients);
    }

    @Override
    double annualIncome() {
        /* Making annual */
        double income = this.getMonthlySalary() * 12;
        /* Multiply by rate */
        income *= (this.getRate() / 100.0);
        /* $500 per client */
        income += (gain_factor_client * this.nbClients);
        /* I found nothing in the documentation how to get the days traveled.
        * gain_factor_travel */
        return income;
    }
}
