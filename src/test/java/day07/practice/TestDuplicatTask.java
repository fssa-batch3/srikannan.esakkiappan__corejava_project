package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestDuplicatTask {
	
	@Test
	public void testValidTask() {

		Assertions.assertTrue(DuplicatTask.validatetaskName("Taskplay"));

	}

	@Test
	public void testInValidTask() {

		try {
			DuplicatTask.validatetaskName(null);
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("TaskName cannot be null or empty", ex.getMessage());
		}

		try {
			DuplicatTask.validatetaskName("a");
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("The  task name should be  minimum 2 letters and maximum 200 letters", ex.getMessage());
		}

	}
	
	
	
	
	
	@Test
	public void testValidDate() {
		 LocalDate currentDate = LocalDate.now();
	        LocalDate futureDate = currentDate.plusDays(7);

		Assertions.assertTrue(DuplicatTask.validateTaskDate(futureDate));

	}
	
	@Test
	public void testInValidDate() {
		
		
		try {
			DuplicatTask.validateTaskDate(null);
			Assertions.fail("Validatepriority failed");
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Task date cannot be null", ex.getMessage());
		}
		 LocalDate currentDate = LocalDate.now();
	        LocalDate lastDate = currentDate.minusDays(7);
	        
	    	try {
	    		DuplicatTask.validateTaskDate(lastDate);
				Assertions.fail("Validatepriority failed");
			} catch (IllegalArgumentException ex) {
				Assertions.assertEquals("Task date cannot be in the past.", ex.getMessage());
			}
	        


	}
	
	
	
	
	
	@Test
	public void testValidTaskMethod() {

		ArrayList<DuplicatTask> taskList = new ArrayList<>();
		taskList.add(new DuplicatTask(2, "taseat", LocalDate.of(2023, 7, 15)));
		taskList.add(new DuplicatTask(1, "tasklearn", LocalDate.of(2023, 7, 17)));
		taskList.add(new DuplicatTask(3, "tasklearntwo", LocalDate.of(2023, 7, 19)));

		Assertions.assertTrue(DuplicatTask.validateDuplicatemethod(taskList));

	}
	
	
	
	@Test
	public void testInValidTaskMethod() {

		ArrayList<DuplicatTask> taskList = new ArrayList<>();
		DuplicatTask t1 = new DuplicatTask(1, "taskplay", LocalDate.of(2023, 7, 15));
		taskList.add(t1);
		taskList.add(t1);
		taskList.add(new DuplicatTask(2, "taseat", LocalDate.of(2023, 7, 15)));
		taskList.add(new DuplicatTask(3, "tasklearn", LocalDate.of(2023, 7, 17)));
		try {
		Assertions.assertTrue(DuplicatTask.validateDuplicatemethod(taskList));
		Assertions.fail("Validatepriority failed");
		}
		catch (IllegalArgumentException e) {
			Assertions.assertEquals("duplicate task found", e.getMessage());
		}
	}
	
	
	
	
}
