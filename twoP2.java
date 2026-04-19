// 2. Remove the following all elements from the HashMap then verify that its size is zero andinclude once again following elements and check its size(1,”Banana”), (2,”Orange”), (3,”Guava”), (4,”Pomegranate ”), (5,”Amla”)[ Hint : clear() , size() and put()]    //


package LAB2;

import java.util.*;

public class twoP2 {

    public static void main(String[] args) {

        // Creating a Map (HashMap implementation)
        Map<Integer, String> hashMap = new HashMap<>();

        // Adding key-value pairs
        hashMap.put(1, "Apple");
        hashMap.put(2, "Strawberry");
        hashMap.put(3, "Pear");
        hashMap.put(4, "Cucumber");
        hashMap.put(5, "Grapes");

        // Displaying initial size
        System.out.println("Initial size: " + hashMap.size());

        // Removing all elements using clear()
        hashMap.clear();

        // Size after clearing the map
        System.out.println("After removing all elements, size: " + hashMap.size());

        // Adding elements again
        hashMap.put(1, "Apple");
        hashMap.put(2, "Strawberry");
        hashMap.put(3, "Pear");
        hashMap.put(4, "Cucumber");
        hashMap.put(5, "Grapes");

        // Size after adding elements again
        System.out.println("After adding elements again, size: " + hashMap.size());
    }
}