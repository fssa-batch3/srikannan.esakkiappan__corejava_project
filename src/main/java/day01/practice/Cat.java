package day01.practice;


public class Cat {
    // Attributes
    private int Age;
    private String color;


	// Constructor
    public Cat(int Age, String color) {
        this.Age = Age;
        this.color = color;
    }

    // Getters and setters
    public int Age() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

	public String speak() {

		return "Meow!";
    }

    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
        Cat cat1 = new Cat(4, "White");
        Cat cat2 = new Cat(3, "Black");

        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.Age());
        System.out.println("Color: " + cat1.getColor());
				System.out.println("Speaks: " + cat1.speak());

        System.out.println("Cat 2:");
        System.out.println("Age: " + cat2.Age());
        System.out.println("Color: " + cat2.getColor());
				System.out.println("Speaks: " + cat1.speak());
    }
}