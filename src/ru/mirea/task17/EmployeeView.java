package ru.mirea.task17;

public class EmployeeView {
    public void printEmployeeInfo(String name, int hours, double salaryPerHour, double salary)
    {
        System.out.println("Employee info:");
        System.out.println("Name: " + name);
        System.out.println("Hours worked(month): " + hours);
        System.out.println("Salary per hour: " + salaryPerHour);
        System.out.println("Final salary: " + salary);
    }
}
