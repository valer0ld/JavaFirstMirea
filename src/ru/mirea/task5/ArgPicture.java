package ru.mirea.task5;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;


//java ArgPicture.java C:\Users\валера\Pictures\photo5294371182251981282.jpg
public class ArgPicture extends JFrame {

    public ArgPicture(String path){
        super("ArgPicture");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);


        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setPreferredSize(new Dimension(500,  500));

        ImageIcon icon1 = new ImageIcon(path);
        JLabel label =  new JLabel(icon1);

        panel.add(label);

        getContentPane().add(panel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ArgPicture(args[0]);
    }
}
