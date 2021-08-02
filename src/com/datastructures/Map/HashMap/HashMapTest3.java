package com.datastructures.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
 

public class HashMapTest3
{
 public static void main(String args[]){
     
 
    Map<Integer,String> hashMap=new HashMap<Integer,String>();
 
    hashMap.put(11, "pratap");
    hashMap.put(21, "java");
    
 
    System.out.println("\n---1. Iterate on keys, by obtaining iterator on keySet---");
    //fail-fast
    Iterator<Integer> keyIterator=hashMap.keySet().iterator();
    while(keyIterator.hasNext()){
           hashMap.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(keyIterator.next());
    }
    
 
    System.out.println("\n---2. Iterate on values, by obtaining iterator on values---");
    //fail-fast
    Iterator<String> valueIterator=hashMap.values().iterator();  
    while(valueIterator.hasNext()){
           hashMap.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(valueIterator.next());
    }
 
    System.out.println("\n---3. Iterate on entry, by obtaining iterator on entrySet---");
    //fail-fast
    Iterator<Entry<Integer, String>> entryIterator=hashMap.entrySet().iterator();  
    while(entryIterator.hasNext()){
           hashMap.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(entryIterator.next());
    }
 
 }
 
}