package com.him.function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
public class FunctionTRExample{
  public static void main(String args[]){
    Function<Employee, String> funcEmpToString= (Employee e)-> {return e.getName();};
    List<Employee> employeeList= 
     Arrays.asList(new Employee("Tom Jones", 45), 
      new Employee("Harry Major", 25),
      new Employee("Ethan Hardy", 65),
      new Employee("Nancy Smith", 15),
      new Employee("Deborah Sprightly", 29));
    Function<String,String> initialFunction= (String s)->s.substring(0,1);
    List<String> empNameList=convertEmpListToNamesList(employeeList, funcEmpToString.andThen(initialFunction));
    empNameList.forEach(System.out::println);
 }
 public static List<String> convertEmpListToNamesList(List<Employee> employeeList, Function<Employee, String> funcEmpToString){
   List<String> empNameList=new ArrayList<String>(); 
   for(Employee emp:employeeList){
     empNameList.add(funcEmpToString.apply(emp));
   }
   
   List<String> empNameList1 = employeeList.stream().map(funcEmpToString).collect(Collectors.toList());
   return empNameList1;
  }
}