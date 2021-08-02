package com.datastructures.sorting;

/* MergeSort is a divide and conquer algoritham. It divides i/p array in two
 * halves,calles itself for the two halves,and then merge the two sorted values.
 * 
 * MergeSort(arr[] , l, r)  
 * 
 * If r>l
 * 1.find the middle point to divide the array into two values:
 *               middle m=(l+r)/2
 *               
 * 2.call mergesort for first half:
 *       Call mergeSort(arr,l,m)
 *       
 * 3.call mergesort for second half:        
 *		 Call mergeSort(arr,m+1,r)
 *
 * 4.Merge the two values halves sorted in step 2 and 3 :
 *       Call mergeSort(arr,l,m,r)
 * 
 */
public class MergeSortImplementation 
{
	private static void merge(int[]  arr,int l,int m,int r) // merging two halves
	{
		int n1=m-l+1;
		int n2=r-m;
		int[] L=new int[n1]; //create temp array
		int[] R=new int[n2]; //create temp array
		int i,j,k;
		
		for(i=0;i<n1;i++) 
		    L[i]=arr[l+i]; //7. L=38
		for(j=0;j<n2;j++)
			R[j]=arr[m+1+j]; // 7. R=27
			
			i=0;
			j=0;
			k=l;
			while(i < n1 && j< n2)
			{
				if(L[i]<= R[j])         //compares the elements of two subarrays and merge them.
				{
					arr[k++] = L[i];
					i++;
				}
				else{
					arr[k++]=R[j];
					j++;
				}
			}
			while (i<n1)   //copies the remaining elements of L[], if there are any.
			{
				arr[k++]=L[i++];
			}
			while (i<n2)  //copies the remaining elements of R[], if there are any.
			{
				arr[k++]=R[j++];
			}
			
		}
	private static void mergeSort(int[] arr,int l,int r) //recursively calls itself to divide the array till size becomes one.
	{
		if(r>l) //1. r=6 l=0
		{
			int m=(l+r)/2; //2. m=3  , 4. m=1
			mergeSort(arr,l,m); //3. arr,0,3 , 5.arr,0,1 
			mergeSort(arr,m+1,r);
			merge(arr,l,m,r); //6.arr,0,0,1
		}
	}
	public static void main(String[] args) 
	{
		int[] array=new int[] {38,27,43,3,9,82,10};
		mergeSort(array,0,array.length-1);
		for(int i=0;i<array.length;i++)
			System.out.println(array[i]+ " ");
		
		}
     }

