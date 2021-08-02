package com.datastructures.differences;

public class DifferenceBetweenComparableComparator 
{
/* Property              java.lang.Comparable                       java.util.Comparator
 * 
 * 1.Comparing         Comparable is used to compare            Comparator can be used to compare
 * instances of        instances of same class in java.         instances of same or different classes in java.
 * class 
 * 
 * 2.sorting order     Comparable can be implemented            Comparator is implemented when one
 *                     by class which need to define            wants a different sorting order
 *                     a natural ordering for its objects.      and define custom way of comparing
 *                     Example - String, Integer, Long          two instances.
 *                     Date and all other wrapper classes 
 *                     implements Comparable.
 * 
 * 3.Changes to        For using Comparable, original           Class itself can implement Comparator
 * class               Class must implement it.                 or any other class can implement 
 * 					   Example of Comparable in java-           Comparator. Hence avoiding
 *                     class Employee implements                modification to original class.
 *                     Comparable<Employee>                     Example of Comparator in java-
 *                     For using Comparable, Employee           class ComparatorName implements
 *                     Class must implement it,                 Comparator<Employee>
 *                     no other class can implement it.         class ComparatorId implements 
 *                     											Comparator<Employee>
 *                     											In above example modifications 
 *                                                              were made to ComparatorName and 
 *                                                              ComparatorId. Hence avoiding 
 *                                                              modification to Employee class.
 * 
 * 4.Sorting on       Provides sorting only on one              We can use Comparator to sort class 
 * basis on one       criteria,because Comparable				on many criterias because class itself
 * or many            can be implemented by original			or any other class can implement 
 * criteria 		  class only in java.						Comparator in java.
 * in java                                                            
 * 
 * 
 * 5.Method          After implementing Comparable class        After implementing Comparable class
 * 					 must override compareTo method             must override compare method
 *                    
 * 6.Package		java.lang                                   java.util
 * 					java.lang package is automatically          We need to write explicit import statement -
 * 					imported by every program in java.			import java.util.Comparator
 *  				Hence, we need not to write explicit 
 *  				statement for importing
 *  				java.lang.Comparable.
 * 
 * 7.Using            Collections.sort(list) uses               Collections.sort(list,new ComparatorName());
 * Collections.		  Comparable interface for sorting 			uses Comparator interface for sorting class.
 * sort				  class.
 *                      
 */

}
