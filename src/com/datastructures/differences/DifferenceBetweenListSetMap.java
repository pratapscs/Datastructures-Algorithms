package com.datastructures.differences;

public class DifferenceBetweenListSetMap 
{
	/*    Property                  java.util.List                   java.util.Set                        java.util.Map
	 * 
	 * 1.Duplicate elements         List allows to store             Set does not allow to store          Map stores data in form of key-value pair
	 *                              duplicate elements in java.      duplicate elements in java.          it does not allow to store duplicate
	 *                              																      keys but allows duplicate values in java.
	 *                              
	 * 2.Insertion order			java.util.List is ordered 		 Most of the java.util.Set 			  Most of the java.util.Map implementation
	 * 								collection it maintain           implementation does not maintain	  does not maintain insertion order.
	 * 								insertion order in java.         insertion order.					  HashMap does not maintains
	 * 																 HashSet does not maintains			  insertion order in java.
	 * 																 insertion order in java.			  Thought LinkedHashMap maintains 
	 *																 Thought LinkedHashSet maintains 	  insertion order of keys in java.
	 *																 insertion order in java.             TreeMap is sorted by natural
	 *																 TreeSet is sorted by 				  order of keys in java.
	 *																 natural order in java.
	 *
	 * 
	 * 3.Null keys                  List allows to store many        Most of the Set implementations       Lets look at Map implementations -
	 * 								null keys in java.               allow to add only one null in java.   HashMap allows one null key andmany null values.
	 * 																 TreeSet and ConcurrentSkipListSet     LinkedHashMap allows one null key and many null values.
	 * 																 does not allow to add null in java.   TreeMap doesn't allow null key
	 * 																									   but allow many null values.
	 * 																 									   Hashtable doesn't allow null	key or null values.
	 * 																									   ConcurrentHashMap doesn't allow null key or null values.
	 * 																									   ConcurrentSkipListMap doesn't allow null key or null values.
	 *
	 * 					   
	 * 
	 * 
	 * 
	 * 4.Getting element on       List implementations provide get        Set implementations does not      Map implementations does not
	 *   specific index           method to get element on specific       provide any such get method       provide any such get method to
	 *   						  index in java.                          to get element on specified       get element on specified index in java.
	 *   						  ArrayList, Vector, copyOnWriteArrayList index in java.
	 *   						  and LinkedList provides -
	 *   						  get(int index)Method returns element 
	 *                            on specified index.
	 *                            Get method directly gets element on 
	 *                            specified index. Hence, offering O(1) 
	 *                            complexity.
	 *                            
	 * 
	 * 5.Implementing classes     ArrayList, LinkedList, Vector,          HashSet, CopyOnWriteArraySet,        HashMap, Hashtable, ConcurrentHashMap,
	 *                            CopyOnWriteArrayList classes            ConcurrentSkipListSet, EnumSet,      LinkedHashMap,  TreeMap,  ConcurrentSkipListMap
	 *                            implements List interface in java.      LinkedHashSet, TreeSet, classes      IdentityHashMap,WeakHashMap,  EnumMap classes
	 *                                                                    implements Set interface in java.    implements Map interface in java.
	 *                                                                    
	 *                                                                    
	 *                                                                    
	 * 6.listIterator            listIterator method returns              Set does not provide anything like   Map provides three type of iterators -
	 *                           listIterator to iterate over  			  listIterator. It simply return       map.keySet().iterator() method
	 *                           elements in List in java.                Iterator in java.                    returns iterator to iterate over keys in HashMap
	 *                           listIterator provides additional 											   map.values().iterator() method returns
	 *                           methods as compared to iterator like 										   iterator to iterate over keys in HashMap in java.
	 *                           hasPrevious(), previous(), nextIndex(),									   map.entrySet().iterator() method returns
	 *                           previousIndex(), add(E element), 											   iterator to iterate over keys in HashMap.
	 *                           set(E element)
	 *                           
	 *
	 * 7.Structure and 
	 * resizable                List are Resizable-array implementation    Set uses Map for their implementation.   Map uses hashing technique
	 *                          of the java.util.List interface in java.   Hence, structure is map based 			for storing key-value pairs.
	 *                                                                     and resizing depends on Map 
	 *                                                                     implementation.
	 *                                                                     Example > HashSet internally 
	 *                                                                     uses HashMap.
	 * 
	 * 8.Index based          As ArrayList uses array for                 Set is not index based                   Map is not index based
	 * structure /            implementation it is index				  structure at all in java. 			   structure at all in java.
	 * RandomAccess           based structure, hence provides
	 * 						  random access to elements.
	 *                        But LinkedList is not indexed 
	 *                        based structure in java.
	 *                        
	 *                       
	 * 9.unsynchronized 
	 * implementations        ArrayList, LinkedList                      HashSet, LinkedHashSet,                 HashMap,  LinkedHashMap
	 *                                                                   TreeSet, EnumSet                        TreeMap,  IdentityHashMap, 
	 *                                                                   										 WeakHashMap,  EnumMap
	 *                                                                   
	 * 
	 * 10.synchronized 
	 * implementations        Vector, CopyOnWriteArrayList              CopyOnWriteArraySet,                     Hashtable, ConcurrentHashMap, ,
	 *  																ConcurrentSkipListSet				     ConcurrentSkipListMap
	 */

}
