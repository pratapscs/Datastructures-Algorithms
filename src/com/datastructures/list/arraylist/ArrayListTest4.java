package com.datastructures.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ArrayListTest4 
{
    public static void main(String args[])
    {
 
        // creates array with initial capacity of 10.
        List<String> arrayList = new ArrayList<String>();
 
        arrayList.add("pratap");
        arrayList.add("aravind");
 
        System.out.println("-------use iterator-------");
        // fail-fast
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) 
        {
               arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(iterator.next());
        }
 
        System.out.println("-------use listIterator-------");
        // fail-fast
        ListIterator<String> listIterator = arrayList.listIterator();
        listIterator.next();
        listIterator.previous();
        while (listIterator.hasNext()) {
               arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(listIterator.next());
        }
 
 
        System.out.println("-------use Enumeration-------");
        // fail-fast
        Enumeration<String> listEnum = Collections.enumeration(arrayList);
        while (listEnum.hasMoreElements()) {
               arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(listEnum.nextElement());
        }
 
        System.out.println("-------use enhanced for loop-------");
           //enhanced for loop is fail-fast
        for (String string : arrayList) {
               arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(string);
        }
 
 
 
    }
}