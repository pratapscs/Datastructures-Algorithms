package com.datastructures.Map.TreeMap;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
 

public class TreeMapFailFastExample
{
 public static void main(String args[])
 {
     
 
    Map<Integer,String> treeMap=new TreeMap<Integer,String>();
 
    treeMap.put(11, "pratap");
    treeMap.put(21, "java");
    
 
    System.out.println("\n---1. Iterate on keys, by obtaining iterator on keySet---");
    //fail-fast
    Iterator<Integer> keyIterator=treeMap.keySet().iterator();
    while(keyIterator.hasNext()){
           treeMap.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(keyIterator.next());
    }
    
 
    System.out.println("\n---2. Iterate on values, by obtaining iterator on values---");
    //fail-fast
    Iterator<String> valueIterator=treeMap.values().iterator();  
    while(valueIterator.hasNext()){
           treeMap.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(valueIterator.next());
    }
 
    System.out.println("\n---3. Iterate on entry, by obtaining iterator on entrySet---");
    //fail-fast
    Iterator<Entry<Integer, String>> entryIterator=treeMap.entrySet().iterator();  
    while(entryIterator.hasNext()){
           treeMap.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(entryIterator.next());
    }
 
 }
 
}