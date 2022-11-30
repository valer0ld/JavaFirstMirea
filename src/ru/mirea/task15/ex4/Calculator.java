package ru.mirea.task15.ex4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator extends JFrame {

    JPanel[] jPanel = new JPanel[2];

    String[] buttonsText = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};

    JTextArea textarea = new JTextArea(6, 14);
    Dimension buttonSize = new Dimension(65, 24);

    Font font = new Font("",Font.PLAIN,15);


    Calculator() {
        super("Simple Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1));
        jPanel[0] = new JPanel();
        jPanel[1] = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 20));
        add(jPanel[0]);
        add(jPanel[1]);

        setSize(350, 480);

        for (int i = 0; i < 16; i++) {
            Button button = new Button(buttonsText[i]);
            button.setBackground(new Color(255, 255, 255));
            button.setPreferredSize(buttonSize);
            button.setFont(font);
            if (!buttonsText[i].matches("=")) {
                button.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent ae) {
                        textarea.append(button.getLabel());
                    }
                });
            }
            else button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    result(textarea.getText());
                }
            });
            jPanel[1].add(button);
        }

        textarea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        textarea.setFont(new Font("", Font.BOLD, 25));
        textarea.setLineWrap(true);
        jPanel[0].add(textarea);

        setVisible(true);
    }

    public static void result(String expression)
    {
        StringBuilder exp = new StringBuilder(expression);
        while(Pattern.compile("[\\*\\/]").matcher(exp).find())
        {
            Pattern fullExp = Pattern.compile("(\\d+\\.?\\d*[\\*\\/]\\d+\\.?\\d*)");
            Matcher m = fullExp.matcher(exp);
            Matcher m1 = Pattern.compile("[\\*\\/]").matcher(exp);
           // System.out.println(fullExp.matcher(exp));
            int start = m.find() ? m.start() : 0;
            int end = m.end();
            int op = m1.find() ? m1.start() : 0;
            //System.out.println(exp.substring(start, op) + " " + exp.substring(op + 1, end));
            double x1 = Double.parseDouble(exp.substring(start, op));
            double x2 = Double.parseDouble(exp.substring(op + 1, end));
            //System.out.println(x1 + " " + x2);
            if (m1.group().equals("*"))
            {
                exp.delete(start, end);
                exp.insert(start, (x1 * x2));
            }
            else
            {
                exp.delete(start, end);
                exp.insert(start, (x1 / x2));
            }
        }
        while(Pattern.compile("[\\+\\-]").matcher(exp).find())
        {
            Pattern fullExp = Pattern.compile("(\\d+\\.?\\d*[\\+\\-]\\d+\\.?\\d*)");
            Matcher m = fullExp.matcher(exp);
            Matcher m1 = Pattern.compile("[\\+\\-]").matcher(exp);
            // System.out.println(fullExp.matcher(exp));
            int start = m.find() ? m.start() : 0;
            int end = m.end();
            int op = m1.find() ? m1.start() : 0;
            //System.out.println(exp.substring(start, op) + " " + exp.substring(op + 1, end));
            double x1 = Double.parseDouble(exp.substring(start, op));
            double x2 = Double.parseDouble(exp.substring(op + 1, end));
            //System.out.println(x1 + " " + x2);
            if (m1.group().equals("+"))
            {
                exp.delete(start, end);
                exp.insert(start, (x1 + x2));
            }
            else
            {
                exp.delete(start, end);
                exp.insert(start, (x1 - x2));
            }
        }
        try {
            JOptionPane.showMessageDialog(null, "Result = " + Math.ceil(Double.parseDouble(exp.toString()) * 1000)/ 1000, "RESULT", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Wrong expression!", "ALERT", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[]args){ new Calculator();}
}
