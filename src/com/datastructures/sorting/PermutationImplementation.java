package com.datastructures.sorting;

public class PermutationImplementation
{
	private static void permute(String str)
	{
		permute("",str);
	}
	public static void permute(String prefix,String s)
	{
		int N =s.length();
		if(N == 0)
		{
			System.out.println(prefix);
		}
		else
		{
		for(int i = 0;i<N;i++)
		{
			permute(prefix + s.charAt(i),s.substring(0,i) + s.substring(i+1 ,N));
		  }
	   }
	}
	public static void main(String[] args)
	{
		String str = "abc";
		permute(str);
		
	}

}
