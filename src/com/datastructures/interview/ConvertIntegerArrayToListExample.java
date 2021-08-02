package com.datastructures.interview;

//convert Integer Array to List in java.

import java.util.Arrays;
import java.util.List;
 
public class ConvertIntegerArrayToListExample 
{
  public static void main(String[] args) 
  {
      Integer integerArray[] = { 1, 2 };
      
      // convert Array to List
      List<Integer> list = Arrays.asList(integerArray);
 
      // Display list
      System.out.println(list);
 
  }
}