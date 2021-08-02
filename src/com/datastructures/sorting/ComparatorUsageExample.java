package com.datastructures.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
class Employee6 implements Comparator<Employee6>
{
    String name;
    String id;
   
    public Employee6() {}
   
    public Employee6(String name, String id) {
        this.name = name;
        this.id = id;
    }
   
    @Override //ascending
    public int compare(Employee6 obj1, Employee6 obj2) {
       //sort Employee on basis of name(ascending order)
       return obj1.name.compareTo(obj2.name);
    }
    
    
//    @Override //descending
//    public int compare(Employee obj1, Employee obj2) {
//           // sort Employee on basis of name(descending order)
//           return obj2.name.compareTo(obj1.name);
//    }
    
//    class ComparatorName implements Comparator<Employee>{
//        @Override
//        public int compare(Employee obj1, Employee obj2) {
//           //sort Employee on basis of name(ascending order)
//           return obj1.name.compareTo(obj2.name);
//        }
//       
//    }
//        
//    class ComparatorId implements Comparator<Employee>{
//        @Override
//        public int compare(Employee obj1, Employee obj2) {
//           //sort Employee on basis of id(ascending order)
//           return obj1.id.compareTo(obj2.id);
//        }
//   
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id  + '}';
    }
   
   
}
 
 
/**
 * Main class
 */
public class ComparatorUsageExample
{
    public static void main(String[] args) {
 
        Employee6 emp1=new Employee6("ram","4");
        Employee6 emp2=new Employee6("sushma","2");
        Employee6 emp3=new Employee6("viswa","1");

        ArrayList<Employee6> list=new ArrayList<Employee6>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
      
        System.out.println("list Before sorting : \n"+list);
 
        Collections.sort(list,new Employee6());
        
//        Collections.sort(list,new ComparatorName());
//        System.out.println("\nlist after sorting on basis of name(ascending order) : \n"+list);
// 
//        Collections.sort(list,new ComparatorId());
//        System.out.println("\nlist after sorting on basis of id(ascending order) : \n"+list);
 
        System.out.println("\nlist after sorting on basis of name(ascending order) : \n"+list);
       
    }
}