package com.datastructures.Set.LinkedHashSet;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;
 

public class LinkedHashSetIteratorFailFastExample {
    public static void main(String args[]) {
 
        Set<String> linkedLinkedHashSet = new LinkedHashSet<String>();
 
        linkedLinkedHashSet.add("pratap");
        linkedLinkedHashSet.add("java");
 
        System.out.println("-------use iterator-------");
        // fail-fast
        Iterator<String> iterator = linkedLinkedHashSet.iterator();
        while (iterator.hasNext()) {
               linkedLinkedHashSet.add("newElement1");//unComment to avoid ConcurrentModificationException
               System.out.println(iterator.next());
        }
 
        System.out.println("-------use Enumeration-------");
        // fail-fast
        Enumeration<String> listEnum = Collections.enumeration(linkedLinkedHashSet);
        while (listEnum.hasMoreElements()) {
               linkedLinkedHashSet.add("newElement2");//unComment to avoid ConcurrentModificationException
               System.out.println(listEnum.nextElement());
        }
 
        System.out.println("-------use enhanced for loop-------");
 
        // enhanced for loop is fail-fast
        for (String string : linkedLinkedHashSet) {
               linkedLinkedHashSet.add("newElement3");//unComment to avoid ConcurrentModificationException
               System.out.println(string);
        }
 
    }
}
 