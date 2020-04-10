package mainApplication.mapMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

import mainApplication.Employee;

public class ComputeIfPresentDemo {

	// Given:- map of employee with key as employeeId and value is employee object
	// associated with that employeeId

	// task to be performed
	// check for a perticular employeeId =2 ,if employeeId=2 is present then
	// increase it salary by 1000

	// solution :- we can use computeIfPresentIfPresentIfPresent() method of map
	// this method check weather the key is present if key is present then it will
	// update the value which we have provided

	// Exmple:-
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "anil", 5000.0f, "M", "PUNE");
		Employee e2 = new Employee(4, "sunil", 8000.0f, "F", "PUNE");

		// creatre map of employee
		Map<Integer, Employee> mapOfEmployee = new HashMap<Integer, Employee>();
		mapOfEmployee.put(e1.getEmpId(), e1);
		mapOfEmployee.put(e2.getEmpId(), e2);
		System.out.println(mapOfEmployee);
		System.out.println("\n CASE 1:-  employe id 4 is present and its salary is incremented by 9999.9");
		System.out.println(e2);

		mapOfEmployee.computeIfPresent(4, (key, val) -> {
			Float newSalary = val.getEmpSalary().floatValue() + 9999.9f;
			val.setEmpSalary(newSalary);
			return val;
		});

		System.out.println(mapOfEmployee);

		// {1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE],
		// 4=[empId=4, empNmae=sunil, empSalary=8000.0, empgender=F, empcity=PUNE]}
		// {1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE],
		// 4=[empId=4, empNmae=sunil, empSalary=17999.9, empgender=F, empcity=PUNE]}

		// CASE 2:- if key not found then it throw null pointer exception
		try {
			System.out.println("\n CASE 2:- employe id 3 is not present ,it will not add this as new entry and also not throw  any Exception");
			Employee e3 = new Employee(3, "anita", 9000.0f, "F", "indor");
			System.out.println(e3);
			mapOfEmployee.computeIfPresent(3, (key, val) -> {
				Float newSalary = e3.getEmpSalary().floatValue() + 9999.9f;
				e3.setEmpSalary(newSalary);
				return e3;

			});
			System.out.println(mapOfEmployee);
		} catch (Exception e) {
		
			e.printStackTrace();

			/*
			 * Exception in thread "main" java.lang.NullPointerException at
			 * mainApplication.mapMethod.computeIfPresentIfPresentDemo.lambda$1(computeIfPresentIfPresentDemo.java:37) at
			 * java.util.HashMap.computeIfPresentIfPresent(Unknown Source) at
			 * mainApplication.mapMethod.computeIfPresentIfPresentDemo.main(computeIfPresentIfPresentDemo.java:36)
			 */
		}

		// CASE 3:- if key is null it throw null pointer exception

		try {
			System.out.println("\n  CASE 3:- employe id passing null as argument ,it will not add this as new entry and also not throw  any Exception");
			Employee e4 = new Employee(null, "somya", 7000.0f, "F", "delhi");
			System.out.println(e4);
			mapOfEmployee.computeIfPresent(null, (key, val) -> {
				Float newSalary = e4.getEmpSalary().floatValue() + 9999.9f;
				e4.setEmpSalary(newSalary);
				return val;

			});
			
			System.out.println(mapOfEmployee);
		} catch (Exception e) {
			
			e.printStackTrace();
			

			/*
			 * Exception in thread "main" java.lang.NullPointerException at
			 * mainApplication.mapMethod.computeIfPresentIfPresentDemo.lambda$1(computeIfPresentIfPresentDemo.java:37) at
			 * java.util.HashMap.computeIfPresentIfPresent(Unknown Source) at
			 * mainApplication.mapMethod.computeIfPresentIfPresentDemo.main(computeIfPresentIfPresentDemo.java:36)
			 */
		}

		// CASE 4:- return value is null for key which is present in the map ,it will
		// remove that key value pair from table
		System.out.println("\n  CASE 4:- employe id 4 is present but in return we send null that why it delete key value pair from map");
		
		mapOfEmployee.computeIfPresent(4, (key, val) -> {
			
			Float newSalary = val.getEmpSalary().floatValue() + 9999.9f;
			val.setEmpSalary(newSalary);
			return null;

		});
		
		System.out.println(mapOfEmployee);
	}
	
}
