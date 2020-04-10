package mainApplication.mapMethod;

import java.util.HashMap;
import java.util.Map;

import mainApplication.Employee;

public class computeDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "anil", 5000.0f, "M", "PUNE");
		Employee e2 = new Employee(4, "sunil", 8000.0f, "F", "PUNE");

		// creatre map of employee
		Map<Integer, Employee> mapOfEmployee = new HashMap<Integer, Employee>();
		mapOfEmployee.put(e1.getEmpId(), e1);
		mapOfEmployee.put(e2.getEmpId(), e2);
		System.out.println(mapOfEmployee);

		mapOfEmployee.compute(4, (key, val) -> {
			Float newSalary = val.getEmpSalary().floatValue() + 9999.9f;
			val.setEmpSalary(newSalary);
			return val;
		});
System.out.println("\n CASE 1:-  employe id 4 is present and its salary is incremented by 9999.9");
		System.out.println(mapOfEmployee);

		// {1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE],
		// 4=[empId=4, empNmae=sunil, empSalary=8000.0, empgender=F, empcity=PUNE]}
		// {1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE],
		// 4=[empId=4, empNmae=sunil, empSalary=17999.9, empgender=F, empcity=PUNE]}

		// CASE 2:- if key not found then it throw null pointer exception
		try {
			mapOfEmployee.compute(3, (key, val) -> {
				Float newSalary = val.getEmpSalary().floatValue() + 9999.9f;
				val.setEmpSalary(newSalary);
				return val;

			});
			System.out.println(mapOfEmployee);
		} catch (Exception e) {
			System.out.println("\n CASE 2:- employe id 3 is not present that why it throw NullpointerException");
			e.printStackTrace();

			/*
			 * Exception in thread "main" java.lang.NullPointerException at
			 * mainApplication.mapMethod.computeDemo.lambda$1(computeDemo.java:37) at
			 * java.util.HashMap.compute(Unknown Source) at
			 * mainApplication.mapMethod.computeDemo.main(computeDemo.java:36)
			 */
		}

		// CASE 3:- if key is null it throw null pointer exception

		try {
			mapOfEmployee.compute(null, (key, val) -> {
				Float newSalary = val.getEmpSalary().floatValue() + 9999.9f;
				val.setEmpSalary(newSalary);
				return val;

			});
		} catch (Exception e) {
			System.out.println("\n  CASE 3:- employe id passing null as argument that why it throw  NullpointerException");
			e.printStackTrace();
			

			/*
			 * Exception in thread "main" java.lang.NullPointerException at
			 * mainApplication.mapMethod.computeDemo.lambda$1(computeDemo.java:37) at
			 * java.util.HashMap.compute(Unknown Source) at
			 * mainApplication.mapMethod.computeDemo.main(computeDemo.java:36)
			 */
		}

		// CASE 4:- return value is null for key which is present in the map ,it will
		// remove that key value pair from table

		mapOfEmployee.compute(4, (key, val) -> {
			
			Float newSalary = val.getEmpSalary().floatValue() + 9999.9f;
			val.setEmpSalary(newSalary);
			return null;

		});
		System.out.println("\n  CASE 4:- employe id 4 is present but in return we send null that why it delete key value pair from map");
		System.out.println(mapOfEmployee);
		
		
	}
}
