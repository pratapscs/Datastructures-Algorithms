package com.datastructures.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest6
{
    public static void main(String args[]) 
    {
 
           // creates array with initial capacity of 10.
           List<String> arrayList = new ArrayList<String>();
 
           arrayList.add("pratap");
           arrayList.add("java");
 
           // getting synchronized ArrayList
           List<String> synchronizedList = Collections.synchronizedList(arrayList);
            
           
           //Iterator on synchronizedList won't be synchronized, so will have to
           //synchronize list using synchronization block during iteration
             System.out.println("------- iterating on synchronized list -------");
             synchronized(synchronizedList)
             {
            Iterator<String> iterator = synchronizedList.iterator();
            while (iterator.hasNext()) {
                  System.out.println(iterator.next());
           }              
      }
 
    }
}