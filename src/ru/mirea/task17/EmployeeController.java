package ru.mirea.task17;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public String getEmployeeName() {
        return model.getName();
    }

    public void setEmployeeName(String name) {
        this.model.setName(name);
    }

    public int getEmployeeHours() {
        return model.getHours();
    }

    public void setEmployeeHours(int hours) {
        this.model.setHours(hours);
    }

    public double getEmployeeSalaryPerHour() {
        return model.getSalaryPerHour();
    }

    public void setEmployeeSalaryPerHour(double salaryPerHour) {
        this.model.setSalaryPerHour(salaryPerHour);
    }

    public double calculateEmployeeSalary()
    {
        return model.calculateSalary();
    }

    public void updateView()
    {
        view.printEmployeeInfo(model.getName(), model.getHours(), model.getSalaryPerHour(), model.calculateSalary());
    }
}
