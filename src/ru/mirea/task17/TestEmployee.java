package ru.mirea.task17;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = retrieveEmployeeInfo();
        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(employee, view);
        controller.updateView();

        controller.setEmployeeHours(160);
        controller.setEmployeeSalaryPerHour(990.0);

        System.out.println("\nInfo has been updated\n");
        controller.updateView();
    }

    private static Employee retrieveEmployeeInfo()
    {
        Employee employee = new Employee();
        employee.setName("Ivan");
        employee.setHours(150);
        employee.setSalaryPerHour(1000.0);
        return employee;
    }
}
