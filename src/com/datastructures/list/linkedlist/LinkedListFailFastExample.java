package com.datastructures.list.linkedlist;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedListFailFastExample 
{
    public static void main(String args[])
    {
 
        List<String> linkedList = new LinkedList<String>();
 
        linkedList.add("pratap");
        linkedList.add("java");
 
        System.out.println("-------use iterator-------");
           // fail-fast
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
               linkedList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(iterator.next());
        }
 
        System.out.println("-------use listIterator-------");
        // fail-fast
        ListIterator<String> listIterator = linkedList.listIterator();
        listIterator.next();
        listIterator.previous();
        while (listIterator.hasNext()) {
               linkedList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(listIterator.next());
        }
 
 
        System.out.println("-------use Enumeration-------");
        // fail-fast
        Enumeration<String> listEnum = Collections.enumeration(linkedList);
        while (listEnum.hasMoreElements()) {
               linkedList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(listEnum.nextElement());
        }
 
        System.out.println("-------use enhanced for loop-------");
           //enhanced for loop is fail-fast
        for (String string : linkedList) {
               linkedList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(string);
        }
 
 
 
    }
}