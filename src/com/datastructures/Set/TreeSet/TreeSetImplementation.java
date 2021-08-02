package com.datastructures.Set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

/* TreeSet is implemented using a tree structure(red black tree in algoritham block)
 * the elements in a set are sorted,but the add,remove,and contains methods has 
 * time complexity od O(log(n))
 * it offers several methods to deal with the ordered set like first(),last(),
 * headSet(),tailSet(), etc . 
 */

class Employee implements Comparable<Employee>
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
	
	@Override
	public int compareTo(Employee e)
	{
		return id - e.id;
	}
}
public class TreeSetImplementation 
{
	public static void main(String[] args) {
		
		TreeSet<Employee> emp=new TreeSet<Employee>();
		
		emp.add(new Employee(15,"Pratap"));
		emp.add(new Employee(55,"viswa"));
		emp.add(new Employee(40,"swetha"));
		emp.add(new Employee(25,"chitti"));
		
		Iterator<Employee> iterator = emp.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}
	

}
