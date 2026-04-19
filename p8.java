package PROGRAMS;

import java.util.*;

public class p8 {

    public static void main(String[] args) {

        // Creating a LinkedList to store colors
        LinkedList<String> ls = new LinkedList<>();

        // Adding elements to the list
        ls.add("Orange");
        ls.add("Green");   // corrected spelling (was "geen")
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Displaying original list
        System.out.println("Original List: " + ls);

        // Adding element at the end using addLast()
        ls.addLast("Pink");   // duplicate allowed

        // Displaying updated list
        System.out.println("After adding element at last: " + ls);
    }
}