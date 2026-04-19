// 2. Write a Java program to search for keys C4 and C5 are present or not in the following Tree Map.("C1", "Red"); ("C2", "Green"); ("C3", "Black");("C4", "White")       //

package LAB2;

import java.util.*;   // single import is enough

public class twoP6 {

    public static void main(String[] args) {

        // Creating a TreeMap (keys will be sorted)
        Map<String, String> map1 = new TreeMap<>();

        // Adding key-value pairs
        map1.put("c1", "Red");
        map1.put("c2", "Green");
        map1.put("c3", "Black");
        map1.put("c4", "White");

        // Checking whether specific keys exist in the map

        // containsKey() returns true if key is present
        System.out.println("Whether it contains 'c4' or not: " + map1.containsKey("c4"));

        // Checking for a key that does not exist
        System.out.println("Whether it contains 'c5' or not: " + map1.containsKey("c5"));
    }
}