package Mytest;

import myClasses.Employee;

	public class EmployeeTest {

		public static void main(String[] args) {
			
			Employee[] empArray = new Employee[5];
			
			for(int i=0; i<empArray.length; i++) {
				empArray[i] = new Employee();
				empArray[i].setName("Emp_" + (i+1));
				empArray[i].setSalary((i+1)*1000+10000);
				//System.out.println(empArray[i].displayInfo());
			}
			
			listArray(empArray);
			System.out.println("Best paid: " + empArray[maxSalary(empArray)].getName());
			
			//avgSalary(empArray);
			
			int lower = 12000;
			int upper = 14000;
			System.out.println("Num of employees: " + countEmp(empArray, lower, upper));
		}
		
		private static int countEmp(Employee[] array, int lower, int upper) {
			int counter = 0;
			for(Employee item : array) {
				if (item.isInRange(lower, upper))
					counter++;
			}
			return counter;
		}
		
		private static void listArray(Employee[] array) {
			for(Employee item : array) {
				System.out.println(item.displayInfo());
			}
		}
		
		private static int maxSalary(Employee[] array) {
			int maxIndex = 0;
			for(int i=0; i<array.length; i++) {
				if (array[i].getSalary() > array[maxIndex].getSalary())
					maxIndex = i;
					}
			return maxIndex;
		}
}
