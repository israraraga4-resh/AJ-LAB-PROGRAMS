/*
 5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display them on console
whenever the countries are selected on the list.
 */


package LAB5;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListExample extends JFrame {

    // Declare JList
    private JList<String> countryList;

    public JListExample() {

        // Create the model (used to store list data)
        DefaultListModel<String> listModel = new DefaultListModel<>();

        // Add elements (countries) to the model
        listModel.addElement("USA");
        listModel.addElement("India");
        listModel.addElement("Vietnam");
        listModel.addElement("Canada");
        listModel.addElement("Denmark");
        listModel.addElement("France");
        listModel.addElement("Great Britain");
        listModel.addElement("Japan");
        listModel.addElement("Africa");
        listModel.addElement("Greenland");
        listModel.addElement("Singapore");
        listModel.addElement("");   // empty element (optional)

        // Create JList using the model
        countryList = new JList<>(listModel);

        // Add ListSelectionListener to handle selection events
        countryList.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {

                // Check if selection is final (not adjusting)
                if (!e.getValueIsAdjusting()) {

                    // Get selected values as a list
                    final List<String> selectedValuesList =
                            countryList.getSelectedValuesList();

                    // Print selected items to console
                    System.out.println(selectedValuesList);
                }
            }
        });

        // Add JList inside JScrollPane (for scrolling)
        add(new JScrollPane(countryList));

        // Frame settings
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JList Example");
        this.setSize(200, 200);

        // Center the frame on screen
        this.setLocationRelativeTo(null);

        // Make frame visible
        this.setVisible(true);
    }

    public static void main(String[] args) {

        // Create object to run program
        new JListExample();
    }
}