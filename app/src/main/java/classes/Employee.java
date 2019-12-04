package classes;

abstract class Employee {
    private int employeeId;
    private String name;
    private int age;
    private int birthYear;
    private double monthlySalary;
    private int rate;

    abstract void toDisplay();

    Employee(int employeeId) {
        this.employeeId = employeeId;
        rate = 100;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getRate() {
        return rate;
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
