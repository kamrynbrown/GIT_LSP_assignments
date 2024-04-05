package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	private IntegerSet set;
	
	@BeforeEach
	public void setUp() {
		set = new IntegerSet();
	}
	
	@Test
	public void testClear() {
		set.add(6);
		set.add(0);
		set.clear();
		assertTrue(set.isEmpty());
	}
	
	@Test
	public void testLength() {
		set.add(1);
		set.add(3);
		set.add(0);
		assertEquals(3, set.length());
	}
	
	@Test
	public void testEquals() {
		IntegerSet setA = new IntegerSet(new ArrayList<>(Arrays.asList(4,5,6)));
		IntegerSet setB = new IntegerSet(new ArrayList<>(Arrays.asList(6,5,4)));
		assertTrue(setA.equals(setB));
	}
	
	@Test
	public void testContains() {
		set.add(10);
		set.add(15);
		assertTrue(set.contains(15));
		assertFalse(set.contains(20));
	}
	
	@Test
    @DisplayName("Test case for largest method with empty set")
    public void testLargestEmptySet() {
        assertThrows(IntegerSetException.class, () -> set.largest());
    }
	
	@Test
	public void testLargest() {
		set.add(18);
		set.add(13);
		set.add(0);
		assertEquals(18, set.largest());
	}
	
	@Test
    @DisplayName("Test case for smallest method with empty set")
    public void testSmallestEmptySet() {
        assertThrows(IntegerSetException.class, () -> set.smallest());
    }
	
	@Test
	public void testSmallest() {
		set.add(9);
		set.add(18);
		set.add(5);
		assertEquals(5, set.smallest());
	}
	
	@Test
	public void testAdd() {
		set.add(5);
		assertTrue(set.contains(5));
	}
	
	@Test
	public void testRemove() {
		set.add(17);
		set.add(4);
		set.remove(17);
		assertFalse(set.contains(17));
	}
	
	@Test
	public void testUnion() {
		set.add(6);
		set.add(9);
		IntegerSet setB = new IntegerSet(new ArrayList<>(Arrays.asList(3, 9, 12)));
		set.union(setB);
		assertEquals("[6, 9, 3, 12]", set.toString());
	}
	
	@Test
	public void testIntersect() {
		set.add(23);
		set.add(2);
		IntegerSet setB = new IntegerSet(new ArrayList<>(Arrays.asList(8, 10, 2)));
		set.intersect(setB);
		assertEquals("[2]", set.toString());
	}
	
	@Test
	public void testDiff() {
		set.add(0);
		set.add(1);
		set.add(3);
		IntegerSet setB = new IntegerSet(new ArrayList<>(Arrays.asList(1, 3, 8)));
		set.diff(setB);
		assertEquals("[0]", set.toString());
	}
	
	@Test
	public void testComplement() {
		set.add(10);
		set.add(6);
		set.add(8);
		IntegerSet setB = new IntegerSet(new ArrayList<>(Arrays.asList(10, 12, 14, 6)));
		set.complement(setB);
		assertEquals("[10, 12, 14]", set.toString());
	}
	
	@Test
	public void testisEmpty() {
		assertTrue(set.isEmpty());
		set.add(14);
		assertFalse(set.isEmpty());
	}
	
	@Test
	public void testtoString() {
		set.add(4);
		set.add(5);
		assertEquals("[4, 5]", set.toString());
	}

}
