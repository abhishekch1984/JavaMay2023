package pojo;

public class Department { //POJO / Java Bean
	//3
	public Department() {
		System.out.println("Department() ctor...");
	}
	//4
	private int departmentNumber; //same as deptno of dept table
	private String departmentName; //same as dname of dept table
	private String departmentLocation; //same as loc of dept table
	
	//5
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentLocation() {
		return departmentLocation;
	}
	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	
	
}