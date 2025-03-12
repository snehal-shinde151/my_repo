package MvsServ;

public class Employee {

	private int id;
	private String Fname;
	private String Lname;
    private int Salary;
    private int Dept_id;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFname() {
		return Fname;
	}
	
	public void setFname(String fname) {
		Fname = fname;
	}
	
	public String getLname() {
		return Lname;
	}
	
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getSalary() {
		return Salary;
	}
	
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	public int getDept_id() {
		return Dept_id;
	}
	public void setDept_id(int dept_id) {
		Dept_id = dept_id;
	}


	
}
