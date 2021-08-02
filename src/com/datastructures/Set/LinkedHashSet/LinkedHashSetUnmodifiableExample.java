package com.datastructures.Set.LinkedHashSet;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetUnmodifiableExample 
{
    public static void main(String args[]) {
 
           // creates array with initial capacity of 10.
           Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();
 
           linkedLinkedHashSet.add("pratap");
           linkedLinkedHashSet.add("java");
 
           // getting unmodifiable LinkedHashSet
           Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedLinkedHashSet);
           
           /*
            * Now any attempt to modify list will throw java.lang.UnsupportedOperationException
            */
           unmodifiableSet.add("sushma");
    }
}