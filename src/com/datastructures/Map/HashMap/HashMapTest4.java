package com.datastructures.Map.HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
 

public class HashMapTest4
{
     public static void main(String args[]){
            
           Map<Integer,String> hashMap=new HashMap<Integer,String>();
    
           hashMap.put(11, "pratap");
           hashMap.put(21, "sushma");
           hashMap.put(31, "java");
           
           //getting unmodifiable HashMap
           Map<Integer,String> unmodifiableMap = Collections.unmodifiableMap(hashMap);
    
 
           /*
            * Now any attempt to modify map will throw java.lang.UnsupportedOperationException
            */
           unmodifiableMap.put(41,"viswa");
     }
 
}
 