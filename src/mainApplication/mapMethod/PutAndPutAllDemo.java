package mainApplication.mapMethod;

import java.util.HashMap;
import java.util.Map;

import mainApplication.Employee;

public class PutAndPutAllDemo {
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
		
		
		//----------------------------------------------PutAll method----------------------------------------
		
		
		
		
		System.out.println("\n-------------------putAll------------method");
		System.out.println("alrady existed map");
		System.out.println(mapOfEmployee);
		
		Employee e4 = new Employee(10, "prakash", 5000.0f, "M", "PUNE");
		Employee e5 = new Employee(11, "anjali", 6000.0f, "F", "nashik");

		// creatre map of employee
		Map<Integer, Employee> mapOfanotherEmployee = new HashMap<Integer, Employee>();
		System.out.println("another map is created\n");
		mapOfanotherEmployee.put(e4.getEmpId(), e4);
		mapOfanotherEmployee.put(e5.getEmpId(), e5);
		System.out.println(mapOfanotherEmployee);
		System.out.println("\nCASE 1:- add one map to another map directly");
		
		mapOfEmployee.putAll(mapOfanotherEmployee);
		
		System.out.println(mapOfEmployee);
		
		
		
	
	
	}
	
	/*
	 * empty map is created 
	 * {}
	 */

	/*CASE 1:- add new enty in the map
	entry :- [empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE]
	entry :- [empId=4, empNmae=sunil, empSalary=8000.0, empgender=F, empcity=PUNE]
	after adding two entries the map look like this
	{1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], 4=[empId=4, empNmae=sunil, empSalary=8000.0, empgender=F, empcity=PUNE]}

	CASE 2:- try to update value for existing key , lets update salary for employeeId 4, put method replace old value with new value  if key is found in map
	[empId=4, empNmae=sunil, empSalary=9999.99, empgender=F, empcity=PUNE]
	{1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], 4=[empId=4, empNmae=sunil, empSalary=9999.99, empgender=F, empcity=PUNE]}

	CASE 3:- try to add null value and null key , it will add that as new entry
	ENTRY :- KEY :-null VALUE :-null
	{null=null, 1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], 4=[empId=4, empNmae=sunil, empSalary=9999.99, empgender=F, empcity=PUNE]}

	CASE 3:- try to add null value for multiple  key , it will add that as new entry
	ENTRY :- KEY :-7 VALUE :-null
	ENTRY :- KEY :-8 VALUE :-null
	{null=null, 1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], 4=[empId=4, empNmae=sunil, empSalary=9999.99, empgender=F, empcity=PUNE], 7=null, 8=null}
	NOTE :- key is always unique therefore only one null as key is allow but we can have multiple null value

	-------------------putAll------------method
	alrady existed map
	{null=null, 1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], 4=[empId=4, empNmae=sunil, empSalary=9999.99, empgender=F, empcity=PUNE], 7=null, 8=null}
	another map is created

	{10=[empId=10, empNmae=prakash, empSalary=5000.0, empgender=M, empcity=PUNE], 11=[empId=11, empNmae=anjali, empSalary=6000.0, empgender=F, empcity=nashik]}

	CASE 1:- add one map to another map directly
	{null=null, 1=[empId=1, empNmae=anil, empSalary=5000.0, empgender=M, empcity=PUNE], 4=[empId=4, empNmae=sunil, empSalary=9999.99, empgender=F, empcity=PUNE], 7=null, 8=null, 10=[empId=10, empNmae=prakash, empSalary=5000.0, empgender=M, empcity=PUNE], 11=[empId=11, empNmae=anjali, empSalary=6000.0, empgender=F, empcity=nashik]}
*/

}
