package myClasses;

public class Employee {
	
	String name;
	int salary;
	
	void increaseSalary(int value) {
		salary += value;
	}
	
	String displayInfo() {
		return "N�v: " + name + ", fizet�s: " + salary;
	}
}
