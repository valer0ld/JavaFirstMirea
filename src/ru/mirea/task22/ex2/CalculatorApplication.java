package ru.mirea.task22.ex2;

public class CalculatorApplication {
    public static void main(String[] args) {
        CalculatorController controller = new CalculatorController(new Calculator(), new CalculatorView());
        controller.runCalculator();
        controller.updateView();
    }
}
