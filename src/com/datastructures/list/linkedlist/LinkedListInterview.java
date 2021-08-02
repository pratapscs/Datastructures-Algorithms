package com.datastructures.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInterview 
{
	/* -java.lang.Object
	 *  -java.util.AbstractCollection
	 *   -java.util.AbstractList
	 *    -java.util.AbstractSequentialList<E>
	 *     -java.util.LinkedList<E>
	 *     
	 * Features of java.util.LinkedList in java
	 * 
	 * LinkedList  is implementation of the java.util.List interface in java
	 * 
	 * Nodes : A linked list is a data structure consisting of a group of 
	 * nodes which together represent a sequence. Under the simplest form, 
	 * each node is composed of a data and a reference (in other words, a link)
	 * to the next node in the sequence in java.
	 * 
	 * extends AbstractSequentialList - LinkedList extends AbstractSequentialList 
	 * (abstract class), AbstractSequentialList extends AbstractList. 
	 * 
	 * In LinkedList, data is accessed sequentially, so for obtaining data at 
	 * specific index, iteration is done on nodes sequentially in java. 
	 * 
	 * Duplicate elements - LinkedList allows to store duplicate elements in 
	 * java.
	 * 
	 * Null elements -Null elements can be added in LinkedList in java.
	 * 
	 * Insertion order - LinkedList maintains insertion order if all elements 
	 * are added using add or addLast method because both method adds elements 
	 * add element at end of LinkedList. 
	 * 
	 * synchronized - It is not synchronized (because 2 threads on same 
	 * LinkedList object can access it at same time) in java. 
	 * 
	 * Performance - LinkedList is not synchronized, hence its operations are 
	 * faster as compared to some other synchronized implementation of List 
	 * interface in java. 
	 * 
	 * 
	 * When to use java.util.LinkedList in java :
	 * 
	 * LinkedList can be used when we want to store duplicate elements in java.
	 * 
	 * We must prefer LinkedList for when add and remove operations are more 
	 * as compared to get operations in java, and
	 * 
	 * LinkedList can be used when we are not working in multithreading 
	 * environment in java.
	 * 
	 */

	public static void main(String[] args) 
	{
		//Creating java.util.LinkedList (using constructor)
		List<String> linkedList=new LinkedList<String>(); 
		
		//Add element in java.util.LinkedList
		linkedList.add("ind");  //add(E element)
		
		linkedList.add(1, "ind"); //add(int index, E element)
		
		((LinkedList<String>) linkedList).addFirst("ind"); //addFirst(E element)
		
		((LinkedList<String>) linkedList).addLast("ind"); //addLast(E element)
		
		
		
	}
}
