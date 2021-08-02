package com.datastructures.Map.HashTable;

import java.util.Hashtable;
import java.util.Map;
 
public class HashtableTest
{
 public static void main(String args[]){
     
 
    System.out.println("-----1. create Map---");
    Map<Integer,String> hashtable=new Hashtable<Integer,String>();
 
    System.out.println("\n-----2. put key-value pair in Map ---");
    hashtable.put(11, "pratap");
    hashtable.put(21, "chitti");
    hashtable.put(31, "java");
    
    System.out.println("\n-----3. get method returns value corresponding to key ---");
    System.out.println("hashtable.get(11) : "+hashtable.get(11));
    
    System.out.println("\n-----4. containsKey method returns true if map "
                                      + "contains a mapping for the specified key ---");
    System.out.println("hashtable.containsKey(11) : "+hashtable.containsKey(11));
    
    System.out.println("\n-----5. containsValue method returns true if map maps one "
                                      + "or more keys to the specified value. ---");
    System.out.println("hashtable.containsValue(\"pratap\") : "+hashtable.containsValue("pratap"));
    
    System.out.println("hashtable.remove(11) : "+hashtable.remove(11));
    
    System.out.println("\n-----6. size ---");
 
    System.out.println("hashtable.size() : "+hashtable.size());
 
 }
 
}