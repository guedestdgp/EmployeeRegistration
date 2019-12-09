package classes;

public abstract class Employee {
    private int employeeId;
    private String firstName;
    private String lastName;
    private int age;
    private int birthYear;
    private double monthlySalary;
    private int rate;
    private Vehicle vehicle;

    abstract void toDisplay();

    protected Employee(int employeeId, String firstName, String lastName, int age, int birthYear, double monthlySalary, int rate, Vehicle vehicleId) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthYear = birthYear;
        this.monthlySalary = monthlySalary;
        this.vehicle = vehicleId;
        rate = setRate(rate);
    }

    public int setRate(int rate) {
        if (rate < 10)
            this.rate = 10;
        else if (rate > 100)
            this.rate = 100;
        else
            this.rate = rate;
        return rate;
    }

    protected int annualIncome(){
        /*--- Yearly income computed as 12 times the monthly income
        multiplied by the occupation rate. ---*/
        return 0;
    }
}
