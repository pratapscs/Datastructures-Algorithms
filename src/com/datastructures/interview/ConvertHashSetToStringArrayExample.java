package com.datastructures.interview;

//convert HashSet to String array  in java.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class ConvertHashSetToStringArrayExample
{
  public static void main(String[] args) 
  {
      Set<String> set = new HashSet<String>();
      set.add("a");
      set.add("b");
      
      //First, convert set to List
      //by passing set in constructor of ArrayList
      List<String> arrayList = new ArrayList<String>(set);
      
      //Create stringArray of ArrayList's size
      String[] stringArray = new String[arrayList.size()];
      //Use toArray method to convert ArrayList to Array
      arrayList.toArray(stringArray);
      
      //Let's display the stringArray
      System.out.println("Display the stringArray");
      for(int i=0; i<stringArray.length; i++){
           System.out.print(stringArray[i]+" ");
      }
      
  }
}