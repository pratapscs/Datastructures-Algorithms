package com.datastructures.search;

/* Linear Search is most simplest of the way to searching element in array 
 * but consumes so much time. 
 * 
 * As an alternative we can use Binary Search which is much faster as compared 
 * to Linear Search.
 * 
 */
public class LinearSearchImplementation 
{

	private static int LSearch(int[] a,int key)
	{
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			if(a[i] == key) // This condition founds out whether we have found element.
				return i;
			}
				return -1;
		}
	public static void main(String[] args) 
	{
	int[] array= new int[]{7,5,3,2,10,100,8};
		System.out.println(LSearch(array,10));
	}
}
