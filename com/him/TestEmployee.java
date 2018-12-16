package com.him;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> emplist = new ArrayList<>() ;
		Employee emp1 = new Employee();
		emp1.setCountry("A");
		emp1.setName("AA");
		emplist.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setCountry("S");
		emp2.setName("SS");
		emplist.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setCountry("Z");
		emp3.setName("ZZ");
		emplist.add(emp3);
		
		Employee emp4 = new Employee();
		emp4.setCountry("G");
		emp4.setName("GG");
		emplist.add(emp4);
		
		for(Employee empObj : emplist) {
			System.out.println("Name : "+empObj.getName()+"   Country : "+empObj.getCountry());
		}
		sortEmployeesByCountry(emplist);
		System.out.println("After Sort");
		for(Employee empObj : emplist) {
			System.out.println("Name : "+empObj.getName()+"   Country : "+empObj.getCountry());
		}
	}
	
	public static void sortEmployeesByCountry(List<Employee> empList) {	
	    /*empList.sort(new CountryComparator() {
	    	@Override
	    	public int compare(Employee o1, Employee o2) {
	    		// TODO Auto-generated method stub
	    		return o1.getCountry().compareTo(o2.getCountry());
	    	}
	    });*/
		
		empList.sort(
						(Employee e1, Employee e2) -> 
							e1.getCountry().compareTo(e2.getCountry())
					);
		//() -> (System.out.println("After Sort"));
		
		//(String str) -> return str;
	}

}
