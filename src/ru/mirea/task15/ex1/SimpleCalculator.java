package ru.mirea.task15.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class SimpleCalculator extends JFrame {
    JTextField jta1 = new JTextField(12);
    JTextField jta2 = new JTextField(12);
    JButton add = new JButton("+");
    JButton sub = new JButton("-");
    JButton mul = new JButton("*");
    JButton div = new JButton("/");

    private static String op;

    SimpleCalculator() {
        super("Simple Calculator");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(250,150);

        add(new JLabel("1st Number", JLabel.CENTER));
        add(jta1);
        add(new JLabel("2nd Number", JLabel.CENTER));
        add(jta2);
        add(add);
        add(sub);
        add(mul);
        add(div);

        ActionListener doOperation = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try{
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null,"Result = "+ result(x1, x2),"RESULT",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null,   "Error in Numbers!","ALERT" ,JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        add.addActionListener(doOperation);
        sub.addActionListener(doOperation);
        mul.addActionListener(doOperation);
        div.addActionListener(doOperation);

        add.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent ae)
        {
            op = "+";
        }
        });
        sub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                op = "-";
            }
        });
        mul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                op = "*";
            }
        });
        div.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                op = "/";
            }
        });

        setVisible(true);
    }
    public static double result(double x1, double x2)
    {
        return switch (op) {
            case "+" -> x1 + x2;
            case "-" -> x1 - x2;
            case "*" -> x1 * x2;
            case "/" -> x1 / x2;
            default -> 0;
        };
    }
    public static void main(String[]args){ new SimpleCalculator();}
}
