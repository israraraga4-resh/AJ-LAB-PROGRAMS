package PROGRAMS;

import java.util.*;

public class p3 {

    public static void main(String[] args) {

        // Creating an ArrayList to store colors
        List<String> ls = new ArrayList<>();

        // Adding elements to the list
        ls.add("Orange");
        ls.add("Green");   // corrected spelling
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Displaying list before sorting
        System.out.println("Before sorting:");
        System.out.println(ls);

        // Sorting the list in ascending (alphabetical) order
        Collections.sort(ls);

        // Displaying list after sorting
        System.out.println("After sorting:");
        System.out.println(ls);
    }
}