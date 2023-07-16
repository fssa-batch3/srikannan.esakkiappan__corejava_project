package day07.practice;

import java.time.LocalDate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicatTask {

	private int id;
	private String name;
	private LocalDate deadline;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	
	public DuplicatTask(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}
	
	
	public static boolean  validatetaskName (String name)throws IllegalArgumentException {
		if(name==null || name.isEmpty()) {
			throw new IllegalArgumentException("TaskName cannot be null or empty");
		}
		String nameregex = "^[a-zA-Z]{2,200}$";
		Pattern pattern = Pattern.compile(nameregex);
		Matcher matcher = pattern.matcher(name);
		Boolean isMatch = matcher.matches();



		 if (!isMatch) {
			throw new IllegalArgumentException("The  task name should be  minimum 2 letters and maximum 200 letters");

		}
		 return true;

		
	}
	public static boolean  validateTaskDate(LocalDate deadline)throws IllegalArgumentException {
		LocalDate currentDate = LocalDate.now();
		if(deadline==null) {
			throw new IllegalArgumentException("Task date cannot be null");
		}
		if(deadline.isBefore(currentDate)) {
			throw new IllegalArgumentException("Task date cannot be in the past.");
			
		}
		return true;
		
	}
	
    @Override
    public String toString() {
        return "TaskDuplicate [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
    }

	@Override
	public int hashCode() {
		return Objects.hash(deadline, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DuplicatTask other = (DuplicatTask) obj;
		return Objects.equals(deadline, other.deadline) && id == other.id && Objects.equals(name, other.name);
	}

	public static void main(String[] args) {

		ArrayList<DuplicatTask> taskList = new ArrayList<>();

		DuplicatTask t1 = new DuplicatTask(1, "taskplay", LocalDate.of(2023, 7, 15));
		taskList.add(t1);
		taskList.add(t1);
		taskList.add(new DuplicatTask(2, "taseat", LocalDate.of(2023, 7, 15)));
		taskList.add(new DuplicatTask(3, "tasklearn", LocalDate.of(2023, 7, 17)));

		System.out.println(taskList);

		taskRemoveDuplicate(taskList);

	}

	public static void taskRemoveDuplicate(ArrayList<DuplicatTask> taskList) {
		HashSet<DuplicatTask> uniqueArr = new HashSet<DuplicatTask>(taskList);
		System.out.println(uniqueArr);

	}
	
	public static boolean validateDuplicatemethod(ArrayList<DuplicatTask> taskList) throws IllegalArgumentException{
		
		HashSet<String> taskSet = new HashSet<>();
		for(DuplicatTask task:taskList) {
			   String taskKey = task.getName() + "_" + task.getDeadline();
			   if(taskSet.contains(taskKey)) {
				   throw new IllegalArgumentException("duplicate task found");
			   }
			   taskSet.add(taskKey);
		
		}
		return true;
	}
	
	
}