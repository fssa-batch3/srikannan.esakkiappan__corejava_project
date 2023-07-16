package day06.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRemoveDuplicate {

	@Test
	public void testValidRemoveDuplicate() {
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Chennai");
		
		Assertions.assertTrue(RemoveDuplicate.myArray(cityList));	
	}
	
	@Test
	public void testInvaildNullArrayList() throws IllegalArgumentException {
		
		try {
			RemoveDuplicate.myArray(null);
			Assertions.fail("Test Case Is Failed");
		}catch(IllegalArgumentException ex) {
			assertEquals("ArrayList Cannot be Null", ex.getMessage());
		}
		
	}
}
