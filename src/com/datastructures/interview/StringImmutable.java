package com.datastructures.interview;

import java.util.Hashtable;

public class StringImmutable 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)
	{
		Hashtable ht = new Hashtable();
	   String s1="hk"; 
	
//String object is given as immutable to store as a key in map object.
		
//StringBuffer is given as mutable not meant for storing in map object as key.
		
		ht.put(s1, 1);
		ht.put("pp", 2);
		ht.put("kk", 3);
		
		//s1 = s1.toUpperCase();
		s1.toUpperCase();
		System.out.println(s1);
	
		
		Object obj= ht.get(s1);
		System.out.println(obj);
		
	}

}
