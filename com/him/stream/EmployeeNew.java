package com.him.stream;
public class EmployeeNew{
  private String name;
  private Integer age;
  public EmployeeNew(String name, Integer age){
    this.name=name;
    this.age=age;
  } 
  public String getName(){
    return name;
  }
  public void setName(String name){
    this.name=name;
  } 
  public Integer getAge(){
    return this.age;
  } 
  public void setAge(Integer age){
    this.age=age;
  }  
  public String toString(){
    return "EmployeeNew Name:"+this.name
      +"  Age:"+this.age;
  }
  @Override
  public boolean equals(Object obj) {
     if (obj == this) {
       return true;
     }
     if (!(obj instanceof EmployeeNew)) {
       return false;
     }
     EmployeeNew empObj = (EmployeeNew) obj;
       return this.age==empObj.age
         && this.name.equalsIgnoreCase(empObj.name);
  }
  @Override
  public int hashCode() {
    int hash = 1;
    hash = hash * 17 + this.name.hashCode();
    hash = hash * 31 + this.age;
    return hash;
  }
}