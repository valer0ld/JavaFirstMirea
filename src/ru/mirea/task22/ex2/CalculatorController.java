package ru.mirea.task22.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorController {
    Calculator frame;
    CalculatorView view;

    public CalculatorController(Calculator frame, CalculatorView view) {
        this.frame = frame;
        this.view = view;
    }

    public void calculatorSetFrame()
    {
        frame.setFrame();
    }

    public JPanel[] calculatorGetJPanel() {
        return frame.getJPanel();
    }

    public String[] calculatorGetButtonsText() {
        return frame.getButtonsText();
    }

    public JTextArea calculatorGetTextarea() {
        return frame.getTextarea();
    }

    public Dimension calculatorGetButtonSize() {
        return frame.getButtonSize();
    }

    public Font calculatorGetFont() {
        return frame.getFont();
    }

    public void calculatorSetJPanel()
    {
        frame.setJPanel();
    }

    public void calculatorAddButton()
    {
        frame.addButton();
    }

    public void calculatorAddTextArea()
    {
        frame.addTextArea();
    }

    public void runCalculator()
    {
        calculatorSetFrame();
        calculatorSetJPanel();
        calculatorAddButton();
        calculatorAddTextArea();
    }

    public void updateView()
    {
        view.showCalculatorView(frame);
    }
}
