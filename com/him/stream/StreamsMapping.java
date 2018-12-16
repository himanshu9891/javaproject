package com.him.stream;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;
import java.util.List;
public class StreamsMapping {
 static List<Employee> employeeList =
     Arrays.asList(new Employee("Tom Jones", 45), 
       new Employee("Harry Major", 25),
       new Employee("Ethan Hardy", 65),
       new Employee("Nancy Smith", 15),
       new Employee("Deborah Sprightly", 29));
 public static void main(String args[]) {
  List<String> mappedList = employeeList.stream().
                     map(emp -> emp.getName()).
                     collect(toList());
  mappedList.forEach(System.out::println);
  
  
  List<String> nameCharList = employeeList.stream()
          .map(emp-> emp.getName().split(""))
          .flatMap(array->Arrays.stream(array))
          .map(str -> str.toUpperCase()) 
          .filter(str -> !(str.equals(" ")))
          .collect(toList());
  nameCharList.forEach(str -> System.out.print(str));
 }
}