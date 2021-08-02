package com.datastructures.sorting;

public class ComparableVsComparator 
{
	/* Comparable and Comparator are used for sorting classes.
	 * 
	 * Algorithm used by Comparator for sorting in java >
	 * 
	 * Implement Comparator interface and override its compare method in java.
	 * 
	 * Call Collections.sort and pass list [i.e. list] as parameter.
	 * 
	 * Collections.sort internally calls Arrays.sort,
	 * 
	 * Arrays.Sort() internally calls Merge Sort.
	 * 
	 * Merge sort calls overridden compare method of Comparator interface for comparison 
	 * of values.
	 * 
	 * note:
	 * 
	 * If number of elements is less than 7 then Insertion Sort is used rather than 
	 * Merge Sort. (because in case elements are less than 7 it offers better time 
	 * complexity) 
	 */

}
