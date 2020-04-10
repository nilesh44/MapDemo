package mainApplication.mapMethod;

import java.util.HashMap;
import java.util.Map;

import mainApplication.Employee;

public class ContainsValueDemo {
public static void main(String[] args) {
		
		
		Employee e1 = new Employee(1, "anil", 5000.0f, "M", "PUNE");
		Employee e2 = new Employee(4, "sunil", 8000.0f, "M", "PUNE");
		Employee e3 = new Employee(5, "anita", 7000.0f, "F", "MUMBAI");

		// creatre map of employee
		Map<Integer, Employee> mapOfEmployee = new HashMap<Integer, Employee>();
		mapOfEmployee.put(e1.getEmpId(), e1);
		mapOfEmployee.put(e2.getEmpId(), e2);
		mapOfEmployee.put(7, e2);
		mapOfEmployee.put(5, null);
		mapOfEmployee.put(null, e3);
		System.out.println(mapOfEmployee);
		
		System.out.println("\n CASE:- 1 \n given:- Value is present  and it is associated with a more then key \n Returns true if this map maps one or more keys to the specified value");
	   System.out.println("Value :- "+ e2);
		System.out.println(mapOfEmployee.containsValue(e2));
	
	
	System.out.println("\n CASE:- 2 \n given :- Value is present  and it is  accociated with null key, \n Returns true if this map maps one or more keys to the specified value");
	   System.out.println("Value :- "+ e3);
	System.out.println(mapOfEmployee.containsValue(e3));
	
	
	System.out.println("\n CASE:- 3 \n given :- Value is not present  \n Returns true if this map maps one or more keys to the specified value");
	Employee e4 = new Employee(10, "akash", 6000.0f, "M", "banglor");   
	System.out.println("Value :- "+ e4);
	System.out.println(mapOfEmployee.containsValue(9));
	
	System.out.println("\n CASE:- 4 \n given :- null as Value is present  \n Returns true if this map maps one or more keys to the specified value");
	   System.out.println("Value :- "+ "null");
	System.out.println(mapOfEmployee.containsValue(null));
	}
}
