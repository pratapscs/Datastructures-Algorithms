package com.datastructures.Map.LinkedHashMap;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
 
public class LinkedHashMapTest3 
{
     public static void main(String args[])
     {
            
           Map<Integer,String> linkedHashMap=new LinkedHashMap<Integer,String>();
    
           linkedHashMap.put(11, "pratap");
           linkedHashMap.put(21, "sushma");
           linkedHashMap.put(31, "java");
           
           //getting unmodifiable LinkedHashMap
           Map<Integer,String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
    
 
           /*
            * Now any attempt to modify map will throw java.lang.UnsupportedOperationException
            */
           unmodifiableMap.put(41,"chitti");
     }
 
}