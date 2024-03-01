package org.howard.edu.lsp.assignments4;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        // Create an empty IntegerSet
        IntegerSet set1 = new IntegerSet();

        // Add some elements to the set
        set1.add(5);
        set1.add(3);
        set1.add(8);
        set1.add(2);
        System.out.println("Set 1: " + set1);

        // Create another IntegerSet with initial elements
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(3);
        elements.add(7);
        elements.add(2);
        IntegerSet set2 = new IntegerSet(elements);
        System.out.println("Set 2: " + set2);

        // Test various operations
        System.out.println("Length of Set 1: " + set1.length());
        System.out.println("Is Set 1 empty? " + set1.isEmpty());

        try {
            System.out.println("Largest element in Set 1: " + set1.largest());
            System.out.println("Smallest element in Set 1: " + set1.smallest());
        } catch (IntegerSetException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Does Set 1 contain 5? " + set1.contains(5));
        System.out.println("Does Set 1 contain 10? " + set1.contains(10));

        // Perform set operations
        set1.union(set2); //set 1 altered
        System.out.println("Union of Set 1 and Set 2: " + set1);

        set1.intersect(set2); //set 1 altered
        System.out.println("Intersection of Set 1 and Set 2: " + set1);

        set1.diff(set2); //set 1 altered
        System.out.println("Difference of Set 1 and Set 2: " + set1);

        set1.complement(set2); //set 1 altered
        System.out.println("Complement of Set 1 with respect to Set 2: " + set1);

        // Clear the set and test again
        set1.clear();
        System.out.println("After clearing, Set 1: " + set1);
        System.out.println("Is Set 1 empty now? " + set1.isEmpty());
    }
}
