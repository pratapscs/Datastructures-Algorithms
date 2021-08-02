package com.datastructures.list.linkedlist;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class LinkedListUnModifiableExample 
{
    public static void main(String args[])
    {
 
           List<String> linkedList = new LinkedList<String>();
 
           linkedList.add("pratap");
           linkedList.add("java");
 
           // getting unmodifiable list
           List<String> unmodifiableList = Collections.unmodifiableList(linkedList);
           
           /*
            * Now any attempt to modify list will throw java.lang.UnsupportedOperationException
            */
           unmodifiableList.add("sushma");
 
    }
}
 