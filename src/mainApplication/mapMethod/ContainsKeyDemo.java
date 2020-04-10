package mainApplication.mapMethod;

import java.util.HashMap;
import java.util.Map;

import mainApplication.Employee;

public class ContainsKeyDemo {
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(1, "anil", 5000.0f, "M", "PUNE");
		Employee e2 = new Employee(4, "sunil", 8000.0f, "F", "PUNE");

		// creatre map of employee
		Map<Integer, Employee> mapOfEmployee = new HashMap<Integer, Employee>();
		mapOfEmployee.put(e1.getEmpId(), e1);
		mapOfEmployee.put(e2.getEmpId(), e2);
		mapOfEmployee.put(5, null);
		mapOfEmployee.put(null, null);
		System.out.println(mapOfEmployee);
		
		System.out.println("\n CASE:- 1 \n given:- key is present  and it is associated with a value \n check if specifid key is present in the map or not return true if present");
	   System.out.println("KEY :- "+ e2.getEmpId());
		System.out.println(mapOfEmployee.containsKey(e2.getEmpId()));
	
	
	System.out.println("\n CASE:- 2 \n given :- key is present  and it is  accociated with null value, \n check if specifid key is present in the map or not return true if present");
	   System.out.println("KEY :- "+ "5");
	System.out.println(mapOfEmployee.containsKey(5));
	
	
	System.out.println("\n CASE:- 2 \n given :- key is not present  \n check if specifid key is present in the map or not return true if present");
	   System.out.println("KEY :- "+ "9");
	System.out.println(mapOfEmployee.containsKey(9));
	
	System.out.println("\n CASE:- 2 \n given :- null as key is present  \n check if specifid key is present in the map or not return true if present");
	   System.out.println("KEY :- "+ "null");
	System.out.println(mapOfEmployee.containsKey(null));
	}

	
	
}
