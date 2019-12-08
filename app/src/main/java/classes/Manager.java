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

    protected Manager(int employeeId, String name, int age, int birthYear, double monthlySalary, int nbClients) {
        super(employeeId, name, age, birthYear, monthlySalary, vehicle);
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
