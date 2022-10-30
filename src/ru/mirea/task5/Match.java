package ru.mirea.task5;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match extends JFrame {

    private int score1;
    private int score2;
    private String last;
    private String winner;
    public Match()
    {
        super("Match");
        last = "N/A";
        winner = "DRAW";
        score1 = 0;
        score2 = 0;
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);
        JPanel panel = new JPanel();

        panel.setBackground(new Color(7, 160, 7));
        panel.setPreferredSize(new Dimension(400, 250));

        Dimension size = new Dimension(250, 50);
        Border border = BorderFactory.createLineBorder(Color.WHITE, 1);

        JLabel label1 = new JLabel("Result: " + score1 + " X " + score2);
        label1.setForeground(Color.WHITE);
        label1.setPreferredSize(size);
        label1.setBorder(border);
        label1.setHorizontalAlignment(JLabel.CENTER);

        JLabel label2 =  new JLabel("Last Scorer: " + last);
        label2.setForeground(Color.WHITE);
        label2.setPreferredSize(size);
        label2.setBorder(border);
        label2.setHorizontalAlignment(JLabel.CENTER);

        JLabel label3 =  new JLabel("Winner: " + winner);
        label3.setForeground(Color.WHITE);
        label3.setPreferredSize(size);
        label3.setBorder(border);
        label3.setHorizontalAlignment(JLabel.CENTER);

        ActionListener setText = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText("Result: " + score1 + " X " + score2);
                label2.setText("Last Scorer: " + last);
                label3.setText("Winner: " + winner);
            }
        };

        JButton button1 = new JButton("AC Milan");
        button1.setPreferredSize(new Dimension(120, 70));
        button1.setForeground(Color.WHITE);
        button1.setBackground(new Color(211, 21, 21));
        button1.addActionListener(setText);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score1++;
                last = "Milan";
                if (score1 > score2) winner = "Milan";
                else if (score1 == score2) winner = "DRAW";
            }
        });

        JButton button2 = new JButton( "Real Madrid");
        button2.setPreferredSize(new Dimension(120, 70));
        button2.setForeground(Color.WHITE);
        button2.setBackground(new Color(38, 119, 236));
        button2.addActionListener(setText);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score2++;
                last = "Real";
                if (score2 > score1) winner = "Real";
                else if (score1 == score2) winner = "DRAW";
            }
        });

        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);

        getContentPane().add(panel);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Match();
    }

}
