// 4.Write a Java program to check whether a map contains Key-Values mappings (empty) or notafter adding all the following elements into Hashmap and after removing all the elements fromthe Hashmap.(1, "Red"),(2, "Green"), (3, "Black"), (4, "White"),(5, "Blue")     //


package LAB2;

import java.util.*;

public class twoP4 {

    public static void main(String[] args) {

        // Creating a HashMap
        Map<Integer, String> map1 = new HashMap<>();

        // Adding elements to the map
        map1.put(1, "Red");
        map1.put(2, "Green");
        map1.put(3, "Black");
        map1.put(4, "White");

        // Checking if map is empty before clearing
        boolean res = map1.isEmpty();
        System.out.println("Before removing elements, is map empty? " + res);

        // Removing all elements using clear()
        map1.clear();

        // Checking if map is empty after clearing
        res = map1.isEmpty();
        System.out.println("After removing elements, is map empty? " + res);
    }
}
