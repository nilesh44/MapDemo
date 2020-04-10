package mainApplication.mapMethod;

import java.util.HashMap;
import java.util.Map;

import mainApplication.Employee;

public class GetDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "anil", 5000.0f, "M", "PUNE");
		Employee e2 = new Employee(4, "sunil", 8000.0f, "M", "PUNE");
		Employee e3 = new Employee(5, "anita", 7000.0f, "F", "MUMBAI");

		
		
		// creatre map of employee
		Map<Integer, Employee> mapOfEmployee = new HashMap<Integer, Employee>();	
		
		mapOfEmployee.put(e1.getEmpId(), e1);
		mapOfEmployee.put(e2.getEmpId(), e2);
		System.out.println(mapOfEmployee);
		System.out.println("\nCASE 1:-  given map  contain entries , we have to fetch the value for perticular key");
		System.out.println("KEY :- " +e2.getEmpId());
		System.out.println(mapOfEmployee.get(e2.getEmpId()));
		
		System.out.println("\nCASE 2:-  given map contain entries , when we pass key which is not present ,it will return null");
		System.out.println("NOT we can also fetch for  null as key");
		System.out.println("KEY :- " +"7");
		System.out.println(mapOfEmployee.get(7));
		
		
		System.out.println("\nCASE 2:-  given map is empty , then we try to get the value for perticular key ,it will return null");
		mapOfEmployee = new HashMap<Integer, Employee>();
		System.out.println("KEY :- " +"7");
		System.out.println(mapOfEmployee.get(7));
		
		try {
		System.out.println("\nCASE 2:-  given map is null , then we try to get the value for perticular key ,it will return null");
		mapOfEmployee = null;
		System.out.println("KEY :- " +"7");
		System.out.println(mapOfEmployee.get(7));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
