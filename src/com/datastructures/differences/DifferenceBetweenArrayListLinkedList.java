package com.datastructures.differences;

public class DifferenceBetweenArrayListLinkedList 
{
	/*
	 * What are differences between ArrayList and LinkedList in java?
	 * Property                 java.util.ArrayList               java.util.LinkedList 
	 * 
	 * 1.Structure           java.util.ArrayList is index         A java.util.LinkedList is a data structure
	 *                       based structure in java.             consisting of a group of nodes which
	 *                       									  together represent a sequence.
	 *                       								      node is composed of a data and a
	 *                       								      reference (in other words, a link) to 
	 *                                                            the  next node in the sequence in java.
	 * 
	 * 
	 * 2.Resizable           ArrayList is Resizable-array         New node is created for storing new 
	 *                       in java.                             element in LinkedList in java.
	 *                       
	 *
	 * 3.Initial capacity    java.util.ArrayList is created       For storing every element node is
	 *                       with initial capacity of 10 in       created in LinkedList, so linkedList’s
	 *                       java.                                initial capacity is 0 in java.
	 * 
	 * 
	 * 4.Ensuring Capacity/   ArrayList is created with initial    For storing every element node
	 * resizing.             capacity of 10.                      is created, so linkedList’s initial
	 *                       ArrayList’s size is increased by     capacity is 0, it’s size grow with
	 *                       50% i.e. after resizing it’s size    addition of each and every element 
	 *                       become 15 in java.                   in java
	 *
	 * 
	 * 5.RandomAccess        ArrayList implements RandomAccess     LinkedList does not implement RandomAccess
	 * interface             (Marker interface) to indicate that   interface in java.
	 *                       they support fast random access
	 *                       (i.e. index based access) in java.
	 *  
	 *                       
	 * 6.AbstractList and   ArrayList extends AbstractList         LinkedList extends AbstractSequentialList
	 * AbstractSequential   (abstract class) which provides        (abstract class), AbstractSequentialList
	 * List                 implementation to  List interface      extends AbstractList.
	 *                      to minimize the effort required        In LinkedList, data is accessed 
	 *                      to implement this interface backed     sequentially, so for obtaining
	 *                      by RandomAccess interface.             data at specific index, iteration
	 *                                                             is done on nodes sequentially in java. 
	 * 
	 * 7.How get(index)     Get method of ArrayList directly       Get method of LinkedList iterates
	 * method works?        gets element on specified index.       on nodes sequentially to get element
	 * 						Hence, offering O(1) complexity in     on specified index. Hence, offering
	 * 						java                                   O(n) complexity in java.
	 * 
	 * 
	 * 8.When to use        Use ArrayList when get operations      Use LinkedList when add and remove
	 * 						is more frequent than add and          operations are more frequent than
	 * 						remove operations in java.              get operations in java.
 	 * 
 	 * 
 	 * 
	 */

}
