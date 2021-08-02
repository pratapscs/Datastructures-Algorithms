package com.datastructures.interview;

//onvert Integer Array to Set in java 
//First, convert Array to List, Than pass list in constructor of HashSet
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
 
public class ConvertIntegerArrayToSetExample 
{
  public static void main(String[] args)
  {
      Integer integerArray[] = { 1, 2, 1 };
      
      //First, convert Array to List
      //Than pass list in constructor of HashSet
      Set<Integer> set = new HashSet<Integer>(Arrays.asList(integerArray));
 
      // Display set
      System.out.println(set);
 
  }
}
 