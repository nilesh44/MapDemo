package mainApplication.mapMethod;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import mainApplication.Employee;

public class EntrySetDemo {

	
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
		
		Set<Entry<Integer, Employee>>entryset=mapOfEmployee.entrySet();
		System.out.println(entryset);
		
		System.out.println("iterating entry ");
		System.out.println("-----------------------------------BEFORE java 8----------------------------------------------------------");
		System.out.println("iterating through iterator method ");
		Iterator<Entry<Integer,Employee>> iterator=entryset.iterator();
		while(iterator.hasNext()) {
			Entry<Integer,Employee> entry=iterator.next();
			System.out.println("KEY :- "+entry.getKey() + "  VALUE :- "+ entry.getValue());
			
		}
		System.out.println("-------------------------------------java 8----------------------------------------------------------");
		
		
		System.out.println("iterating through forEach loop");
		for(Entry<Integer, Employee> entry2 : entryset) {
			System.out.println("KEY :- "+entry2.getKey() + "  VALUE :- "+ entry2.getValue());
		}
		
		
		System.out.println("\niterating through forEach default method");
		entryset.forEach(entry -> {
			System.out.println("KEY :- "+entry.getKey() + "  VALUE :- "+ entry.getValue());
		});
		
	}
	
	/*
	empty map is created
	{}

	 add new entry in the map
	entry :- [empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE]
	entry :- [empId=4, empNmae=sunil, empSalary=8000.0, empgender=F, empcity=PUNE]
	[1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], 4=[empId=4, empNmae=sunil, empSalary=8000.0, empgender=F, empcity=PUNE]]
	iterating entry 
	-----------------------------------BEFORE java 8----------------------------------------------------------
	iterating through iterator method 
	KEY :- 1  VALUE :- [empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE]
	KEY :- 4  VALUE :- [empId=4, empNmae=sunil, empSalary=8000.0, empgender=F, empcity=PUNE]
	-------------------------------------java 8----------------------------------------------------------
	iterating through forEach loop
	KEY :- 1  VALUE :- [empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE]
	KEY :- 4  VALUE :- [empId=4, empNmae=sunil, empSalary=8000.0, empgender=F, empcity=PUNE]

	iterating through forEach default method
	KEY :- 1  VALUE :- [empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE]
	KEY :- 4  VALUE :- [empId=4, empNmae=sunil, empSalary=8000.0, empgender=F, empcity=PUNE]
	
	*/

}
