package day07.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDuplicatNumber {
	
	@Test
	public void testValidArray() {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(1);
		arr.add(4);
		arr.add(5);
		arr.add(7);
		arr.add(7);
		
		HashSet<Integer> unique = new HashSet<Integer>(Arrays.asList(2, 4, 5, 7));
		try {
			DuplicatNumber.removeDuplicateElements(arr);
			boolean valid=DuplicatNumber.validateDuplicatemethod(arr, unique);
			Assertions.assertTrue(valid);
			Assertions.fail("Validation failed");
		}
		catch(Exception ex) 
		{
			Assertions.assertEquals("This array is not contain all unique elements.", ex.getMessage());
		}

	}
	
	
	
	@Test
	public void testInValidArray() {

		try {
			DuplicatNumber.removeDuplicateElements(null);
			Assertions.fail("Validatepriority failed");
		} catch (Exception ex) {
			Assertions.assertEquals("Array cannot be null", ex.getMessage());
		}

	

	}
	
}