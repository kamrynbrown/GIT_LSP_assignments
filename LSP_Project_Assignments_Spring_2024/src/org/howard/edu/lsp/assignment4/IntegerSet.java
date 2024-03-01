package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;
/**
 * The IntegerSet class represents a set of integers and provides various operations
 * for manipulating and performing calculations with sets.
 */
public class IntegerSet  {
	/**
	 * Store the set elements in an ArrayList
	 */
	private List<Integer> set = new ArrayList<Integer>();
	
	  /**
	   * Constructs an empty IntegerSet.
	   */
	  public IntegerSet() {
	  }
	
	  // Constructor if you want to pass in already initialized
	  /**
	   * Constructs an IntegerSet initialized with the elements of the given ArrayList.
	   * @param set The ArrayList containing initial elements for the set
	   */
	  public IntegerSet(ArrayList<Integer> set) {
		  this.set = set;
	  }
	
	  /**
	   *  Clears the internal representation of the set
	   */
	  public void clear() {
		  set.clear();
	  }
	
	  /**
	   * Returns the length of the set
	   * @return The number of elements in the set
	   */
	  public int length() {
	      return set.size();
	  } // returns the length
	
	  /**
	   * Compares this IntegerSet with the specified object for equality.
	   * @param o The object to be compared for equality
	   * @return true if the specified object is equal to this IntegerSet, false otherwise
	   */
	  @Override
	  public boolean equals(Object o) {
		  if (o==this)
			  return true;
		  if(!(o instanceof IntegerSet))
			  return false;
	      IntegerSet intSet=(IntegerSet)o;
	      return this.set.containsAll(intSet.set) && intSet.set.containsAll(this.set);
	  } 
	
	  /**
	   * Checks if the set contains the specified value.
	   * @param value The value to be checked for existence in the set
	   * @return true if the set contains the value, false otherwise
	   */
	  public boolean contains(int value) {
		  return set.contains(value);
	  }
	
	  /**
	   * Returns the largest item in the set. 
	   * @return The largest item in the set
	   * @throws IntegerSetException if the set is empty
	   */
	  public int largest() {
		 if(set.isEmpty()){
			 throw new IntegerSetException("set is empty");
	     }
	     int max=set.get(0);
	     for (int i=1; i<set.size();i++){
	         if(set.get(i)>max){
	             max=set.get(i);
	         }
	     }
	     return max;
	  }
	
	  /**
	   * Returns the smallest item in the set.
	   * @return The smallest item in the set
	   * @throws IntegerSetException if the set is empty
	   */
	  public int smallest() {
		 if(set.isEmpty()){
			 throw new IntegerSetException("set is empty");
	     }
	     int min=set.get(0);
	     for (int i=1; i<set.size();i++){
	         if(set.get(i)<min){
	             min=set.get(i);
	         }
	     }
	     return min;
	  }
	
	 /**
	  * Adds an item to the set if it's not already present.	
	  * @param item The item to be added to the set
	  */
	  public void add(int item) {
		 if(!set.contains(item)){
			 set.add(item);
	        }
	  }
	
	  /**
	   * Removes an item from the set if it exists.
	   * @param item The item to be removed from the set
	   */
	  public void remove(int item) {
	     set.remove((Integer) item);
	  } 
	
	  /**
	   * Performs the union operation with another IntegerSet, modifying the current set.
	   * @param intSetb The IntegerSet to perform the union with
	   */
	  public void union(IntegerSet intSetb) {
	     for(int item: intSetb.set){
	         if(!set.contains(item)){
	             set.add(item);
	         }
	     }
	  }
	
	  /**
	   * Performs the intersection operation with another IntegerSet, modifying the current set.
	   * @param intSetb The IntegerSet to perform the intersection with
	   */
	  public void intersect(IntegerSet intSetb) {
		  List<Integer> intersection = new ArrayList<>();
		    for (int item : set) {
		        if (intSetb.contains(item)) {
		            intersection.add(item);
		        }
		    }
		    set = intersection;
	  } 
	 
	  /**
	   * Performs the difference operation with another IntegerSet, modifying the current set.
	   * @param intSetb The IntegerSet to perform the difference with
	   */
	  public void diff(IntegerSet intSetb){
		  List<Integer> difference = new ArrayList<>();
		    for (int item : set) {
		        if (!intSetb.contains(item)) {
		            difference.add(item);
		        }
		    }
		    set = difference;
	  }
	
	  /**
	   * Computes the complement of the current set with respect to another set,
	   * modifying the current set to contain all elements not in the provided set.
	   * @param intSetb The IntegerSet to compute the complement with
	   */
	  public void complement(IntegerSet intSetb) {
		  List<Integer> complementSet = new ArrayList<>();
		    for (int item : intSetb.set) {
		        if (!set.contains(item)) {
		            complementSet.add(item);
		        }
		    }
		    set = complementSet;
	  }
	
	  /**
	   * Checks if the set is empty.
	   * @return true if the set is empty, false otherwise
	   */
	  boolean isEmpty(){
		 return set.isEmpty();
	  } 
	
	  /**
	   * Returns a string representation of the set.
	   * @return A string representation of the set 
	   */
	  @Override
	  public String toString() {
		 return set.toString();
	    }	// return String representation of your set
	}