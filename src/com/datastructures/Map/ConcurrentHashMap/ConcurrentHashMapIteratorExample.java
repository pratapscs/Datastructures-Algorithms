package com.datastructures.Map.ConcurrentHashMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
 
public class ConcurrentHashMapIteratorExample 
{
 public static void main(String args[])
 {    
    Map<Integer,String> concurrentHashMap=new ConcurrentHashMap<Integer,String>();
 
    //maintains natural order of keys
    concurrentHashMap.put(21, "java");
    concurrentHashMap.put(11, "pratap");
    
 
    System.out.println("\n---1. Iterate on keys, by obtaining iterator on keySet---");
    Iterator<Integer> keyIterator=concurrentHashMap.keySet().iterator();
    while(keyIterator.hasNext()){
           System.out.println(keyIterator.next());
    }
 
    System.out.println("\n---obtain keySet from Map---");
    Set<Integer> keySet=concurrentHashMap.keySet();
    System.out.println("---now iterate on keySet using enhanced for loop---");
    for(Integer key :keySet){
           System.out.println(key);
    }
 
    
 
    System.out.println("\n---2. Iterate on values, by obtaining iterator on values---");
    Iterator<String> valueIterator=concurrentHashMap.values().iterator();   
    while(valueIterator.hasNext()){
           System.out.println(valueIterator.next());
    }
 
    System.out.println("\n---obtain values from Map---");
    Collection<String> collection=concurrentHashMap.values();
    System.out.println("---now iterate on values using enhanced for loop---");
    for(String value :collection){
           System.out.println(value);
    }
 
 
 
    System.out.println("\n---3. Iterate on entry, by obtaining iterator on entrySet---");
    Iterator<Entry<Integer, String>> entryIterator=concurrentHashMap.entrySet().iterator(); 
    while(entryIterator.hasNext()){
           System.out.println(entryIterator.next());
    }
 
    System.out.println("\n---obtain entrySet from Map---");
    Set<Entry<Integer, String>> entrySet=concurrentHashMap.entrySet();
    System.out.println("---now iterate on entrySet using enhanced for loop---");
    for(Entry<Integer, String> entry:entrySet){  
           System.out.println(entry);
    }
 
 }
 
}
 