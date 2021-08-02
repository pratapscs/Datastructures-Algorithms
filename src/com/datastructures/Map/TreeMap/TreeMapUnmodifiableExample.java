package com.datastructures.Map.TreeMap;

import java.util.Collections;
import java.util.TreeMap;
import java.util.Map;
 

public class TreeMapUnmodifiableExample 
{
     public static void main(String args[]){
            
           Map<Integer,String> treeMap=new TreeMap<Integer,String>();
    
           treeMap.put(11, "pratap");
           treeMap.put(21, "subash");
           treeMap.put(31, "java");
           
           //getting unmodifiable TreeMap
           Map<Integer,String> unmodifiableMap = Collections.unmodifiableMap(treeMap);
    
 
           /*
            * Now any attempt to modify map will throw java.lang.UnsupportedOperationException
            */
           unmodifiableMap.put(41,"sushma");
     }
 
}