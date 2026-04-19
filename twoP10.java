// 2. Include the following elements into the LinkedHashMap called programminglanguages and print allof them.("Java", 1995);("Python", 1991);(“JavaScript", 1995);("C++", 1985);    // 
package LAB2;

import java.util.*;   // single import is enough

public class twoP10 {

    public static void main(String[] args) {

        // Creating a LinkedHashMap to store programming languages and their release years
        // LinkedHashMap maintains insertion order
        Map<String, Integer> programmingLanguages = new LinkedHashMap<>();

        // Adding key-value pairs
        programmingLanguages.put("Java", 1995);
        programmingLanguages.put("Python", 1991);
        programmingLanguages.put("JavaScript", 1995);
        programmingLanguages.put("C++", 1985);

        // Displaying the map
        System.out.println("Programming Languages (Insertion Order Maintained):");
        System.out.println(programmingLanguages);
    }
}		
		
		