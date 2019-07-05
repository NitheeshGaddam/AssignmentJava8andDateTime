package Assignment;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LongSummaryStatistics;
import java.util.Set;
import java.util.stream.Collectors;

public class employee  {
	String empid;
	String empname;
	long salary;
	public String getEmpid() {
		return empid;
	}


	public void setEmpid(String empid) {
		this.empid = empid;
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public long getSalary() {
		return salary;
	}


	public void setSalary(long salary) {
		this.salary = salary;
	}


	
	
	public employee(String empid, String empname, long salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}


	public static void main(String[] args) {
		
		employee e1=new employee("0123", "Nitheesh", 1234);
		employee e2=new employee("2345", "Suresh", 5678);
		employee e3=new employee("0145", "Prakash", 3456);
		employee e4=new employee("1111", "prashanth", 31000);
		
		ArrayList<employee> empDetails=new ArrayList<employee>();
		empDetails.add(e1);
		empDetails.add(e2);
		empDetails.add(e3);
		empDetails.add(e4);
		
		//Print all the empid’s using ForEach() method
		System.out.println("Sorting employees based on employee id");
		empDetails.stream().forEach(emp->System.out.println(emp.empid));
	    System.out.println("---------------------------------------------------------------------------------------");	
		//Sort the records based on empName
		Collections.sort(empDetails,(emp1,emp2)->emp1.empname.compareTo(emp2.empname));
		 System.out.println("Sorting Details with employee name");
		// System.out.println("\n");
		for (employee employee : empDetails) 
			System.out.println(employee.empname+" --- "+employee.empid+" ---- "+employee.salary);
        System.out.println("---------------------------------------------------------------------------------------");			
		//Print the records with salary >30000
			System.out.println("salary of emplyee greater then 30000");
			//System.out.println("\n");
			empDetails.stream().filter(emp->emp.salary>30000).forEach(emp->System.out.println(emp.empname+" --- "+emp.empid+" ---- "+emp.salary));
			
	   System.out.println("---------------------------------------------------------------------------------------");		
		
	   System.out.println("Get the sum of all salaries");
	   LongSummaryStatistics allemployeeSalary=empDetails.stream().collect(Collectors.summarizingLong(employee::getSalary));
	   System.out.println("All employee salaries "+allemployeeSalary.getSum());
	   System.out.println("---------------------------------------------------------------------------------------");	
	   
	   System.out.println("minimum salary "+allemployeeSalary.getMin());
	   
	   System.out.println("---------------------------------------------------------------------------------------");	
	   
	   System.out.println("common values in two hashsets");	
	   //HashSet<String> hash1=new HashSet<String>();
	   //hash1.add("abc");
	   Set<String> hash1 = new HashSet<String>(Arrays.asList("abc","def","ghi","jkl","abc"));
	   Set<String> hash2 = new HashSet<String>(Arrays.asList("abc","def","zlb","123","abc"));
	   commanValuesHashSet(hash1,hash2);
	}
	
	
	
	private static void commanValuesHashSet(Set<String> hash1, Set<String> hash2) {
ArrayList<String> commonValues=new ArrayList<String>();
		
		for (String string : hash1) {
			for (String string2 : hash2) {
				if(string.equals(string2))
				{
					commonValues.add(string);
					break;
				}
			}
		}
		
		for (String string : commonValues) {
			System.out.println(string);
		}
		
	}


	
}
