package day10.solved;

class Task {
	private int id;
	private String name;

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

}

class ExceptionValidation extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8105491977357554060L;

	// Calling each super constructors for each of the types
	public ExceptionValidation(String msg) {
		super(msg);
	}

	public ExceptionValidation(Throwable te) {
		super(te);
	}

	public ExceptionValidation(String msg, Throwable te) {
		super(msg, te);
	}
}

class TaskValidator {
	public static boolean validate(Task task) throws ExceptionValidation {
		if (task == null)
			throw new ExceptionValidation("Task is null");
		else if (task.getName() == null || "".equals(task.getName()))
			throw new ExceptionValidation("Task name is empty");
			return true;
	}
}

public class UsingCustomExceptionsDemo  {
	public static void main(String[] args) {
		Task task = new Task();
//		task.setName("Creating test case"); Commenting this so that exception is thrown
		
		try {
			TaskValidator.validate(task);
		} catch (ExceptionValidation e) {
			e.printStackTrace();
		}
	}
}

/**
**
 * Custom exception to handle cases when 
 * there are exception during validation
 * 
 * @author BharathwajSoundarara
 *
 */
