package com.datastructures.sorting;

/* Bubble Sort is the simplest way of sorting the array.
 * 
 * Complexity offered by bubble sort is O(n2).
 * 
 * bubble sort is in a small amount of appropriate elements
 * if the elements is less than 100 other wise select anoher sorting algoritham.
 * array space is more than 100 it is not preferable it will take n^2 space  
 * 
 */
public class BubbleSortImplementation 
{
	private static void BSort(int[] a)
	{
		int size = a.length;
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1;j++)
			{
				if(a[j] > a[j+1]) 
				{ 
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int[] array=new int[]{5,1,4,2,8,7,22};
		BSort(array);
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]);
		
	}

}
