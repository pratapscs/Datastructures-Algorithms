package com.datastructures.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

/*
 *                <<interface>>
 *                     Set
 *                      |       <<interface>>
 *           			|		  SortedSet
 *           			|
 *          HashSet  LinkedHashSet  TreeSet
 *          
 * HashSet is implemented using a hash table
 * Elements are not ordered.
 * The add,remove,and contains methods have constant time complexity O(1).
 *   
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
public class HashSetImplementation 
{
	public static void main(String[] args) 
	{
		
		HashSet<Employee> emp= new HashSet<Employee>();
		
		emp.add(new Employee(1,"Pratap"));
		emp.add(new Employee(2,"viswa"));
		emp.add(new Employee(3,"swetha"));
		emp.add(new Employee(4,"chitti"));
		
		Iterator<Employee> iterator = emp.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
	}
	

}
