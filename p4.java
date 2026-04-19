package PROGRAMS;

import java.util.*;

public class p4 {

    public static void main(String[] args) {

        // Creating an ArrayList to store colors
        List<String> ls = new ArrayList<>();

        // Adding elements to the list
        ls.add("Orange");
        ls.add("Green");   // corrected spelling (was "geen")
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Displaying the original list
        System.out.println("Original List: " + ls);

        // Using subList(fromIndex, toIndex)
        // It returns elements from index 0 to 1 (2 is excluded)
        System.out.println("Using subList (0,2):");
        System.out.println(ls.subList(0, 2));
    }
}