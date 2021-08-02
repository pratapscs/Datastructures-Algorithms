package com.datastructures.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
 
class Employee3
{
    String name;
    String id;
   
    public Employee3() {}
   
    public Employee3(String name, String id) {
        this.name = name;
        this.id = id;
    }
   
    @Override
    public String toString() {
        return "Employee3{" + "name=" + name + ", id=" + id  + '}';
    }
 
    /* How to use inner and static inner class?
     * For accessing non-static inner class we need to create instance of 
     * top level class and then instance of inner class.
     * new Employee().new ComparatorName()  >using inner class
     * 
     * For accessing static inner class we need not to create instance of 
     * top level class neither of static inner class.
     * new Employee.ComparatorId()    >using static inner
     */
    
    //Inner class
    class ComparatorName  implements Comparator<Employee3>{
       @Override
        public int compare(Employee3 obj1, Employee3 obj2)
       {
           //sort Employee3 on basis of name(ascending order)
           return obj1.name.compareTo(obj2.name);
        }
    }
   
 
    //static Inner class
    static class ComparatorId  implements Comparator<Employee3>{
       @Override
        public int compare(Employee3 obj1, Employee3 obj2) {
           //sort Employee3 on basis of id(ascending order)
           return obj1.id.compareTo(obj2.id);
        }
    }
 
}

/**
 * Main class
 */
public class ComparatorUsage2 {
    public static void main(String[] args) {
 
        Employee3 emp1=new Employee3("ram","4");
        Employee3 emp2=new Employee3("viswa","2");
        Employee3 emp3=new Employee3("java","1");

        ArrayList<Employee3> list=new ArrayList<Employee3>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
      
        System.out.println("list Before sorting : \n"+list);
 
        Collections.sort(list,new Employee3().new ComparatorName());
        System.out.println("\nlist after sorting on basis of name(ascending order), "
                  + "using inner class : \n"+ list);
 
        Collections.sort(list,new Employee3.ComparatorId());
        System.out.println("\nlist after sorting on basis of id(ascending order), "
                  + "using static inner class : \n"+list);
       
    }
}