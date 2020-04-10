package mainApplication.mapMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import mainApplication.Employee;

public class KeySetDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "anil", 5000.0f, "M", "PUNE");
		Employee e2 = new Employee(4, "sunil", 8000.0f, "M", "PUNE");
		Employee e3 = new Employee(5, "anita", 7000.0f, "F", "MUMBAI");

		// creatre map of employee
		Map<Integer, Employee> mapOfEmployee = new HashMap<Integer, Employee>();
		mapOfEmployee.put(e1.getEmpId(), e1);
		mapOfEmployee.put(e2.getEmpId(), e2);
		mapOfEmployee.put(e2.getEmpId(), e3);
		System.out.println(mapOfEmployee);

		System.out.println("\nGIVEN 1 :-map of employee is provided and map is not empty,  ");
		System.out.println("REQUIREMENT1 :- only wants the set of key for map entries");

		Set<Integer> keySet = mapOfEmployee.keySet();

		System.out.println("set of keys:-");
		System.out.println(keySet);
		
		System.out.println("\nGIVEN 2:-if map is empty  ");
		System.out.println("REQUIREMENT2 :- only wants the set of key for map entries");
		mapOfEmployee  = new HashMap<Integer, Employee>();
		Set<Integer> keySetforEmptyMap = mapOfEmployee.keySet();

		System.out.println("set of keys but it is empty:-");
		System.out.println(keySetforEmptyMap);
		
		
		System.out.println("\nGIVEN 3:-if map is null  ");
		System.out.println("REQUIREMENT2 :- only wants the set of key for map entries");
		mapOfEmployee  = null;
		try {
		Set<Integer> keySetforNullMap = mapOfEmployee.keySet();

		System.out.println("null pointer exception:-");
		System.out.println(keySetforNullMap);
		}catch(NullPointerException ex){
			ex.printStackTrace();
		}
		
		
		/*
		 * {1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE],
		 * 4=[empId=5, empNmae=anita, empSalary=7000.0, empgender=F, empcity=MUMBAI]}
		 * 
		 * GIVEN 1 :-map of employee is provided and map is not empty, REQUIREMENT1 :-
		 * only wants the set of key for map entries set of keys:- [1, 4]
		 * 
		 * GIVEN 2:-if map is empty REQUIREMENT2 :- only wants the set of key for map
		 * entries set of keys but it is empty:- []
		 * 
		 * GIVEN 3:-if map is null REQUIREMENT2 :- only wants the set of key for map
		 * entries java.lang.NullPointerException at
		 * mainApplication.mapMethod.KeySetDemo.main(KeySetDemo.java:44)
		 */
	}
}
