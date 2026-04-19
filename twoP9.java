//  1. Write a Java program to traverse / iterate all the keys with the specified value in a linkedHashMap (1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”) and displayonly elderly entered 4 elements only[ hint : Refer to 5. LinkedHashMap Demonstration of worked out example]   //
		package LAB2;

import java.util.*;

public class twoP9 {

    public static void main(String[] args) {

        System.out.println("=== LinkedHashMap Demonstration ===");

        // Creating LinkedHashMap with custom logic to remove eldest entry
        Map<Integer, String> map = new LinkedHashMap<Integer, String>() {

            // Overriding removeEldestEntry method
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {

                // Remove oldest entry when size exceeds 4
                return size() > 4;
            }
        };

        // Adding elements
        map.put(1, "Apple");
        map.put(2, "Strawberry");
        map.put(3, "Pear");
        map.put(4, "Cucumber");

        // At this point, size = 4
        System.out.println("Initial Map: " + map);

        // Adding 5th element → oldest (1=Apple) will be removed
        map.put(5, "Grapes");

        // Displaying map after removal of eldest entry
        System.out.println("After adding 5 (eldest removed): " + map);

        // Iterating over entries
        System.out.println("\nIterating over entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}