package day07.practice;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class TestDuplicatTask {

    @Test
    public void testCreateTaskWithUniqueTasks() {
        Set<Task> taskList = DuplicatTask.createTask();

        assertEquals(3, taskList.size());
    }

    @Test
    public void testCreateTaskWithDuplicateTasks() {
        Set<Task> taskList = DuplicatTask.createTask();
        for (Task task : taskList) {
            if((task.getName()).equals("learn corejava")) {
            	
            	taskList.remove(task);
            	break;
            };
        }
       
        assertEquals(2, taskList.size());

        for (Task task : taskList) {
            assertNotEquals("learn corejava", task.getName());
        }
    }

    @Test
    public void testCreateTaskWithDifferentDates() {
        Set<Task> taskList = DuplicatTask.createTask();
        taskList.add(new Task("Coding", 15, "2023-11-11"));
        assertEquals(4, taskList.size());
    }


}
