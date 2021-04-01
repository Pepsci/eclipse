package DAO;

public class User {
	private static int id=1;
	private String email;
	private String password;
	
	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		User.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
