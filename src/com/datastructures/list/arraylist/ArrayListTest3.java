package com.datastructures.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
 
public class ArrayListTest3 
{
    public static void main(String args[]) 
    {
 
        // creates array with initial capacity of 10.
        List<String> arrayList = new ArrayList<String>();
 
        arrayList.add("pratap");
        arrayList.add("swetha");
 
        System.out.println("-------use iterator-------");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext())  //Iteration is  done in forward direction
        {
               System.out.println(iterator.next()); 
               //returns next element in iteration.
               //iteration has no more elements than NoSuchElementException is thrown.
        }
 
        System.out.println("-------use listIterator-------");
        ListIterator<String> listIterator = arrayList.listIterator();
        listIterator.next();
        listIterator.previous();
        while (listIterator.hasNext()) 
        {
               System.out.println(listIterator.next());
        }
 
 
        System.out.println("-------use Enumeration-------");
        Enumeration<String> listEnum = Collections.enumeration(arrayList);
        while (listEnum.hasMoreElements())
        {
               System.out.println(listEnum.nextElement());
        }
 
 
        System.out.println("-------use enhanced for loop-------");
        for (String string : arrayList)
        {
               System.out.println(string);
        }
 
 
 
    }
}
 