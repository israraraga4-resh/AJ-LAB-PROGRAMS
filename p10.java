package PROGRAMS;

import java.util.*;

public class p10 {

    public static void main(String[] args) {

        // Creating a LinkedList to store colors
        LinkedList<String> ls = new LinkedList<>();

        // Adding elements to the list
        ls.add("Orange");
        ls.add("Green");   // corrected spelling (was "geen")
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Displaying list before swapping
        System.out.println("Before swapping:");
        System.out.println(ls);

        // Swapping elements at index 2 and index 3
        Collections.swap(ls, 2, 3);

        // Displaying list after swapping
        System.out.println("After swapping:");
        System.out.println(ls);
    }
}