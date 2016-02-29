package Group.Artifact;

public class SomeUser {
	
	String username;
	String firstname;
	String lastname;
	String location;
	
	public SomeUser() {
		this.username = "defaultUser";
		this.firstname = "joe";
		this.lastname = "bloggs";
		this.location = "somecity";
	}
	
	public SomeUser(String username, String firstname, String lastname, String location) {
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getFirstName() {
		return this.firstname;
	}
}
