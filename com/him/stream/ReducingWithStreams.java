package com.him.stream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
public class ReducingWithStreams {
  static List<EmployeeNew1> EmployeeNew1List = Arrays.asList(
      new EmployeeNew1("Tom Jones", 45, 7000.00),
      new EmployeeNew1("Harry Major", 25, 10000.00),
      new EmployeeNew1("Ethan Hardy", 65, 8000.00),
      new EmployeeNew1("Nancy Smith", 22, 12000.00),
      new EmployeeNew1("Deborah Sprightly", 29, 9000.00));
 
  public static void main(String[] args) {
    Double totalSalaryExpense = EmployeeNew1List.stream()
                               .map(emp -> emp.getSalary())
                               .reduce(0.00,(a,b) -> a+b);
    System.out.println("Total salary expense: "+totalSalaryExpense);
   
  
  
  Optional<EmployeeNew1> maxSalaryEmp=EmployeeNew1List.stream()
		    .reduce((EmployeeNew1 a, EmployeeNew1 b) -> a.getSalary() < b.getSalary() ? b:a);
		if(maxSalaryEmp.isPresent()) {
		  System.out.println("Employee with max salary: "+maxSalaryEmp.get());
		}
}
}