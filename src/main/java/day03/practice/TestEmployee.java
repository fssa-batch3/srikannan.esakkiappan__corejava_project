package day03.practice;

public class TestEmployee {
	 
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "naresh");
        System.out.println("id="+ e1.id + ", name="+ e1.name);
        Employee e2 = new Employee(2, "suresh");
        System.out.println("id="+ e2.id + ", name="+ e2.name);
        
    }
}

class Employee {
	 
    public int id;
    public String name;
 
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    
}
