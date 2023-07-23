package day09.practice;


import java.time.LocalDate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTaskDeadLine {
	
	
	@Test

	public void testValidarray1() {

		ArrayList<TaskSort> taskList = new ArrayList<>();
	
		taskList.add(new TaskSort(1, "taseat", LocalDate.of(2023, 7, 19)));
		taskList.add(new TaskSort(5, "tasklearn", LocalDate.of(2023, 7, 11)));
		taskList.add(new TaskSort(2, "taseat", LocalDate.of(2023, 7, 15)));
		taskList.add(new TaskSort(3, "tasklearn", LocalDate.of(2023, 7, 17)));

		ArrayList<TaskSort> taskList2 = new ArrayList<>();
		taskList2.add(new TaskSort(5, "tasklearn", LocalDate.of(2023, 7, 11)));
		taskList2.add(new TaskSort(2, "taseat", LocalDate.of(2023, 7, 15)));
		taskList2.add(new TaskSort(3, "tasklearn", LocalDate.of(2023, 7, 17)));
		taskList2.add(new TaskSort(1, "taseat", LocalDate.of(2023, 7, 19)));
		ArrayList<TaskSort> actualUniqueList1 = TaskSort.sortNumberTask(taskList);
		

		Assertions.assertIterableEquals(actualUniqueList1,taskList2);
		

	}
	
	
	
	@Test

	public void testInValid() {


		try {

			TaskSort.sortNumberTask(null);
			Assertions.fail("testInValidarray failed");
		} catch (IllegalArgumentException ex) {

			Assertions.assertEquals("The array cannot be empty", ex.getMessage());

		}
		
		


	}
	

}