package com.datastructures.sorting;

import java.util.ArrayList;
import java.util.Collections;
 
class Employee implements Comparable<Employee>
{
    String name;
    String id;
    
    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
   
    @Override //ascending
    public int compareTo(Employee otherEmployee) {
       //sort Employee on basis of name(ascending order)
       return this.name.compareTo(otherEmployee.name);
    }
    
    
    
//    @Override //descending
//    public int compareTo(Employee otherEmployee) {
//           // sort Employee on basis of name(descending order)
//           return otherEmployee.name.compareTo(this.name);
//    }
    
    
 
    // toString() method overrides Object class’s toString() method.
    // toString() method is used to give a string representation of an object.
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id  + '}';
    }
}
 
 
/**
 * Main class
 */
public class ComparableUsageExample 
{
    public static void main(String[] args)
    {
 
        Employee emp1=new Employee("ram","4");
        Employee emp2=new Employee("pratap","2");
        Employee emp3=new Employee("chitti","1");

        ArrayList<Employee> list=new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
      
        System.out.println("list Before sorting : \n"+list);
         
        Collections.sort(list);
 
        System.out.println("\nlist after sorting on basis of name(ascending order) : \n"+list);
       
    }
}
 