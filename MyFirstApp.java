package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFirstApp extends JFrame implements ActionListener {

    private JTextField textField;
    private JButton b;

    MyFirstApp() {
        // Set frame properties
        setLayout(null);
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create TextField
        textField = new JTextField();
        textField.setBounds(100, 50, 200, 30);
        add(textField);

        // Create Button
        b = new JButton("Click");
        b.setBounds(100, 100, 200, 50);
        add(b);

        // Add Action Listener
        b.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Ohh !! You have clicked!");
        textField.setText("Button Clicked!");
    }

    public static void main(String[] args) {
        new MyFirstApp();
    }
}
