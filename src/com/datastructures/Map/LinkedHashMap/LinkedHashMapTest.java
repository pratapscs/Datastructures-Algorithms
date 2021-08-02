package com.datastructures.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
 
public class LinkedHashMapTest 
{
 public static void main(String args[])
 {
   
    System.out.println("-----1. create Map---");
    Map<Integer,String> linkedHashMap=new LinkedHashMap<Integer,String>();
 
    System.out.println("\n-----2. put key-value pair in Map ---");
    linkedHashMap.put(11, "pratap");
    linkedHashMap.put(21, "viswa");
    linkedHashMap.put(31, "java");
    
    System.out.println("\n-----3. get method returns value corresponding to key ---");
    System.out.println("linkedHashMap.get(11) : "+linkedHashMap.get(11));
    
    System.out.println("\n-----4. containsKey method returns true if map "
                                      + "contains a mapping for the specified key ---");
    System.out.println("linkedHashMap.containsKey(11) : "+linkedHashMap.containsKey(11));
    
    System.out.println("\n-----5. containsValue method returns true if map maps one "
                                      + "or more keys to the specified value. ---");
    System.out.println("linkedHashMap.containsValue(\"pratap\") : "+linkedHashMap.containsValue("pratap"));
    
    System.out.println("linkedHashMap.remove(11) : "+linkedHashMap.remove(11));
    
    System.out.println("\n-----6. size ---");
 
    System.out.println("linkedHashMap.size() : "+linkedHashMap.size());
 
 }
 
}
 