package com.datastructures.search;

public class BinarySearchIterativeImplementation 
{
	private static boolean Bsearch(int[] a,int value)
	{
		int low=0;  //points to first occupied cell in array.
		int high = a.length - 1; //points to last occupied cell in array.
		
		while(low <= high)
		{
			int mid=(low+high)/2;  //points to mid of array.
			
			if(a[mid] == value) return true;
			else if(a[mid] > value)
				high  = mid- 1;
			else  low = mid + 1;
			
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int[] array=new int []{1,3,4,8,12,20,35,36,40,41,55,99};
		System.out.println(Bsearch(array,8));
	}
}
