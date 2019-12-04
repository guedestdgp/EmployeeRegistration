package classes;

public class Programmer extends Employee {
    private int nbProjects;

    private final int gain_factor_project;

    {
        gain_factor_project = 200;
    }

    protected Programmer(int employeeId) {
        super(employeeId);
    }

    @Override
    void toDisplay() {

    }

    public int getNbProjects() {
        return nbProjects;
    }

    public void setNbProjects(int nbProjects) {
        this.nbProjects = nbProjects;
    }
}
