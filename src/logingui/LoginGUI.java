/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logingui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Zippy
 */
public class LoginGUI implements ActionListener {
    
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordField;
    private static JButton button;
    private static JLabel success;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        
        panel.setLayout(null);
        
        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        
        passwordField = new JPasswordField();
        passwordField.setBounds(100, 50, 165, 25);
        panel.add(passwordField);
        
        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new LoginGUI());
        panel.add(button);
        
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordField.getText();
        
        if(user.equals("Taylor") && password.equals("Password")) {
            success.setText("Login susccessful!");
        }
    }
    
}
