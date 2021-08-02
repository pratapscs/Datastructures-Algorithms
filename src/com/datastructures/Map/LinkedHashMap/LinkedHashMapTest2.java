package com.datastructures.Map.LinkedHashMap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
 
public class LinkedHashMapTest2
{
 public static void main(String args[])
 {
     
   Map<Integer,String> linkedHashMap=new LinkedHashMap<Integer,String>();
 
    linkedHashMap.put(11, "pratap");
    linkedHashMap.put(21, "java");
    
 
    System.out.println("\n---1. Iterate on keys, by obtaining iterator on keySet---");
    Iterator<Integer> keyIterator=linkedHashMap.keySet().iterator();
    while(keyIterator.hasNext()){
           System.out.println(keyIterator.next());
    }
 
    System.out.println("\n---obtain keySet from Map---");
    Set<Integer> keySet=linkedHashMap.keySet();
    System.out.println("---now iterate on keySet using enhanced for loop---");
    for(Integer key :keySet){
           System.out.println(key);
    }
 
    
 
    System.out.println("\n---2. Iterate on values, by obtaining iterator on values---");
    Iterator<String> valueIterator=linkedHashMap.values().iterator(); 
    while(valueIterator.hasNext()){
           System.out.println(valueIterator.next());
    }
 
    System.out.println("\n---obtain values from Map---");
    Collection<String> collection=linkedHashMap.values();
    System.out.println("---now iterate on values using enhanced for loop---");
    for(String value :collection){
           System.out.println(value);
    }
 
 
 
    System.out.println("\n---3. Iterate on entry, by obtaining iterator on entrySet---");
    Iterator<Entry<Integer, String>> entryIterator=linkedHashMap.entrySet().iterator();   
    while(entryIterator.hasNext()){
           System.out.println(entryIterator.next());
    }
 
    System.out.println("\n---obtain entrySet from Map---");
    
    Set<Entry<Integer, String>> entrySet=linkedHashMap.entrySet();
    System.out.println("---now iterate on entrySet using enhanced for loop---");
    for(Entry<Integer, String> entry:entrySet){  
           System.out.println(entry);
    }
  }
}