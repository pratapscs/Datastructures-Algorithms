package com.datastructures.interview;

//convert String Array to Collection  in java >
//Collection is super interface of List interface, so Arrays.asList(stringArray) 
//can be referred by reference variable of type java.util.List or java.util.Collection.

import java.util.Arrays;
import java.util.Collection;
 
public class ConvertArrayToCollectionExample {
  public static void main(String[] args) {
      String stringArray[] = {"a", "b"};
 
      //convert Array to Collection
      Collection<String> collection = Arrays.asList(stringArray);
 
      //Display Collection
      System.out.println(collection);
  }
}