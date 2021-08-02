package com.datastructures.Set.HashSet;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
public class HashSetTest3
{
    public static void main(String args[]) 
    {
 
           Set<String> hashSet = new HashSet<String>();
 
           hashSet.add("pratap");
           hashSet.add("java");
 
           System.out.println("-------use iterator-------");
           Iterator<String> iterator = hashSet.iterator();
           while (iterator.hasNext()) {
                  System.out.println(iterator.next());
           }
 
           System.out.println("-------use Enumeration-------");
           Enumeration<String> listEnum = Collections.enumeration(hashSet);
           while (listEnum.hasMoreElements()) {
                  System.out.println(listEnum.nextElement());
           }
 
           System.out.println("-------use enhanced for loop-------");
           for (String string : hashSet) {
                  System.out.println(string);
           }
 
    }
}
 