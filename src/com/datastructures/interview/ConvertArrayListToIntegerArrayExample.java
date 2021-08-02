package com.datastructures.interview;

//convert ArrayList to Integer array in java.

import java.util.ArrayList;
import java.util.List;
 
public class ConvertArrayListToIntegerArrayExample 
{
  public static void main(String[] args) {
      List<Integer> arrayList = new ArrayList<Integer>();
      arrayList.add(1);
      arrayList.add(2);
      
      //Create integerArray of ArrayList's size
      Integer[] integerArray = new Integer[arrayList.size()];
      //Use toArray method to convert ArrayList to Array
      arrayList.toArray(integerArray);
      
      //Let's display the integerArray
      System.out.println("Display the integerArray");
      for(int i=0; i<integerArray.length; i++){
           System.out.print(integerArray[i]+" ");
      }
      
  }
}