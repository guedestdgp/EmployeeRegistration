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
        return null;
    }

    public int getGain_factor_travel() {
        return gain_factor_travel;
    }

    public int getGain_factor_client() {
        return gain_factor_client;
    }
}
