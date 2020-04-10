package mainApplication.mapMethod;

import java.util.HashMap;
import java.util.Map;

import mainApplication.Employee;

public class RemoveDemo {

	public static void main(String[] args) {
		
		//employee
		Employee e1 = new Employee(1, "anil", 5000.0f, "M", "PUNE");
		Employee e2 = new Employee(4, "sunil", 8000.0f, "M", "PUNE");

		// creatre map for employes
		Map<Integer, Employee> mapOfEmployee = new HashMap<Integer, Employee>();
		System.out.println("empty map is created");
		System.out.println(mapOfEmployee);
		
		System.out.println("\n add new entry in the map");
		System.out.println("entry :- "+ e1);
		System.out.println("entry :- "+ e2);
		mapOfEmployee.put(e1.getEmpId(), e1);
		mapOfEmployee.put(e2.getEmpId(), e2);
		System.out.println(mapOfEmployee);
		System.out.println("method :- remove , argument :- key and value , Return:- the object which is removed");
		System.out.println("remove entry from map on the basis of matching key ");
		System.out.println("KEY 4 to be removed");
		Employee removed=mapOfEmployee.remove(e2.getEmpId());
		System.out.println("removed object :- " + removed);
		
		System.out.println(mapOfEmployee);
		System.out.println("\n method :- remove , argument :- key and value ,Return:- boolean");
		System.out.println("remove entry from map only and only if key and value both match ");
		System.out.println("\ncase 1 :- return true if entry removed");
		System.out.println("want to remove  entry " + e1);
		mapOfEmployee.put(e2.getEmpId(), e2);
		System.out.println(mapOfEmployee);
		boolean result =mapOfEmployee.remove(e1.getEmpId(), e1);	
		System.out.println("result "+ result );
		System.out.println(mapOfEmployee);
		
		System.out.println("\ncase 1 :- return false if entry removed");
		
		Employee e3 = new Employee(4, "akash", 8000.0f, "M", "Banglor");
		mapOfEmployee.put(e1.getEmpId(), e1);
		mapOfEmployee.put(e2.getEmpId(), e2);
		System.out.println(mapOfEmployee);
		System.out.println("want to remove  entry " + e3);
		boolean resultfalse =mapOfEmployee.remove(e3.getEmpId(), e3);	
		System.out.println("result "+ resultfalse );
		System.out.println(mapOfEmployee);
		
		
		
	}
	
	
	/*
	
	empty map is created
{}

 add new entry in the map
entry :- [empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE]
entry :- [empId=4, empNmae=sunil, empSalary=8000.0, empgender=M, empcity=PUNE]
{1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], 4=[empId=4, empNmae=sunil, empSalary=8000.0, empgender=M, empcity=PUNE]}
method :- remove , argument :- key and value , Return:- the object which is removed
remove entry from map on the basis of matching key 
KEY 4 to be removed
removed object :- [empId=4, empNmae=sunil, empSalary=8000.0, empgender=M, empcity=PUNE]
{1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE]}

 method :- remove , argument :- key and value ,Return:- boolean
remove entry from map only and only if key and value both match 

case 1 :- return true if entry removed
want to remove  entry [empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE]
{1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], 4=[empId=4, empNmae=sunil, empSalary=8000.0, empgender=M, empcity=PUNE]}
result true
{4=[empId=4, empNmae=sunil, empSalary=8000.0, empgender=M, empcity=PUNE]}

case 1 :- return false if entry removed
{1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], 4=[empId=4, empNmae=sunil, empSalary=8000.0, empgender=M, empcity=PUNE]}
want to remove  entry [empId=4, empNmae=akash, empSalary=8000.0, empgender=M, empcity=Banglor]
result false
{1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], 4=[empId=4, empNmae=sunil, empSalary=8000.0, empgender=M, empcity=PUNE]}

	*/
	
}
