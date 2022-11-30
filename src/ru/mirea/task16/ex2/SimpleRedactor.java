package ru.mirea.task16.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleRedactor extends JFrame {

    Dimension dimension = new Dimension(600, 400);
    JPanel panel = new JPanel();
    JTextArea textArea = new JTextArea();

    JMenuBar menu = new JMenuBar();

    SimpleRedactor()
    {
        super("Text Redactor");

        window();
        text();
        menuBar();

        setVisible(true);
    }

    public void window()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(dimension);

        panel.setSize(dimension);
        panel.setLayout(new GridLayout());

        add(panel);
    }

    public void text()
    {
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        panel.add(textArea);
    }

    public void menuBar()
    {
        var colorMenu = new JMenu("Цвет");
        var black = new JMenuItem("Чёрный");
        var blue = new JMenuItem("Синий");
        var red = new JMenuItem("Красный");
        colorMenu.add(black);
        colorMenu.add(blue);
        colorMenu.add(red);

        var fontMenu = new JMenu("Шрифт");
        var times = new JMenuItem("Times New Roman");
        var sans = new JMenuItem("MS Sans Serif");
        var courier = new JMenuItem("Courier New");
        fontMenu.add(times);
        fontMenu.add(sans);
        fontMenu.add(courier);

        colorMenu.setFont(new Font("", Font.PLAIN, 15));
        fontMenu.setFont(new Font("", Font.PLAIN, 15));
        black.setFont(new Font("", Font.PLAIN, 13));
        red.setFont(new Font("", Font.PLAIN, 13));
        blue.setFont(new Font("", Font.PLAIN, 13));
        times.setFont(new Font("", Font.PLAIN, 13));
        sans.setFont(new Font("", Font.PLAIN, 13));
        courier.setFont(new Font("", Font.PLAIN, 13));

        ActionListener colorSelect = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (e.getActionCommand()) {
                    case "Красный" -> textArea.setForeground(Color.red);
                    case "Синий" -> textArea.setForeground(Color.BLUE);
                    case "Чёрный" -> textArea.setForeground(Color.BLACK);
                }
            }
        };

        red.addActionListener(colorSelect);
        blue.addActionListener(colorSelect);
        black.addActionListener(colorSelect);

        ActionListener fontSelect = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (e.getActionCommand()) {
                    case "Times New Roman" -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 14));
                    case "MS Sans Serif" -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 14));
                    case "Courier New" -> textArea.setFont(new Font("Courier New", Font.PLAIN, 14));
                }
            }
        };

        times.addActionListener(fontSelect);
        sans.addActionListener(fontSelect);
        courier.addActionListener(fontSelect);

        menu.add(colorMenu);
        menu.add(fontMenu);
        setJMenuBar(menu);
    }

    public static void main(String[] args) {
        new SimpleRedactor();
    }
}
