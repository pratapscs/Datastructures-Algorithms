package com.datastructures.Set.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetAddExample 
{
    public static void main(String args[]) 
    {
 
           System.out.println("-----1. create Set---");
           Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();
 
           System.out.println("\n-----2. adding elements in Set---");
           linkedLinkedHashSet.add("pratap");
           linkedLinkedHashSet.add("Java");
 
           System.out.println("linkedLinkedHashSet ="+linkedLinkedHashSet);
           
           System.out.println("\n------3. contains element  ");
           System.out.println("linkedLinkedHashSet.contains = "+linkedLinkedHashSet.contains("pratap"));
 
           System.out.println("\n------4. Remove element at 1st index i.e. mittal");
           linkedLinkedHashSet.remove("pratap");  
           System.out.println(linkedLinkedHashSet);
 
           System.out.println("linkedLinkedHashSet ="+linkedLinkedHashSet);
 
 
    }
}