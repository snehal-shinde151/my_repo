package classpro;

public class Admin {

	private int id;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private String username;
	private String password;
	private String email;
    private String Role;
    
    public String getRole() {
    	return Role;
    }
    public void setRole(String role) {
    	Role=role;
    }
   
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.username=name;
    }
  
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    


}
