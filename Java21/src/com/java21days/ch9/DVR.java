package com.java21days.ch9;

import javax.swing.*;

public class DVR extends JFrame {
    JButton play = new JButton("Play");
    JButton stopReject = new JButton("Stop/Reject");
    JButton rewind = new JButton("Rewind");
    JButton ff = new JButton("Fast-Forward");
    JButton pause = new JButton("Pause");
    
    public DVR() {
        super("DVR");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.add(play);
        panel.add(stopReject);
        panel.add(rewind);
        panel.add(ff);
        panel.add(pause);
        add(panel);
        pack();
        setVisible(true);
    }
    
    public static void main(String[] args) {
        DVR dvr = new DVR();
    }
}
