package classes;

public class Manager extends Employee {
    private int nbClients;

    private final int gain_factor_client;

    {
        gain_factor_client = 500;
    }

    private final int gain_factor_travel;

    {
        gain_factor_travel = 100;
    }

    public Manager(int employeeId, String firstName, String lastName, int age, int birthYear, double monthlySalary, int rate, int nbClients, Vehicle vehicle) {
        super(employeeId, firstName, lastName, age, birthYear, monthlySalary, rate, vehicle);
        this.nbClients = nbClients;
    }

    @Override
    void toDisplay() {

    }

    public int getGain_factor_travel() {
        return gain_factor_travel;
    }

    public int getGain_factor_client() {
        return gain_factor_client;
    }
}
