package com.datastructures.list.linkedlist;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
 
public class LinkedListIterateExample 
{
    public static void main(String args[]) 
    {
 
        List<String> linkedList = new LinkedList<String>();
 
        linkedList.add("pratap");
        linkedList.add("java");
 
        System.out.println("-------use iterator-------");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) 
        {
               System.out.println(iterator.next());
        }
 
        System.out.println("-------use listIterator-------");
        ListIterator<String> listIterator = linkedList.listIterator();
        listIterator.next();
        listIterator.previous();
        while (listIterator.hasNext()) 
        {
               System.out.println(listIterator.next());
        }
 
 
        System.out.println("-------use Enumeration-------");
        Enumeration<String> listEnum = Collections.enumeration(linkedList);
        while (listEnum.hasMoreElements()) {
               System.out.println(listEnum.nextElement());
        }
 
 
        System.out.println("-------use enhanced for loop-------");
        for (String string : linkedList) {
               System.out.println(string);
        }
 
 
 
    }
}
 
 