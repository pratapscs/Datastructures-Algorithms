package com.datastructures.Map.ConcurrentHashMap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
 
public class ConcurrentHashMapExample 
{
 public static void main(String args[])
 {
    
    System.out.println("-----1. create Map---");
    Map<Integer,String> concurrentHashMap=new ConcurrentHashMap<Integer,String>();
 
    System.out.println("\n-----2. put key-value pair in Map ---");
    concurrentHashMap.put(11, "pratap");
    concurrentHashMap.put(21, "tarun");
    concurrentHashMap.put(31, "java");
    
    System.out.println("\n-----3. get method returns value corresponding to key ---");
    System.out.println("concurrentHashMap.get(11) : "+concurrentHashMap.get(11));
    
    System.out.println("\n-----4. containsKey method returns true if map "
                                      + "contains a mapping for the specified key ---");
    System.out.println("concurrentHashMap.containsKey(11) : "+concurrentHashMap.containsKey(11));
    
    System.out.println("\n-----5. containsValue method returns true if map maps one "
                                      + "or more keys to the specified value. ---");
    System.out.println("concurrentHashMap.containsValue(\"pratap\") : "+concurrentHashMap.containsValue("pratap"));
    
    System.out.println("concurrentHashMap.remove(11) : "+concurrentHashMap.remove(11));
    
    System.out.println("\n-----6. size ---");
 
    System.out.println("concurrentHashMap.size() : "+concurrentHashMap.size());
 
 }
 
}