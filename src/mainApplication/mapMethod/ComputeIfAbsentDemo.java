package mainApplication.mapMethod;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

import mainApplication.Employee;

public class ComputeIfAbsentDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "anil", 5000.0f, "M", "PUNE");
		Employee e2 = new Employee(4, "sunil", 8000.0f, "F", "PUNE");
		
		// creatre map of employee
		Map<Integer, Employee> mapOfEmployee = new HashMap<Integer, Employee>();
		mapOfEmployee.put(e1.getEmpId(), e1);
		mapOfEmployee.put(e2.getEmpId(), e2);
		System.out.println(mapOfEmployee);
		
       System.out.println("\n CASE 1:- employeeId is not present as key so comput method will add this as new entry");
		Employee e7 = new Employee(2, "karan", 17000.0f, "M", "banglor");
		System.out.println(e7);
		System.out.println("KEY :- "+e7.getEmpId());
		
		// provide implementation for function functional interface
		Function<Integer, Employee> function = (Integer x) -> {
			return e7;
		};

		mapOfEmployee.computeIfAbsent(e7.getEmpId(), function);
		System.out.println(mapOfEmployee.toString());
		
		 System.out.println("\n CASE 2:- employeeId is present as key so comput method will update that entry");
		 System.out.println(e2);
		 System.out.println("KEY :- "+e2.getEmpId());
		BiFunction<Integer, Employee, Employee> bifunction = (key, val) -> {
			Float newSalary = val.getEmpSalary().floatValue() + 1000.09f;
			val.setEmpSalary(newSalary);
			return val;

		};
		mapOfEmployee.computeIfPresent(e2.getEmpId(), bifunction);

		/*
		 * mapOfEmployee.computeIfPresent(4, (key, val) -> { Float newSalary
		 * =val.getEmpSalary().floatValue()+1000.09f; val.setEmpSalary(newSalary);
		 * return val;
		 * 
		 * });
		 */
		System.out.println();
		System.out.println(mapOfEmployee.toString());
	}

	
}
