package com.datastructures.Map.HashTable;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
 
public class HashtableTest3
{
     public static void main(String args[]){
            
           Map<Integer,String> hashtable=new Hashtable<Integer,String>();
    
           hashtable.put(11, "pratap");
           hashtable.put(21, "chitti");
           hashtable.put(31, "java");
           
           //getting unmodifiable Hashtable
           Map<Integer,String> unmodifiableMap = Collections.unmodifiableMap(hashtable);
    
 
           /*
            * Now any attempt to modify map will throw java.lang.UnsupportedOperationException
            */
           unmodifiableMap.put(41,"tarun");
     }
 
}
 