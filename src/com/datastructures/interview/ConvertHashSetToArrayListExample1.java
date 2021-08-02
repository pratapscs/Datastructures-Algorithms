package com.datastructures.interview;

//convert HashSet to String ArrayList  in java using constructor.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class ConvertHashSetToArrayListExample1 
{
  public static void main(String[] args) 
  {
      Set<Integer> set = new HashSet<Integer>();
      set.add(1);
      set.add(2);
 
      //convert HashSet to ArrayList
      //by passing set in constructor of ArrayList
      List<Integer> arrayList = new ArrayList<Integer>(set);
      
      System.out.println("arrayList = "+arrayList);  
  }
}