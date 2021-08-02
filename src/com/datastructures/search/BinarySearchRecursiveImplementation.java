package com.datastructures.search;

public class BinarySearchRecursiveImplementation 
{
	private static int BSearch(int[] a,int left,int right,int x)
	{
		if(left <= right)
		{
			int mid=(left+right)/2;         //points to mid of array.
			
			if(a[mid] == x) return mid;
			else if (a[mid] > x)
				return BSearch(a,left, mid-1, x);
			else
				return BSearch(a,mid +1, right,x);
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] array =new int[]{2,5,8,20,50,88,110,135};
	    System.out.println(BSearch(array,0,7,5));
	}
}
