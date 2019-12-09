package classes;

public class Programmer extends Employee {
    private int nbProjects;

    private final int gain_factor_project;

    {
        gain_factor_project = 200;
    }

    public Programmer(int employeeId, String firstName, String lastName, int age, int birthYear, double monthlySalary, int rate, int nbProjects, Vehicle vehicleId) {
        super(employeeId, firstName, lastName, age, birthYear, monthlySalary, rate, vehicleId);
        this.nbProjects = nbProjects;
    }

    @Override
    void toDisplay() {

    }

    public int getGain_factor_project() {
        return gain_factor_project;
    }
}
