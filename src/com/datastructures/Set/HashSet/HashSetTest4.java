package com.datastructures.Set.HashSet;
/*
 * iterator returned by HashSet is fail-fast. Means any structural modification 
 * made to HashSet like adding or removing elements during Iteration will 
 * throw java.util.ConcurrentModificationException.
 * 
 */
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 

public class HashSetTest4 
{
    public static void main(String args[]) 
    {
 
           Set<String> hashSet = new HashSet<String>();
 
           hashSet.add("pratap");
           hashSet.add("java");
 
           System.out.println("-------use iterator-------");
           // fail-fast
           Iterator<String> iterator = hashSet.iterator();
           while (iterator.hasNext()) {
                  hashSet.add("newElement1");//unComment to avoid ConcurrentModificationException
                  System.out.println(iterator.next());
           }
 
           System.out.println("-------use Enumeration-------");
           // fail-fast
           Enumeration<String> listEnum = Collections.enumeration(hashSet);
           while (listEnum.hasMoreElements()) {
                  hashSet.add("newElement2");//unComment to avoid ConcurrentModificationException
                  System.out.println(listEnum.nextElement());
           }
 
           System.out.println("-------use enhanced for loop-------");
 
           // enhanced for loop is fail-fast
           for (String string : hashSet) {
                  hashSet.add("newElement3");//unComment to avoid ConcurrentModificationException
                  System.out.println(string);
           }
 
    }
}
 