package myClasses;

public class Employee {
	
	private String name;
	private int salary;
	
	// a) rész
	public void increaseSalary(int value) {
		salary += value;
	}
	
	public String displayInfo() {
		return "Név: " + name + ", fizetés: " + salary;
	}
	
	// b) rész
	
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
