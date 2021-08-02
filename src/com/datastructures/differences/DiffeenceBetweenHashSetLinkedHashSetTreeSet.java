package com.datastructures.differences;

public class DiffeenceBetweenHashSetLinkedHashSetTreeSet 
{
	/* Property                java.util.HashSet          java.util.LinkedHashSet        java.util.TreeSet
     * 
     * 1.Insertion order    java.util.HashSet does not    java.util.LinkedHashSet        java.util.TreeSet is
     *                      maintains insertion order     maintains insertion order      sorted by natural order 
     *                      in java. 					  in java.                       in java.
     *                      Example in java >  			  Example in java >              Example in java >
     *                      set.add("b");                 set.add("b");                  set.add("b");
     *                      set.add("c");				  set.add("c");                  set.add("c");
     *                      set.add("a");                 set.add("a");                  set.add("a");
     *                      Output >                      Output >                       Output >
     *                      No specific order             b c a							 a b c
     * 
     * 2.Null elements      HashSet allows to store       LinkedHashSet allows to        TreeSet does not allows to
     *                      one null in java.             store one null in java.        store any null in java.
     *                      															 Any attempt to add null throws 
     *                      														     runtimeException (NullPointerException).
     *                      
     * 3.Data structure    For storing elements           For storing elements           For storing elements 
     * internally used     HashSet internally             LinkedHashSet internally       TreeSet internally uses TreeMap.
     * for storing data    uses  HashMap.                 uses  LinkedHashMap.
     * 
     * 
     * 4.Introduced  in    java.util.HashSet was          java.util.LinkedHashSetwas      java.util.TreeSet was
     *  which java         introduced in second           introduced in fourth			  introduced in second version
     *  version            version of java (1.2)          version of java (1.4)           of java (1.2) i.e. JDK 2.0
     *                     i.e. JDK 2.0                   i.e. JDK 4.0
     *                     
     *                     
     * 5.Implements       HashSet implements              LinkedHashSet implements        TreeSet implements java.util.Set
     * which interface    java.util.Set interface.        java.util.Set interface.        java.util.SortedSet
     * 																					  java.util.NavigableSet interface.
	 *  
	 */

}
