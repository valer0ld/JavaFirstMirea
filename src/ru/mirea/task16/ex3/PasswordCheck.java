package ru.mirea.task16.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PasswordCheck extends JFrame {

    Dimension dimension = new Dimension(450, 220);
    Dimension text = new Dimension(1000, 20);
    Dimension field = new Dimension(150, 20);
    JPanel panel = new JPanel();

    JLabel serviceText = new JLabel("Service:");
    JLabel userText = new JLabel("User name:");
    JLabel passwordText = new JLabel("Password:");
    TextField service = new TextField(35);
    TextField user = new TextField(35);
    TextField password = new TextField(35);

    PasswordCheck()
    {
        super("Password Check");

        window();

        password.setEchoChar('*');
        serviceText.setSize(text);
        service.setSize(field);
        userText.setSize(text);
        user.setSize(field);
        passwordText.setSize(text);
        password.setSize(field);

        panel.add(serviceText);
        panel.add(service);
        panel.add(userText);
        panel.add(user);
        panel.add(passwordText);
        panel.add(password);

        KeyListener enter = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER)
                {
                    //System.out.println(service.getText() + " " + user.getText() + " " + password.getText());
                    if (service.getText().equals("1") && user.getText().equals("user") && password.getText().equals("password"))
                        JOptionPane.showMessageDialog(null, "Вы вошли в систему!", "Вход выполнен", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, """
                                Данные введены не верно, попробуйте ещё раз!!!

                                Данные для входа:
                                service: 1
                                user: user
                                password: password""", "Вход не выполнен", JOptionPane.ERROR_MESSAGE);
                }
            }
        };

        password.addKeyListener(enter);
        service.addKeyListener(enter);
        user.addKeyListener(enter);

        setVisible(true);
    }

    public void window()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(dimension);

        panel.setPreferredSize(dimension);
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 7));

        add(panel);
    }


    public static void main(String[] args) {
        new PasswordCheck();
    }
}
