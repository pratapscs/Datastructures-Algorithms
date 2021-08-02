package com.datastructures.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
 

public class VectorTest2 
{
    public static void main(String args[])
    {
 
        // creates array with initial capacity of 10.
        Vector<String> vector = new Vector<String>();
 
        vector.add("pratap");
        vector.add("java");
 
        System.out.println("-------use iterator-------");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
               System.out.println(iterator.next());
        }
 
        System.out.println("-------use listIterator-------");
           ListIterator<String> listIterator = vector.listIterator();
        listIterator.next();
        listIterator.previous();
        while (listIterator.hasNext()) {
               System.out.println(listIterator.next());
        }
 
 
        System.out.println("-------use Enumeration-------");
        Enumeration<String> listEnum = vector.elements();
        while (listEnum.hasMoreElements()) {
               System.out.println(listEnum.nextElement());
        }
 
 
        System.out.println("-------use enhanced for loop-------");
        for (String string : vector) {
               System.out.println(string);
        }
 
 
 
    }
}
 