package com.datastructures.Set.HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest6
{
    public static void main(String args[]) {
 
           // creates array with initial capacity of 10.
           Set<String> hashSet = new HashSet<String>();
 
           hashSet.add("pratap");
           hashSet.add("java");
 
           // getting unmodifiable HashSet
           Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
           
           /*
            * Now any attempt to modify list will throw java.lang.UnsupportedOperationException
            */
           unmodifiableSet.add("subash");
    }
}