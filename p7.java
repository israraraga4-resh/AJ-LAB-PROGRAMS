package PROGRAMS;

import java.util.*;   // single import is enough

public class p7 {

    public static void main(String[] args) {

        // Creating a LinkedList to store colors
        LinkedList<String> ls = new LinkedList<>();

        // Adding elements
        ls.add("Orange");
        ls.add("Green");   // corrected spelling
        ls.add("Pink");
        ls.add("Red");
        ls.add("Blue");

        // Displaying original list
        System.out.println("Original List: " + ls);

        // Using descendingIterator() to traverse in reverse order
        Iterator<String> iterator = ls.descendingIterator();

        System.out.println("Reverse Order:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /*
        // Alternative Method: Using ListIterator (reverse traversal)
        ListIterator<String> listIterator = ls.listIterator(ls.size());

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        */
    }
}