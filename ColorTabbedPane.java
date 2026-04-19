/*
 5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan
 */

package LAB5;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class ColorTabbedPane extends JFrame {

    public ColorTabbedPane() {

        // Set frame title
        setTitle("Color Tabbed Pane");

        // Create panels for each tab
        JPanel cyanPanel = new JPanel();
        JPanel magentaPanel = new JPanel();
        JPanel yellowPanel = new JPanel();

        // Set background colors
        cyanPanel.setBackground(Color.CYAN);
        magentaPanel.setBackground(Color.MAGENTA);
        yellowPanel.setBackground(Color.YELLOW);

        // Create TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Add tabs with respective panels
        tabbedPane.add("Cyan", cyanPanel);
        tabbedPane.add("Magenta", magentaPanel);
        tabbedPane.add("Yellow", yellowPanel);

        // Add ChangeListener to detect tab change
        tabbedPane.addChangeListener(new ChangeListener() {

            @Override
            public void stateChanged(ChangeEvent e) {

                // Get selected tab index
                int selectedIndex = tabbedPane.getSelectedIndex();

                // Get selected tab title
                String selectedTab = tabbedPane.getTitleAt(selectedIndex);

                // Display selected color in console
                System.out.println("Selected Color: " + selectedTab);
            }
        });

        // Add tabbed pane to frame
        add(tabbedPane);

        // Frame settings
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center window
        setVisible(true);
    }

    public static void main(String[] args) {

        // Run the program
        new ColorTabbedPane();
    }
}