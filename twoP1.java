// Hashmaps1. Write a Java program to traverse / iterate all the keys with the specified value in a HashMap(1,”Apple”), (2,”Strawberry”), (3,”Pear”), (4,”Cucumber”), (5,”Grapes”)[ hint : 6. Iterating Over Map in the worked out example]      //


package LAB2;

import java.util.*;   // single import is enough

public class twoP1 {

    public static void main(String[] args) {

        // Creating a HashMap with Integer keys and String values
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put(1, "Apple");
        hashMap.put(2, "Strawberry");
        hashMap.put(3, "Pear");
        hashMap.put(4, "Cucumber");
        hashMap.put(5, "Grapes");

        // Displaying the HashMap
        System.out.println("HashMap: " + hashMap);

        // Iterating over the HashMap using entrySet()
        // entrySet() returns a set of key-value pairs
        System.out.println("\nIterating over entries:");

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {

            // getKey() returns the key
            // getValue() returns the value
            System.out.println("Key: " + entry.getKey() +
                               " -> Value: " + entry.getValue());
        }
    }
}