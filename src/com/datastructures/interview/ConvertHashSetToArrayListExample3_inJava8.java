package com.datastructures.interview;

//convert ArrayList to HashSet in java 8
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
 
public class ConvertHashSetToArrayListExample3_inJava8
{
  public static void main(String[] args) {
      Set<Integer> set = new HashSet<Integer>();
      set.add(1);
      set.add(2);
      set.add(3);
 
      List<Object> arrayList = set.stream().collect(Collectors.toList());
      
      System.out.println("arrayList = "+arrayList);  
  }
}