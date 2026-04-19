// 1. Write a java program for getting different colors through ArrayList interface and searchwhether the color &quot;Red&quot; is available or not( Hint : Use ArrayListObj.contains() )//

package PROGRAMS;

import java.util.*;

public class p1 {

    public static void main(String[] args) {

        // Creating an ArrayList to store colors
        List<String> ls = new ArrayList<>();

        // Adding elements (colors) to the ArrayList
        ls.add("Orange");
        ls.add("Green");   // corrected spelling
        ls.add("Pink");
        ls.add("Red");     // using proper case as per question

        // Displaying the list of colors
        System.out.println("Color List: " + ls);

        // Checking whether "Red" is present in the list
        // contains() method returns true if element exists
        if (ls.contains("Red")) {
            System.out.println("Red is available in the list");
        } else {
            System.out.println("Red is not available in the list");
        }
    }
}