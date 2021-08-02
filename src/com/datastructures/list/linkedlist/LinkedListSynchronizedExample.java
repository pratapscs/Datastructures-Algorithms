package com.datastructures.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class LinkedListSynchronizedExample 
{
    public static void main(String args[]) 
    {
           List<String> linkedList = new LinkedList<String>();
 
           linkedList.add("pratap");
           linkedList.add("java");
 
           // getting synchronized LinkedList
           List<String> synchronizedList = Collections.synchronizedList(linkedList);
            
           // Iterator on synchronizedList won't be synchronized, so will have to
           // synchronize list using synchronization block during iteration
           System.out.println("------- iterating on synchronized list -------");
           synchronized (synchronizedList) 
           {
                  Iterator<String> iterator = synchronizedList.iterator();
                  while (iterator.hasNext()) {
                        System.out.println(iterator.next());
                  }
           }
 
    }
}
 