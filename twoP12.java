//  4. Add elements in the same order in the LinkedHaspMap using for() loop and put()String[] keys = {"C", "A", "B", "E", "D"};Integer[] values = {3, 1, 2, 5, 4};  //

package LAB2;

import java.util.*;

public class twoP12 {

    public static void main(String[] args) {

        // Arrays of keys and values
        String[] keys = {"C", "A", "B", "E", "D"};
        Integer[] values = {3, 1, 2, 5, 4};

        // Creating a LinkedHashMap (maintains insertion order)
        Map<String, Integer> lMap = new LinkedHashMap<>();

        // Inserting elements from arrays into the map
        for (int i = 0; i < keys.length; i++) {
            lMap.put(keys[i], values[i]);
        }

        // Displaying the map
        System.out.println("LinkedHashMap: " + lMap);
    }
}

