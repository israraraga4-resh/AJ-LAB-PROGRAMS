package PROGRAMS;

import java.util.*;

public class p5 {

    public static void main(String[] args) {

        // Creating an ArrayList to store colors
        List<String> ls = new ArrayList<>();

        // Adding elements to the list
        ls.add("Orange");
        ls.add("Green");   // consistent capitalization
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Element to be removed
        String str = "Green";

        // Displaying original list
        System.out.println("Original List: " + ls);

        // Removing element by value
        // remove(Object o) returns true if element is found and removed
        boolean isRemoved = ls.remove(str);

        System.out.println("Is '" + str + "' removed? " + isRemoved);

        // Displaying updated list
        System.out.println("Updated List: " + ls);
    }
}