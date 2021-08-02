package com.datastructures.Set.HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest5
{
    public static void main(String args[]) {
 
           // creates array with initial capacity of 10.
           Set<String> hashSet = new HashSet<String>();
 
           hashSet.add("pratap");
           hashSet.add("java");
 
           // getting synchronized HashSet
           Set<String> synchronizedSet = Collections.synchronizedSet(hashSet);
           
           
 
           // Iterator on synchronizedSet won't be synchronized, so will have to
           // synchronize set using synchronization block during iteration
           System.out.println("------- iterating on synchronized set -------");
           synchronized (synchronizedSet) {
                  Iterator<String> iterator = synchronizedSet.iterator();
                  while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                  }
           }
    }
}