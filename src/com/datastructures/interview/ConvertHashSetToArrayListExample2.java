package com.datastructures.interview;

//convert ArrayList to HashSet in java using addAll method of ArrayList
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class ConvertHashSetToArrayListExample2 
{
  public static void main(String[] args) 
  {
      Set<Integer> set = new HashSet<Integer>();
      set.add(1);
      set.add(2);
 
      List<Integer> arrayList = new ArrayList<Integer>();
 
      //convert HashSet to ArrayList
      //by passing set in addAll method of ArrayList
      arrayList.addAll(set);
      
      System.out.println("arrayList = "+arrayList);
  }
}