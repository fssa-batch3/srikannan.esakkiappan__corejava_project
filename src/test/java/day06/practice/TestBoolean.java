package day06.practice;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBoolean {

	@Test
	public void testValidFindTask() throws Exception {

		ArrayList<Detail> taskList = new ArrayList<>();
		taskList.add(new Detail("play"));
		taskList.add(new Detail("eating"));

		boolean findTask = BoolReturn.findTaskByName("play", taskList);

		Assertions.assertTrue(findTask);

	}

	@Test
	public void testInValidFindTask() {

		try {
			ArrayList<Detail> taskList = new ArrayList<>();
			taskList.add(new Detail("play"));
			taskList.add(new Detail("eating"));

			boolean findTask = BoolReturn.findTaskByName("play11", taskList);

			Assertions.fail("testInValidFindTask failed");
		} catch (Exception ex) {
			Assertions.assertEquals("Not found", ex.getMessage());
		}

	}

}
