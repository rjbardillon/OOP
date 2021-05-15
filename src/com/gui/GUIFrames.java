package com.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIFrames implements ActionListener {
    private int counter = 0;
    private JFrame jFrame = new JFrame();
    private JPanel jPanel = new JPanel();
    private JButton jButton = new JButton("Click Here");
    private JLabel jLabel = new JLabel("Number of Clicks: 0");

    public GUIFrames() {
        jPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 10));
        jPanel.setLayout(new GridLayout(0, 1));
        jPanel.add(jLabel);
        jPanel.add(jButton);
        jButton.addActionListener(this);

        jFrame.add(jPanel, BorderLayout.CENTER);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Sample GUI");
        jFrame.pack();
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUIFrames();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        jLabel.setText("Number of clicks: " + counter);
    }
}
