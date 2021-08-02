package com.datastructures.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
class Employee1 implements Comparator<Employee1>
{
    String name;
    String id;
   
    public Employee1() {}
   
    public Employee1(String name, String id) {
        this.name = name;
        this.id = id;
    }
   
    @Override
    public int compare(Employee1 obj1, Employee1 obj2) {
       //sort Employee1 on basis of name(ascending order)
       return obj1.name.compareTo(obj2.name);
    }
   
    @Override
    public String toString() {
        return "Employee1{" + "name=" + name + ", id=" + id  + '}';
    }
   
   
}
 
 
/**
 * Main class
 */
public class ComparatorUsage 
{
    public static void main(String[] args)
    {
 
        Employee1 emp1=new Employee1("ram","4");
        Employee1 emp2=new Employee1("pavan","2");
        Employee1 emp3=new Employee1("laavu","1");

        ArrayList<Employee1> list=new ArrayList<Employee1>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
      
        System.out.println("list Before sorting : \n"+list);
 
        Collections.sort(list,new Employee1());
 
        System.out.println("\nlist after sorting on basis of name(ascending order) : \n"+list);
       
    }
}