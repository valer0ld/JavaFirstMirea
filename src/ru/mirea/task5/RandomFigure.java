package ru.mirea.task5;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomFigure extends JFrame{

    public RandomFigure() {
        super("RandomFigure");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);


        JPanel panel = new JPanel();
        panel.setBackground(new Color(211, 211, 211));
        panel.setPreferredSize(new Dimension(500,  500));


        getContentPane().add(panel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new RandomFigure();
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2d = (Graphics2D) g;
        Random r = new Random();
        for(int i = 0; i < 20; i++)
        {
            switch (r.nextInt(1, 4)) {
                case 1 -> {
                    Triangle triangle = new Triangle(500, 500);
                    g2d.setColor(triangle.getColor());
                    g2d.fillPolygon(triangle.getXDot(), triangle.getYDot(), 3);
                }
                case 2 -> {
                    Rectangle rectangle = new Rectangle(500, 500);
                    g2d.setColor(rectangle.color);
                    g2d.fillRect(rectangle.posX, rectangle.posY, rectangle.getRWidth(), rectangle.getRHeight());
                }
                case 3 -> {
                    Circle circle = new Circle(500, 500);
                    g2d.setColor(circle.getColor());
                    g2d.fillOval(circle.posX, circle.posY, circle.getR(), circle.getR());
                }
            }
        }
    }

}
