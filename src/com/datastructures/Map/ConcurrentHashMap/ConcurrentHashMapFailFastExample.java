package com.datastructures.Map.ConcurrentHashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
 
public class ConcurrentHashMapFailFastExample 
{
 public static void main(String args[])
 {
     
    Map<Integer,String> concurrentHashMap=new ConcurrentHashMap<Integer,String>();
 
    concurrentHashMap.put(11, "pratap");
    concurrentHashMap.put(21, "java");
    
 
    System.out.println("\n---1. Iterate on keys, by obtaining iterator on keySet---");
    //fail-fast
    Iterator<Integer> keyIterator=concurrentHashMap.keySet().iterator();
    while(keyIterator.hasNext()){
           concurrentHashMap.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(keyIterator.next());
    }
    
 
    System.out.println("\n---2. Iterate on values, by obtaining iterator on values---");
    //fail-fast
    Iterator<String> valueIterator=concurrentHashMap.values().iterator();   
    while(valueIterator.hasNext()){
           concurrentHashMap.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(valueIterator.next());
    }
 
    System.out.println("\n---3. Iterate on entry, by obtaining iterator on entrySet---");
    //fail-fast
    Iterator<Entry<Integer, String>> entryIterator=concurrentHashMap.entrySet().iterator(); 
    while(entryIterator.hasNext()){
           concurrentHashMap.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(entryIterator.next());
    }
 
 }
 
}