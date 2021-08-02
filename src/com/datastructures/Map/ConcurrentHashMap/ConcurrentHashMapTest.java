package com.datastructures.Map.ConcurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
 

public class ConcurrentHashMapTest 
{
    public static void main(String args[])
    {
 
        ConcurrentMap<Integer, String> concurrentHashMap =
                                        new ConcurrentHashMap<Integer, String>();
        concurrentHashMap.put(1, "java");
        System.out.println("concurrentHashMap : "+concurrentHashMap);
        
        /* Definition of ConcurrentHashMap’s putIfAbsent method >
         * public V putIfAbsent(K key, V value)
         * 
         * What do putIfAbsent method do>
         * If map does not contain specified key, put specified key-value pair 
         * in map and return null.
         * If map already contains specified key, return value corresponding to 
         * specified key.
         * 
         * putIfAbsent method is equivalent to writing following code >
         * synchronized (map)
         * {
         * if (!map.containsKey(key))
         * return map.put(key, value);
         * else
         * return map.get(key);
         * }
         * 
         */
        System.out.println("\n putIfAbsent method >> "+
                            concurrentHashMap.putIfAbsent(1, "pratap"));
        System.out.println("concurrentHashMap : "+concurrentHashMap);
 
        System.out.println("\n putIfAbsent method >> "+
                            concurrentHashMap.putIfAbsent(2, "audi"));
        System.out.println("concurrentHashMap : "+concurrentHashMap);
        
    }
}