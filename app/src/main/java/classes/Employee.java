package classes;

abstract class Employee {
    private int employeeId;
    private String name;
    private int age;
    private int birthYear;
    private double monthlySalary;
    private int rate;

    abstract void toDisplay();

    Employee(int employeeId, String name, int age, int birthYear, double monthlySalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.age = age;
        this.birthYear = birthYear;
        this.monthlySalary = monthlySalary;
        rate = 100;
    }

    public void setRate(int rate) {
        if (rate < 10)
            this.rate = 10;
        else if (rate > 100)
            this.rate = 100;
        else
            this.rate = rate;
    }

    protected int annualIncome(){
        /*--- Yearly income computed as 12 times the monthly income
        multiplied by the occupation rate. ---*/
        return 0;
    }
}
