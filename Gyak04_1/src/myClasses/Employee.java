package myClasses;

public class Employee {
	
	private String name;
	private int salary;
	
	// a) rész
	public void increaseSalary(int value) {
		salary += value;
	}
	
	public String displayInfo() {
		return "Név: " + name + ", fizetés: " + salary + ", adó: " + getTax();
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
	
	// c) rész
	public boolean isInRange(int lower, int upper) {
		if(salary >= lower && salary <= upper)
			return true;
		return false;
	}
	
	public double getTax() {
		return Math.round(salary*0.16);
	}
	
	public boolean hasGreaterSalary(Employee e) {
		if (this.salary > e.salary)
			return true;
		else return false;
	}
	
	public Employee compareSalary(Employee e) {
		if (this.salary > e.salary)
			return this;
		return e;
	}
	
	public static Employee compareSalary(Employee e1, Employee e2) {
		if (e1.salary > e2.salary)
			return e1;
		return e2;
	}

}
