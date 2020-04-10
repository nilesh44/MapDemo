package mainApplication.mapMethod;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mainApplication.Employee;

public class ValuesDemo {
	
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
		System.out.println("REQUIREMENT  1 :- only wants the list of values");

		Collection<Employee> values =mapOfEmployee.values();

		System.out.println("list of value :-");
		System.out.println(values);
		
		System.out.println("\n GIVEN 2:-if map is empty  ");
		System.out.println("REQUIREMENT  1 :- only wants the list of values");
		mapOfEmployee  = new HashMap<Integer, Employee>();
		Collection<Employee> valuesforEmptyMap = mapOfEmployee.values();

		System.out.println("list of value :-");
		System.out.println(valuesforEmptyMap);
		
		//{1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], 4=[empId=5, empNmae=anita, empSalary=7000.0, empgender=F, empcity=MUMBAI]}

		//GIVEN 1 :-map of employee is provided and map is not empty,  
		//REQUIREMENT  1 :- only wants the list of values
		//list of value :-
		//[[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], [empId=5, empNmae=anita, empSalary=7000.0, empgender=F, empcity=MUMBAI]]

		 //GIVEN 2:-if map is empty  
		//REQUIREMENT  1 :- only wants the list of values
		//list of value :-
		//[]
		
		
	}

}
