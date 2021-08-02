package com.datastructures.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTest3
{
    public static void main(String args[]) 
    {
 
        // creates array with initial capacity of 10.
        Vector<String> vector = new Vector<String>();
 
        vector.add("pratap");
        vector.add("java");
 
        System.out.println("-------use Enumeration-------");
        // fail-safe
        Enumeration<String> listEnum = vector.elements();
        while (listEnum.hasMoreElements()) {
               String str = listEnum.nextElement();
               if (str.equals("pratap")) {
                     // adding element will not throw any Exception
                     vector.add("newEle");
               }
               System.out.println(str);
        }
        
        System.out.println("-------use iterator-------");
        // fail-fast
        Iterator<String> iterator = vector.iterator();
           while (iterator.hasNext()) {
               vector.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(iterator.next());
        }
 
        System.out.println("-------use listIterator-------");
        // fail-fast
        ListIterator<String> listIterator = vector.listIterator();
        listIterator.next();
        listIterator.previous();
        while (listIterator.hasNext()) {
               vector.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(listIterator.next());
        }
 
 
        System.out.println("-------use enhanced for loop-------");
           //enhanced for loop is fail-fast
        for (String string : vector) {
               vector.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(string);
        }
 
 
 
    }
}
 