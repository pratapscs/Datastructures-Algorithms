package com.datastructures.interview;

//convert ArrayList to HashSet in java using addAll method of HashSet
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class ConvertArrayListToHashSetExample2 
{
  public static void main(String[] args)
  {
      List<Integer> arrayList = new ArrayList<Integer>();
      arrayList.add(1);
      arrayList.add(2);
      arrayList.add(1);
 
      //convert ArrayList to HashSet by
      //passing ArrayList in addAll method of HashSet
      Set<Integer> hashSet = new HashSet<Integer>();
      hashSet.addAll(arrayList);
 
      // Display set
      System.out.println("hashSet = "+hashSet);
  }
}