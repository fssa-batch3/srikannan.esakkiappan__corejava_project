package day02.practice;

public class User {
	private int id;
	private String name;
	private String password;
	private String emailid;
	
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

		public static void main(String[] args) {
			User u = new User();
			
			 u.setId(6);
			 u.setName("sri");
			 u.setPassword("Sri@2003");
			 u.setEmailid("sri@gmail.com");
			 
			 System.out.println(u.getId());
			 System.out.println(u.getName());
			 System.out.println(u.getPassword());
			 System.out.println(u.getEmailid());
	}
	
}
