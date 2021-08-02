package com.datastructures.Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample
{
    public static void main(String args[]) 
    {
 
           // creates array with initial capacity of 10.
           Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();
 
           System.out.println("--------add element ");
           linkedLinkedHashSet.add("pratap");
           linkedLinkedHashSet.add("java");
           linkedLinkedHashSet.add("tarun");
 
           System.out.println("linkedLinkedHashSet = "+linkedLinkedHashSet);
           System.out.println("linkedLinkedHashSet.isEmpty() = "+linkedLinkedHashSet.isEmpty());
 
           System.out.println("\n--------clear list - remove all elements from set");
           linkedLinkedHashSet.clear();
           
           System.out.println("linkedLinkedHashSet.isEmpty() = "+linkedLinkedHashSet.isEmpty());
 
           System.out.println("linkedLinkedHashSet = "+linkedLinkedHashSet);
 
           
    }
}
 