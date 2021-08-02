package com.datastructures.interview;

//convert String Array to List in java.
/*
 * java.util.Arrays.asList method returns fixed size list, i.e. unmodifiable list 
 * and Modifying unmodifiable list either by adding or removing elements throws 
 * UnsupportedOperationException in java.
 * The list returned is serializable and implements RandomAccess interface.  
 * RandomAccess is a(Marker interface) which indicate that list supports fast 
 * random access (i.e. index based access)
 * 
 */


import java.util.Arrays;
import java.util.List;
 
public class ConvertStringArrayToListExample
{
  public static void main(String[] args) 
  {
      String stringArray[] = { "a", "b" };
 
      //convert Array to List
      List<String> list = Arrays.asList(stringArray);
 
      //Display
      System.out.println(list);
  }
}