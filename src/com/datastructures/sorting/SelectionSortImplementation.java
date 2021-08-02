package com.datastructures.sorting;

/* Selection sort offers better performance as compared to Bubble Sort.
 * 
 * Complexity offered by Selection sort is O(n2) .
 */
public class SelectionSortImplementation
{
	private static void SelectionSort(int[] arr,int n)
	{
		int i,min_index;
		
		for( i=0; i< n;i++)
		{
			//find the minimum element from the unsorted array
			min_index=findIndexOfSmallest(arr,i,n);
			
			//swap the found minimum element
			//with first position i.e with i
			
			int temp=arr[min_index];
			arr[min_index] = arr[i];
			arr[i]=temp;
		}
	}
	private  static int findIndexOfSmallest(int[] a,int i,int n)
	{
		int smallestAt = i;
		
		for(int j= i+1;j<n;j++)
		{
			if(a[j] < a[smallestAt])
				smallestAt = j;
		}
		return smallestAt;
	}
	public static void main(String[] args)
	{
		int[] array= new int[] {64,25,12,11,5};
		SelectionSort(array,5);
		for(int  i=0;i<5;i++)
        System.out.println(array[i]);
		
	}

}
