package day03.practice;


class Details {

	private String name;

	private String password;

	private String emailid;

	public Details() {

	}

	public Details(String name, String password, String emailid) {
		this.name = name;
		this.password = password;
		this.emailid = emailid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

}

public class User {
	public static void main(String[] args) {

		// create Account using Setter methods and Default constructor
		Details d = new Details();
		d.setName("sri");
		d.setPassword("Srik@2003");
		d.setEmailid("Sri@gmail.com");

		System.out.println(d.getName() + ", " + d.getPassword() + ", "
				+ d.getEmailid());
		
	}
}
