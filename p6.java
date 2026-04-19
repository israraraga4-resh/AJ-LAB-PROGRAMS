package PROGRAMS;

import java.util.*;

public class p6 {

    public static void main(String[] args) {

        // Creating a LinkedList to store colors
        List<String> ls = new LinkedList<>();

        // Adding elements to the list
        ls.add("Orange");
        ls.add("Green");   // corrected spelling (was "geen")
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Creating a ListIterator starting from index 2
        // It will start iteration from the 3rd element (index 2)
        ListIterator<String> iterator = ls.listIterator(2);

        // Iterating through the list from index 2 to end
        System.out.println("Elements from index 2 onwards:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}