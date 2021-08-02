package com.datastructures.Map.TreeMap;

import java.util.TreeMap;
import java.util.Map;
 
public class TreeMapExample
{
 public static void main(String args[])
 {
     
 
    System.out.println("-----1. create Map---");
    Map<Integer,String> treeMap=new TreeMap<Integer,String>();
 
    System.out.println("\n-----2. put key-value pair in Map ---");
    treeMap.put(11, "pratap");
    treeMap.put(21, "chitti");
    treeMap.put(31, "java");
    
    System.out.println("\n-----3. get method returns value corresponding to key ---");
    System.out.println("treeMap.get(11) : "+treeMap.get(11));
    
    System.out.println("\n-----4. containsKey method returns true if map "
                                      + "contains a mapping for the specified key ---");
    System.out.println("treeMap.containsKey(11) : "+treeMap.containsKey(11));
    
    System.out.println("\n-----5. containsValue method returns true if map maps one "
                                      + "or more keys to the specified value. ---");
    System.out.println("treeMap.containsValue(\"pratap\") : "+treeMap.containsValue("pratap"));
    
    System.out.println("treeMap.remove(11) : "+treeMap.remove(11));
    
    System.out.println("\n-----6. size ---");
 
    System.out.println("treeMap.size() : "+treeMap.size());
 
 }
 
}