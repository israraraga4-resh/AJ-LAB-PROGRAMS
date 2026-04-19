// 3. Remove the following all elements from the TreeMap then verify that its size is zero andinclude once again following elements and iterate them and check its size(1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”)[ Hint : clear() , size() and put()]     //
		
package LAB2;

import java.util.*;

public class twoP7 {

    public static void main(String[] args) {

        // Creating a TreeMap (stores keys in sorted order)
        Map<Integer, String> map = new TreeMap<>();

        // Adding elements
        map.put(1, "Apple");
        map.put(2, "Strawberry");
        map.put(3, "Pear");
        map.put(4, "Cucumber");
        map.put(5, "Grapes");

        // Display initial size
        System.out.println("Initial size: " + map.size());

        // Removing all elements using clear()
        map.clear();

        // Size after clearing
        System.out.println("After removing all elements, size: " + map.size());

        // Adding elements again
        map.put(1, "Apple");
        map.put(2, "Strawberry");
        map.put(3, "Pear");
        map.put(4, "Cucumber");
        map.put(5, "Grapes");

        // Size after adding elements again
        System.out.println("After adding elements again, size: " + map.size());
    }
}		
		
		
		
		
		
		
		
		