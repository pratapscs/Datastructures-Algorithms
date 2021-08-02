package com.datastructures.Set.LinkedHashSet;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 * Copyright (c), AnkitMittal JavaMadeSoEasy.com
 */
public class LinkedHashSetSynchronizingExample {
    public static void main(String args[]) {
 
           // creates array with initial capacity of 10.
           Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();
 
           linkedLinkedHashSet.add("pratap");
           linkedLinkedHashSet.add("java");
 
           // getting synchronized LinkedHashSet
           Set<String> synchronizedSet = Collections.synchronizedSet(linkedLinkedHashSet);
           
 
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