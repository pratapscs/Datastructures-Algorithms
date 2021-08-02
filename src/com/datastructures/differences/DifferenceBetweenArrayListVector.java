package com.datastructures.differences;

public class DifferenceBetweenArrayListVector 
{
	/*
	 * What are differences between ArrayList and Vector in java?
 	 * 
 	 * Property                    java.util.ArrayList                 java.util.Vector
 	 * 1.synchronization      java.util.ArrayList is not              java.util.Vector is synchronized    
 	 *                        synchronized  (because 2 threads        (because 2 threads on same
 	 *                        on same ArrayList object can access     Vector object can not access it at same time). 
 	 *                        it at same time). 
 	 *                        
 	 * 2.Performance          ArrayList is not synchronized, hence     Vector is synchronized, hence its
 	 *                        its operations are faster as compared    operations are slower as compared
 	 *                        to Vector in java.                       to ArrayList in java.
 	 *                                                                 If we are working not working in 
 	 *                                                                 multithreading environment jdk 
 	 *                                                                 recommends us to use ArrayList.
 	 * 
 	 * 3.Enumeration          Enumeration is fail-fast, means 		   Enumeration is fail-safe, means any 
 	 *                        any modification made to ArrayList	   modification made to Vector during
 	 *                        during iteration using Enumeration       iteration using Enumeration don’t
 	 *                        will throw ConcurrentModification        throw any exception in java.
 	 *                        Exception in java.
 	 *                        
 	 *                   
 	 * 
	 */

}
