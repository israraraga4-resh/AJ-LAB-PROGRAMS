// 4. Write a Java program to get the first (lowest) key and the last (highest) key currently in thefollowing Treemap.("C2", "Red"),("C1", "Green"), ("C4", "Black"), ("C3", "White")[ Hint : firstKey() and lastKey() ]   //
		
	package LAB2;

import java.util.*;   // single import is enough

public class twoP8 {

    public static void main(String[] args) {

        // Creating a TreeMap (keys are stored in sorted order)
        TreeMap<String, String> map1 = new TreeMap<>();

        // Adding key-value pairs (in random order)
        map1.put("c2", "Red");
        map1.put("c1", "Green");
        map1.put("c4", "Black");
        map1.put("c3", "White");

        // Displaying the TreeMap (automatically sorted by keys)
        System.out.println("TreeMap: " + map1);

        // Getting the first (smallest) key
        System.out.println("The first key is: " + map1.firstKey());

        // Getting the last (largest) key
        System.out.println("The last key is: " + map1.lastKey());
    }
}	
		
		
		
		