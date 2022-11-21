package ru.mirea.task12.ex3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JFrame{

    private int i = 2;

    public Animation(){
        super("RandomFigure");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        String path = "C:/Users/Валера/Downloads/Animation/";


        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setPreferredSize(new Dimension(1200,  800));


        JLabel label =  new JLabel(new ImageIcon(path  + "1.png"));


        panel.add(label);

        getContentPane().add(panel);
        pack();
        setVisible(true);

        Timer t = new Timer(800, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setIcon(new ImageIcon(path + i + ".png"));
                i++;
                if (i == 16) i = 1;
            }
        });

        t.start();
    }

    public static void main(String[] args) {
        new Animation();
    }
}
