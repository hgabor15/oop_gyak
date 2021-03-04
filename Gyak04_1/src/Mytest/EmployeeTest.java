package Mytest;

import myClasses.Employee;

	public class EmployeeTest {

		public static void main(String[] args) {
			
			Employee emp1 = new Employee();
			emp1.setName("John");
			emp1.setSalary(10000);
			
			Employee emp2 = new Employee();
			emp2.setName("Jane");
			emp2.setSalary(12000);
			
			System.out.println(emp1.displayInfo());
			System.out.println(emp2.displayInfo());
			
			boolean res = emp1.hasGreaterSalary(emp2);
			if (res)
				System.out.println(emp1.getName() + " fizetése nagyobb");
			else
				System.out.println(emp1.getName() + " fizetése kisebb");
			
			Employee e_res = emp1.compareSalary(emp2);
			System.out.println(e_res.getName());
			
			System.out.println(Employee.compareSalary(emp1, emp2).getName());
			
		}
}
