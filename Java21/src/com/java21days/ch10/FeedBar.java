package com.java21days.ch10;

import java.awt.*;
import javax.swing.*;

public class FeedBar extends JFrame {
    
    public FeedBar() {
        super("FeedBar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        // create icons
        ImageIcon loadIcon = new ImageIcon("load.gif");
        ImageIcon saveIcon = new ImageIcon("save.gif");
        ImageIcon subIcon = new ImageIcon("subscibe.gif");
        ImageIcon unsubIcon = new ImageIcon("unsubscribe.gif");
        // create buttons
        JButton load = new JButton("Load", loadIcon);
        JButton save = new JButton("Save", saveIcon);
        JButton sub = new JButton("Subscribe", subIcon);
        JButton unsub = new JButton("Unsubscibe", unsubIcon);
        // add buttons to toolbar
        JToolBar bar = new JToolBar();
        bar.add(load);
        bar.add(save);
        bar.add(sub);
        bar.add(unsub);
        // Prepare user interface
        JTextArea edit = new JTextArea(8, 40);
        JScrollPane scroll = new JScrollPane(edit);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add("North", bar);
        add("Center", scroll);
        pack();
        setVisible(true);
    }
    
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.err.println("Couldn't use the systm look and feel: " + e);
        }
    }
    
    public static void main(String[] args) {
        FeedBar frame = new FeedBar();
    }
}
