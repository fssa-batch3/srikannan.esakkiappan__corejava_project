package day01.misc;

class Student {
	static String college;
	static int studentCounter = 0;
	int rollNo;
	
	public Student() {
		studentCounter++;
	}
	
}

public class StaticCollegeExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		System.out.println(s1.studentCounter);
		Student s2 = new Student();
		System.out.println(s2.studentCounter);
		
	}
}