package myClasses;

public class Employee {
	
	private String name;
	private int salary;
	
	// a) r�sz
	public void increaseSalary(int value) {
		salary += value;
	}
	
	public String displayInfo() {
		return "N�v: " + name + ", fizet�s: " + salary;
	}
	
	// b) r�sz
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary > 0)
			this.salary = salary;		
	}
	

}
