package com.datastructures.Set.EnumSet;

public class EnumSet 
{
	/* -java.lang.Object
	 *  -java.util.AbstractCollection
	 *   -java.util.AbstractSet
	 *    -java.util.EnumSet
	 *    
	 * A EnumSet is specialized Set implementation for use with enum types in java. 
	 * 
	 * EnumSet all elements comes from a single enum type that is specified when the 
	 * set is created in java. 
	 * 
	 * The java.util.EnumSet maintains natural order (the order in which the enum 
	 * constants are declared) of elements in java. 
	 *
	 * The iterator returned by the iterator method traverses the elements in their 
	 * natural order (the order in which the enum constants are declared). 
	 * iterator never throw ConcurrentModificationException and it may or may not 
	 * show the effects of any modifications to the set that occur while the 
	 * iteration is in progress.
	 * 
	 * Null elements are not allowed in EnumSet in java. Attempts to insert a 
	 * null element will throw NullPointerException in java. 
	 * 
	 * java.util.EnumSet is not synchronized, we can synchronize it using 
	 * synchronizedSet method of Collections class in java.
	 * 
	 * This representation is extremely compact and efficient in java.
	 * The space and time performance of this class should be good enough to 
	 * allow its use as a high-quality, type safe alternative to traditional 
	 * int-based "bit flags." Even bulk operations such as containsAll and 
	 * retainAll run very quickly if their argument is also an enum set in java.
	 * 
	 */

}
