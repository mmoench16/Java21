package com.java21days.ch9;

import javax.swing.*;

public class PasswordFrame extends JFrame {
    PasswordInnerFrame pass;
    
    public PasswordFrame() {
        super("Ask password");
        this.pass = new PasswordInnerFrame();
        setSize(540,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pass.setVisible(true);
    }
    
    public static void main(String[] args) {
        PasswordFrame pf = new PasswordFrame();
    }
}

class PasswordInnerFrame extends JFrame {
    public PasswordInnerFrame() {
        super("Password (Inner) Frame");
        setSize(210, 130);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel pane = new JPanel();
        JLabel usernameLabel = new JLabel("Username: ");
        JTextField username = new JTextField(8);
        JLabel passwordLabel = new JLabel("Password: ");
        JPasswordField password = new JPasswordField(8);
        JButton ok = new JButton("OK");
        JButton cancel = new JButton("Cancel");
        pane.add(usernameLabel);
        pane.add(username);
        pane.add(passwordLabel);
        pane.add(password);
        pane.add(ok);
        pane.add(cancel);
        setContentPane(pane);
        setVisible(false);
    }
}
