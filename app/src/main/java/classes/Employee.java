package classes;

abstract class Employee {
    protected int employeeId;
    protected String name;
    protected int age;
    protected int birthYear;
    protected double monthlySalary;
    protected int rate;

    abstract void toDisplay();

    protected Employee(int employeeId, String name, int age, int birthYear, double monthlySalary) {
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
