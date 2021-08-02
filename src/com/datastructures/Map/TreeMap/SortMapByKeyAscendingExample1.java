package com.datastructures.Map.TreeMap;

import java.util.Map;
import java.util.TreeMap;
 
class Employee implements Comparable<Employee>{
    String name;
    String id;
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
   
    @Override
    public int compareTo(Employee otherEmployee) {
       //sort Employee on basis of name(ascending order)
       return this.name.compareTo(otherEmployee.name);
    }
 
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id  + '}';
    }
}
 

public class SortMapByKeyAscendingExample1 {
 
    public static void main(String...a){
 
        Employee emp1=new Employee("sam","4");
        Employee emp2=new Employee("amy","2");
        Employee emp3=new Employee("brad","1");
 
        Map<Employee, Integer> treeMap = new TreeMap<Employee, Integer>();
        treeMap.put(emp1, 1);
        treeMap.put(emp2, 1);
        treeMap.put(emp3, 1);
 
        System.out.println("treeMap : "+treeMap);
 
       
    }
}