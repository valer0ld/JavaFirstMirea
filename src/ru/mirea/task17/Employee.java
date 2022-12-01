package ru.mirea.task17;

public class Employee {
    private String name;
    private int hours;
    private double salaryPerHour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public double calculateSalary()
    {
        return this.salaryPerHour * this.hours;
    }
}
