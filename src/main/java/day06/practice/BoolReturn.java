package day06.practice;

import java.util.ArrayList;

 class Detail {

	    private static String name;

	    public Detail(String name) { 
	        this.name = name;
	    }

	    public static String getTaskName() { 
	        return name;
	    }
	}

	public class BoolReturn {
	    public static void main(String[] args) {
	       
	        ArrayList<Detail> tasks = new ArrayList<>();
	        tasks.add(new Detail("Sleeping"));
	        tasks.add(new Detail("coding"));

	        boolean exists = findTaskByName("coding", tasks); 
	        System.out.println("Task Status : " + exists);
	    }

	    public static  boolean findTaskByName(String name, ArrayList<Detail> tasks) {
	        for (Detail task : tasks) {
	            if (Detail.getTaskName().equals(name)) {
	                return true; 
	            }
	        }
	        return false;
	    }
	}