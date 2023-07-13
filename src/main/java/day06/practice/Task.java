package day06.practice;

import java.util.*;


public class Task {
	 
    public String taskName;
     
    public int priority;
    
Task(String taskName, int priority){
		
		this.taskName = taskName;
		this.priority = priority;
		
	}
	
	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public static void main(String[] args) {
    	 
    	 ArrayList<Task> Task = new ArrayList<> ();
    	 
    	Task task1 = new Task("Java Learn",5);
 		
 		Task.add(task1);
 	
    	 System.out.println(Task.get(0).getTaskName());
    	 System.out.println(Task.get(0).getPriority());
     }
}

