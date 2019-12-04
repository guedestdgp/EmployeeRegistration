package classes;

public class Programmer extends Employee {
    private int nbProjects;

    private final int gain_factor_project;

    {
        gain_factor_project = 200;
    }

    protected Programmer(int employeeId, int nbProjects) {
        super(employeeId, name, age, birthYear, monthlySalary);
        this.nbProjects = nbProjects;
    }

    @Override
    void toDisplay() {

    }

    public int getGain_factor_project() {
        return gain_factor_project;
    }
}
