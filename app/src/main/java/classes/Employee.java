package classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public abstract class Employee implements Serializable {
    private int employeeId;
    private String firstName;
    private String lastName;
    private int age;
    private int birthYear;
    private double monthlySalary;
    private int rate;
    private Vehicle vehicle;

    public int getAge() {
        return age;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getRate() {
        return rate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public abstract String toDisplay();

    protected Employee(int employeeId, String firstName, String lastName, int birthYear, double monthlySalary, int rate, Vehicle vehicleId) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = setAge(birthYear);
        this.birthYear = birthYear;
        this.monthlySalary = monthlySalary;
        this.vehicle = vehicleId;
        rate = setRate(rate);
    }

    public static ArrayList<Employee> employees;

    public int setRate(int rate) {
        if (rate < 10)
            this.rate = 10;
        else if (rate > 100)
            this.rate = 100;
        else
            this.rate = rate;
        return rate;
    }

    public int setAge(int birthYear) {
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }


    /*--- Yearly income computed as 12 times the monthly income
        multiplied by the occupation rate. ---*/
    abstract double annualIncome();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}
