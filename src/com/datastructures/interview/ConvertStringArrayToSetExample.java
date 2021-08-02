package com.datastructures.interview;

//convert String Array to Set in java
//convert Array to List, than pass list in constructor of HashSet
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
 
public class ConvertStringArrayToSetExample 
{
  public static void main(String[] args)
  {
      String stringArray[] = { "a", "b", "a" };
 
      //First, convert Array to List
      //Than pass list in constructor of HashSet
      Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
 
      // Display set
      System.out.println(set);
  }
}