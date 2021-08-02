package com.datastructures.Map.HashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
 
public class HashtableTest2 
{
 public static void main(String args[])
 {
     
 
    Map<Integer,String> hashtable=new Hashtable<Integer,String>();
 
    hashtable.put(11, "pratap");
    hashtable.put(21, "java");
    
 
    System.out.println("\n---1. Iterate on keys, by obtaining iterator on keySet---");
    //fail-fast
    Iterator<Integer> keyIterator=hashtable.keySet().iterator();
    while(keyIterator.hasNext()){
           hashtable.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(keyIterator.next());
    }
    
 
    System.out.println("\n---2. Iterate on values, by obtaining iterator on values---");
    //fail-fast
    Iterator<String> valueIterator=hashtable.values().iterator();
    while(valueIterator.hasNext()){
           hashtable.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(valueIterator.next());
    }
 
    System.out.println("\n---3. Iterate on entry, by obtaining iterator on entrySet---");
    //fail-fast
    Iterator<Entry<Integer, String>> entryIterator=hashtable.entrySet().iterator();  
    while(entryIterator.hasNext()){
           hashtable.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(entryIterator.next());
    }
 
 }
 
}