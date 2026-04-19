package PROGRAMS;

import java.util.*;

public class p9 {

    public static void main(String[] args) {

        // Creating a LinkedList to store colors
        LinkedList<String> ls = new LinkedList<>();

        // Adding elements to the list
        ls.add("Orange");
        ls.add("Green");   // corrected spelling (was "geen")
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Iterating through the list using index-based for loop
        for (int i = 0; i < ls.size(); i++) {

            // Printing index and corresponding value
            System.out.println("Index: " + i + " Value: " + ls.get(i));
        }
    }
}