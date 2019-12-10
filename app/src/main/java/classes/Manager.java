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
        return String.format("Name: %s %sa Manager\nAge: %d\nEmployee has a %s\nOccupation rate: %d%%\nAnnual income: %d\nHe/She has brought %d new clients", this.getFirstName(), this.getLastName(), this.getAge(), this.getVehicle().toDisplay(), this.getRate(), annualIncome(), this.nbClients);
    }

    public int getGain_factor_travel() {
        return gain_factor_travel;
    }

    public int getGain_factor_client() {
        return gain_factor_client;
    }
}
