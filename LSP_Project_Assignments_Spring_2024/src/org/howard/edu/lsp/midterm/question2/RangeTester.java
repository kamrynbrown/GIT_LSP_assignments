package org.howard.edu.lsp.midterm.question2;

/**
 * Class for testing the IntegerRange class.
 */
public class RangeTester {
    public static void main(String[] args) {
        // Creating ranges for testing
        IntegerRange range1 = new IntegerRange(1, 10);
        IntegerRange range2 = new IntegerRange(5, 15);
        IntegerRange range3 = new IntegerRange(11, 20);

        // Testing contains method
        System.out.println("Does range1 contain 5? " + range1.contains(5)); // true
        System.out.println("Does range1 contain 15? " + range1.contains(15)); // false

        // Testing overlaps method
        System.out.println("Do range1 and range2 overlap? " + range1.overlaps(range2)); // true
        System.out.println("Do range1 and range3 overlap? " + range1.overlaps(range3)); // false

        // Testing size method
        System.out.println("Size of range1: " + range1.size()); // 10

        // Testing equals method
        IntegerRange range4 = new IntegerRange(1, 10);
        System.out.println("Are range1 and range4 equal? " + range1.equals(range4)); // true
    }
}
