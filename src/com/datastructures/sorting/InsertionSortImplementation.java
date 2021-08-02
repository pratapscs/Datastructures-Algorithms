package com.datastructures.sorting;

/* Insertion Sort executes in O(n2) time.
 * 
 * But it offers better performance as compared to Bubble Sort,Selection Sort.
 * 
 * It is twice faster as compared to Bubble Sort and much faster than Selection Sort.
 *  
 */
public class InsertionSortImplementation 
{
	private static void InsertionSort(int[] array,int n)
	{
		int i,j,key;
		
		for(i= 1 ; i<n; i++)
		{
			key=array[i]; // select the first unsorted element
			j=i-1;
			
			while(j>=0 && array[j] > key)  // this loop shifts all the elements to
			{                             //right to create the position for unsorted element
				array[j+1] = array[j];
				j= j -1;
			}
			array[j+1]=key;   //this inserts the unsorted  element to its correct position.
		}
	}

	public static void main(String[] args)
	{
		int[] array =new int[] {12,11,13,5,6};
		InsertionSort(array, 5);
		for(int i =0; i<5;i++)
		System.out.println(array[i]);
	}
}
