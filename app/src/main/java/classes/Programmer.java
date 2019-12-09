package classes;

import java.io.Serializable;

public class Programmer extends Employee implements Serializable {
    private int nbProjects;

    private final int gain_factor_project;

    {
        gain_factor_project = 200;
    }

    public Programmer(int employeeId, String firstName, String lastName, int age, int birthYear, double monthlySalary, int rate, int nbProjects, Vehicle vehicle) {
        super(employeeId, firstName, lastName, age, birthYear, monthlySalary, rate, vehicle);
        this.nbProjects = nbProjects;
    }

    @Override
    public String toDisplay() {
        return null;
    }

    public int getGain_factor_project() {
        return gain_factor_project;
    }
}
