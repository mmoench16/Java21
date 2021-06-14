package com.java21days.ch10;

import java.awt.*;
import javax.swing.*;

public class ProgressMonitor2 extends JFrame {
    JProgressBar current;
    JTextArea out;
    JButton find;
    JTextField numField;
    int num = 0;
    
    public ProgressMonitor2() {
        super("Progress Monitor 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 125);
        setLayout(new BorderLayout());
        current = new JProgressBar(0, 2000);
        current.setValue(0);
        current.setStringPainted(true);
        add(current, BorderLayout.CENTER);
        numField = new JTextField(num);
        add(numField, BorderLayout.SOUTH);
    }
    
    public void iterate() {
        while (num < 2000) {
            current.setValue(num);
            numField.setText("" + num);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // nothing
            }
            num += 95;
        }
    }
    
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.err.println("Couldn't use the systm look and feel: " + e);
        }
    }
    
    public static void main(String[] args) {
        ProgressMonitor2.setLookAndFeel();
        ProgressMonitor2 frame = new ProgressMonitor2();
        frame.setVisible(true);
        frame.iterate();
    }
}

