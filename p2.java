package PROGRAMS;

import java.util.*;

public class p2 {

    public static void main(String[] args) {

        // Creating an ArrayList to store colors
        List<String> ls = new ArrayList<>();

        // Adding elements to the list
        ls.add("Orange");
        ls.add("Green");   // corrected spelling (was "geen")
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Displaying original list
        System.out.println("Original List: " + ls);

        // Removing element using index (removes "Pink" at index 2)
        ls.remove(2);
        System.out.println("After removing element at index 2: " + ls);

        // Removing element using object/value ("Blue")
        ls.remove("Blue");
        System.out.println("After removing 'Blue': " + ls);
    }
}