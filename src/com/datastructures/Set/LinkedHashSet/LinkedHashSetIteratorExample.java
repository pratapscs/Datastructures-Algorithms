package com.datastructures.Set.LinkedHashSet;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;
 
public class LinkedHashSetIteratorExample 
{
    public static void main(String args[]) {
 
           Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();
 
           linkedLinkedHashSet.add("pratap");
           linkedLinkedHashSet.add("java");
 
           System.out.println("-------use iterator-------");
           Iterator<String> iterator = linkedLinkedHashSet.iterator();
           while (iterator.hasNext()) {
                  System.out.println(iterator.next());
           }
 
           System.out.println("-------use Enumeration-------");
           Enumeration<String> listEnum = Collections.enumeration(linkedLinkedHashSet);
           while (listEnum.hasMoreElements()) {
                  System.out.println(listEnum.nextElement());
           }
 
           System.out.println("-------use enhanced for loop-------");
           for (String string : linkedLinkedHashSet) {
                  System.out.println(string);
           }
 
    }
}