package com.datastructures.Map.ConcurrentHashMap;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
 

public class ConcurrentHashMapUnmodifiableExample 
{
     public static void main(String args[])
     {
            
           Map<Integer,String> concurrentHashMap=new ConcurrentHashMap<Integer,String>();
    
           concurrentHashMap.put(11, "pratap");
           concurrentHashMap.put(21, "chitti");
           concurrentHashMap.put(31, "java");
           
           //getting unmodifiable ConcurrentHashMap
           Map<Integer,String> unmodifiableMap = Collections.unmodifiableMap(concurrentHashMap);
    
 
           /*
            * Now any attempt to modify map will throw java.lang.UnsupportedOperationException
            */
           unmodifiableMap.put(41,"tarun");
     }
 
}