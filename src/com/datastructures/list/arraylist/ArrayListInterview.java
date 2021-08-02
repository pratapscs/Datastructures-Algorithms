package com.datastructures.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListInterview 
{
	/* -java.lang.Object
	 *  -java.util.AbstractCollection
	 *   -java.util.AbstractList
	 *     -java.util.ArrayList
	 *  
	 *  
	 *  Features of java.util.ArrayList:
	 *  ArrayList  is Resizable-array implementation of the java.util.List 
	 *  interface in java
	 *  
	 *  Index based structure - ArrayList is an Index based structure in java. 
	 *  
	 *  Duplicate elements - ArrayList allows to store duplicate elements in java.
	 *  
	 *  Null elements -Null elements can be added in ArrayList in java.
	 *  
	 *  Insertion order - ArrayList maintains insertion order in java.
	 *  
	 *  synchronized - It is not synchronized (because 2 threads on same 
	 *  ArrayList object can access it at same time). 
	 *  
	 *  Performance - ArrayList is not synchronized, hence its operations are 
	 *  faster as compared to some other synchronized implementation of List 
	 *  interface in java.
	 *  
	 *  implements RandomAccess - (ArrayList implements RandomAccess
	 *  (Marker interface) to indicate that they support fast random access 
	 *  (i.e. index based access) in java.
	 *  
	 *  extends AbstractList - ArrayList extends AbstractList (abstract class) 
	 *  which provides implementation to  List interface to minimize the effort
	 *  required to implement this interface backed by RandomAccess interface. 
	 *  
	 *  When to use java.util.ArrayList:
	 *  
	 *  ArrayList can be used when we want to store duplicate elements in java.
	 *  
	 *  ArrayList can be used when we want to store null in java.
	 *  
	 *  We must prefer ArrayList for when add and remove operations are less 
	 *  as compared to get operations, and
	 *  
	 *  ArrayList can be used when we are not working in multithreading 
	 *  environment in java.
	 *  
	 */
	
	public static void main(String[] args) 
	{
		//Creating java.util.ArrayList
		List<String> arrayList = new ArrayList<String>();
		
		
		//Add element in java.util.ArrayList
		arrayList.add("pratap");  //add(E element)
		
		arrayList.add(1, "java");   //add(int index, E element)
		
		arrayList.add(2,null);  //Null can be added in ArrayList.
		
		arrayList.add(3, "chitti"); 
		
		
		
		//Remove element from java.util.ArrayList
		arrayList.remove(1); //remove(int index)
		
		arrayList.remove("pratap"); //remove(Object object) 
		
		
		//Get element from java.util.ArrayList
		arrayList.get(3); //get(int index)
		
		
		//Size of java.util.ArrayList
		System.out.println(arrayList.size());
		
		//Set element in java.util.ArrayList
 		//set(int index, E element)
		
		
		
	}

}
