package day06.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestTask {

	@Test
	public void testValidAddTaskToArrayList() {

		Task task = new Task("Read Books", 2);

		Assertions.assertTrue(Task.addTaskToList(task));

	}
	
	
	@Test
	public void testInvaildNullTaskName() throws IllegalArgumentException {
		
		Task task = new Task(null, 2);
		
		try {
			
			Task.addTaskToList(task);
			Assertions.fail("Task Name Is Null");
			
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Task Name Cannot be Null", ex.getMessage());
		}
		
	}
	
	@Test
	public void testInvaildPriority() throws IllegalArgumentException {
		
		Task task = new Task("Read Book", 6);
		
		try {
			
			Task.addTaskToList(task);
			Assertions.fail("Task Priority is More then 5 or less then 1");
			
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Task Priority must be 1 to 5", ex.getMessage());
		}
		
	}
}