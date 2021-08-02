package com.datastructures.interview;

//convert ArrayList to String array  in java>
import java.util.ArrayList;
import java.util.List;
 
public class ConvertArrayListToStringArrayExample 
{
  public static void main(String[] args)
  {
      List<String> arrayList = new ArrayList<String>();
      arrayList.add("a");
      arrayList.add("b");
      
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