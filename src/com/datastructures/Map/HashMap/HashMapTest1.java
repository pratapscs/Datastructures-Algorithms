package com.datastructures.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
 
public class HashMapTest1 
{
 public static void main(String args[])
 {
     
    System.out.println("-----1. create Map---");
    Map<Integer,String> hashMap=new HashMap<Integer,String>();
 
    System.out.println("\n-----2. put key-value pair in Map ---");
    hashMap.put(11, "pratap");
    hashMap.put(21, "chitti");
    hashMap.put(31, "java");
    
    System.out.println("\n-----3. get method returns value corresponding to key ---");
    
    System.out.println("hashMap.get(11) : "+hashMap.get(11));
    
    System.out.println("\n-----4. containsKey method returns true if map "
                                      + "contains a mapping for the specified key ---");
    System.out.println("hashMap.containsKey(11) : "+hashMap.containsKey(11));
    
    System.out.println("\n-----5. containsValue method returns true if map maps one "
                                      + "or more keys to the specified value. ---");
    System.out.println("hashMap.containsValue(\"pratap\") : "+hashMap.containsValue("pratap"));
    
    System.out.println("hashMap.remove(11) : "+hashMap.remove(11));
    
    System.out.println("\n-----6. size ---");
 
    System.out.println("hashMap.size() : "+hashMap.size());
 
 }
 
}
 