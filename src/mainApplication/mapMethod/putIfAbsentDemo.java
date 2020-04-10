package mainApplication.mapMethod;

import java.util.HashMap;
import java.util.Map;

import mainApplication.Employee;

public class putIfAbsentDemo {

	public static void main(String[] args) {
		
		//employee
		Employee e1 = new Employee(1, "anil", 5000.0f, "M", "PUNE");
		Employee e2 = new Employee(4, "sunil", 8000.0f, "F", "PUNE");

		// creatre map for employes
		Map<Integer, Employee> mapOfEmployee = new HashMap<Integer, Employee>();
		System.out.println("empty map is created");
		System.out.println(mapOfEmployee);
		
		System.out.println("\n add new entry in the map");
		System.out.println("entry :- "+ e1);
		System.out.println("entry :- "+ e2);
		mapOfEmployee.put(e1.getEmpId(), e1);
		mapOfEmployee.put(e2.getEmpId(), e2);
		
		System.out.println("insert provided record if and only if key is not present in the map");
		System.out.println("\nCASE 1 :- record is not present in map");
		System.out.println("provided entry is not present");
		Employee e3 = new Employee(5, "anita", 8000.0f, "F", "banglor");
		System.out.println(e3);
		mapOfEmployee.putIfAbsent(5, e3);	
		System.out.println(mapOfEmployee);
		
		System.out.println("\nCASE 2 :- record is alrady present in map");
		System.out.println("provided key is present but value is updated");
		 e2 = new Employee(4, "sanjali", 8000.0f, "F", "indor");
		System.out.println(e2);
		mapOfEmployee.putIfAbsent(e2.getEmpId(), e2);	
		System.out.println(mapOfEmployee);
		
		
		
		
		
		
		
		
	
	}
	
	/*
	empty map is created
{}

 add new entry in the map
entry :- [empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE]
entry :- [empId=4, empNmae=sunil, empSalary=8000.0, empgender=F, empcity=PUNE]
insert provided record if and only if key is not present in the map

CASE 1 :- record is not present in map
provided entry is not present
[empId=5, empNmae=anita, empSalary=8000.0, empgender=F, empcity=banglor]
{1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], 4=[empId=4, empNmae=sunil, empSalary=8000.0, empgender=F, empcity=PUNE], 5=[empId=5, empNmae=anita, empSalary=8000.0, empgender=F, empcity=banglor]}

CASE 2 :- record is alrady present in map
provided key is present but value is updated
[empId=4, empNmae=sanjali, empSalary=8000.0, empgender=F, empcity=indor]
{1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], 4=[empId=4, empNmae=sunil, empSalary=8000.0, empgender=F, empcity=PUNE], 5=[empId=5, empNmae=anita, empSalary=8000.0, empgender=F, empcity=banglor]}

*/
}
