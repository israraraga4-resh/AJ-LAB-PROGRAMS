// 3. Include the following elements into the LinkedHashMap called programminglanguages and print asfollows.Java was developed in 1995Python was developed in 1991.JavaScript was developed in 1995C++ was developed in 1985       //
package LAB2;

import java.util.*;   // single import is enough

public class twoP11 {

    public static void main(String[] args) {

        // Creating a LinkedHashMap to store programming languages and their release years
        Map<String, Integer> programmingLanguages = new LinkedHashMap<>();

        // Adding key-value pairs
        programmingLanguages.put("Java", 1995);
        programmingLanguages.put("Python", 1991);
        programmingLanguages.put("JavaScript", 1995);
        programmingLanguages.put("C++", 1985);

        // Iterating over the map using entrySet()
        for (Map.Entry<String, Integer> entry : programmingLanguages.entrySet()) {

            // Printing key and value in formatted form
            System.out.println(entry.getKey() + " was developed in " + entry.getValue());
        }
    }
}


