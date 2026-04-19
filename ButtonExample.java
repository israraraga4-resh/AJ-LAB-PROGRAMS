/*
 
4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is pressed” depending upon the Jbutton either  Srilanka or India is pressed by implementing the event handling mechanism with addActionListener( ).

 */

package LAB4; // Package declaration

// Import required classes
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// Main class
public class ButtonExample {

    JLabel l1; // Declare JLabel globally so it can be accessed in event handling

    // Constructor
    ButtonExample() {

        JFrame f = new JFrame("Button Example"); // Create a frame with title

        l1 = new JLabel(); // Create label
        l1.setBounds(50, 50, 700, 100); // Set position and size of label
        l1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 60)); // Set font style and size

        // Create buttons
        JButton b1 = new JButton(" India ");
        JButton b2 = new JButton(" Srilanka ");

        // Set position and size for India button
        b1.setBounds(100, 200, 100, 100);

        // Add action listener to India button
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("India is pressed"); // Set label text when button is clicked
            }
        });

        // Set position and size for Sri Lanka button
        b2.setBounds(400, 200, 100, 100);

        // Add action listener to Sri Lanka button
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("SriLanka is pressed"); // Set label text when button is clicked
            }
        });

        // Add components to frame
        f.add(b1);
        f.add(b2);
        f.add(l1);

        f.setSize(300, 400); // Set frame size
        f.setLayout(null); // Use no layout manager (absolute positioning)
        f.setVisible(true); // Make frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close program on exit
    }

    // Main method
    public static void main(String[] args) {
        new ButtonExample(); // Create object to run program
    }
}