/*
 1. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass  is pressed” depending upon the Jbutton with image  either  Digital Clock or  Hour Glass is pressed by implementing the event handling mechanism with addActionListener( ).


 */


package LAB4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClockButtonDemo {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Clock Button Demo");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Label to display message
        JLabel label = new JLabel("Click a button");
        label.setFont(new Font("Arial", Font.BOLD, 16));

        // Load Images (Make sure images are in your project folder)
        ImageIcon digitalIcon = new ImageIcon("digital.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        // Create Buttons with images
        JButton digitalBtn = new JButton("Digital Clock", digitalIcon);
        JButton hourglassBtn = new JButton("Hour Glass", hourglassIcon);

        // Add ActionListener to Digital Clock button
        digitalBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        // Add ActionListener to Hour Glass button
        hourglassBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        // Add components to frame
        frame.add(digitalBtn);
        frame.add(hourglassBtn);
        frame.add(label);

        // Make frame visible
        frame.setVisible(true);
    }
}