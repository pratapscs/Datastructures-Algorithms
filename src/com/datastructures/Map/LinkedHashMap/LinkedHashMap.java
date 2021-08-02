package com.datastructures.Map.LinkedHashMap;

public class LinkedHashMap 
{
	/* LinkedHashMap:
	 * 
	 * how we will put and get key-value pair in HashMap by overriding-
	 * 
	 * equals method - helps in checking equality of entry objects.
	 * hashCode method - helps in finding bucket’s index on which data 
	 *                   will be stored. 
	 *                   
	 * We will maintain bucket (ArrayList) which will store Entry (LinkedList).
	 * 
	 * We store key-value pair by using Entry<K,V>
	 * By using,  Entry<K,V> before, after -  we keep track of newly added 
	 * entry in LinkedHashMap, which helps us in maintaining insertion order. 
	 * 
	 * Entry contains 
	 * K key, 
	 * V value,
	 * Entry<K,V> next  (i.e. next entry on that location of bucket),
	 * Entry<K,V> before and
	 * Entry<K,V> after
	 * 
	 * 
	 */

}
