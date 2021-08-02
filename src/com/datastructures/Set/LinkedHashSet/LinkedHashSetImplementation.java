package com.datastructures.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * LinkedHashSet is between HashSet and TreeSet
 * it is implemented as a hash table with a linked list running through it,so it provides the order of insertion.
 * the time complexity of basic methods is O(1).
 * 
 */
class Employee
{
	private int id;
	private String name;
	
	Employee(int id,String name)
	{
		this.id = id;
		this.name=name;
	}
	
	public String toString()
	{
		return "Id: " + id +", Name:" + name; 
	}
}
public class LinkedHashSetImplementation 
{
	public static void main(String[] args) {
		
		LinkedHashSet<Employee> emp=new LinkedHashSet<Employee>();
		
		emp.add(new Employee(5,"Pratap"));
		emp.add(new Employee(10,"viswa"));
		emp.add(new Employee(15,"swetha"));
		emp.add(new Employee(20,"chitti"));
		
		Iterator<Employee> iterator = emp.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
	

}
