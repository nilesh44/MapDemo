package mainApplication.mapMethod;

import java.util.HashMap;
import java.util.Map;

import mainApplication.Employee;

public class PutDemo {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "anil", 5000.0f, "M", "PUNE");
		Employee e2 = new Employee(4, "sunil", 8000.0f, "F", "PUNE");

		// creatre map of employee
		Map<Integer, Employee> mapOfEmployee = new HashMap<Integer, Employee>();
		System.out.println("empty map is created");
		System.out.println(mapOfEmployee);
		
		System.out.println("\nCASE 1:- add new enty in the map");
		System.out.println("entry :- "+ e1);
		System.out.println("entry :- "+ e2);
		
		mapOfEmployee.put(e1.getEmpId(), e1);
		mapOfEmployee.put(e2.getEmpId(), e2);
		System.out.println("after adding two entries the map look like this");
		System.out.println(mapOfEmployee);
		
		System.out.println("\nCASE 2:- try to update value for existing key , lets update salary for employeeId 4, put method replace old value with new value  if key is found in map");
		e2.setEmpSalary(9999.99f);
		System.out.println(e2);
		mapOfEmployee.put(e2.getEmpId(), e2);
		System.out.println(mapOfEmployee);
		
		System.out.println("\nCASE 3:- try to add null value and null key , it will add that as new entry");
		System.out.println("ENTRY :- " + "KEY :-" + "null " + "VALUE :-" + "null" );
		mapOfEmployee.put(null, null);
		System.out.println(mapOfEmployee);
		
		System.out.println("\nCASE 3:- try to add null value for multiple  key , it will add that as new entry");
		mapOfEmployee.put(7, null);
		mapOfEmployee.put(8, null);
		System.out.println("ENTRY :- " + "KEY :-" + "7 " + "VALUE :-" + "null" );
		System.out.println("ENTRY :- " + "KEY :-" + "8 " + "VALUE :-" + "null" );
		System.out.println(mapOfEmployee);
		System.out.println("NOTE :- key is always unique therefore only one null as key is allow but we can have multiple null value");
		
	
	
	}

}
