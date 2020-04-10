package mainApplication.mapMethod;

import java.util.HashMap;
import java.util.Map;

import mainApplication.Employee;

public class IsEmptyDemo {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "anil", 5000.0f, "M", "PUNE");
		Employee e2 = new Employee(4, "sunil", 8000.0f, "M", "PUNE");
		Employee e3 = new Employee(5, "anita", 7000.0f, "F", "MUMBAI");

		
		
		// creatre map of employee
		Map<Integer, Employee> mapOfEmployee = new HashMap<Integer, Employee>();
		System.out.println("\nCASE 1:-  given map is empty , as map is empty 'isempty () '  method return true");
		System.out.println(mapOfEmployee);
		System.out.println(mapOfEmployee.isEmpty());
		
		mapOfEmployee.put(e1.getEmpId(), e1);
		mapOfEmployee.put(e2.getEmpId(), e2);
		
		System.out.println("\nCASE 2 :-  given map is not empty, as map is not empty 'isempty () '  method return false");
		System.out.println(mapOfEmployee);
		System.out.println(mapOfEmployee.isEmpty());
	
		
	}
	

}
