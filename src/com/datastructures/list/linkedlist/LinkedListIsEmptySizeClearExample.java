package com.datastructures.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListIsEmptySizeClearExample 
{
    public static void main(String args[]) 
    {
 
           List<String> linkedList = new LinkedList<String>();
 
           System.out.println("--------add element to end of list");
           linkedList.add("pratap");
           linkedList.add("java");
           linkedList.add("mava");
 
           System.out.println("linkedList = "+linkedList);
           System.out.println("linkedList.isEmpty() = "+linkedList.isEmpty());
 
           System.out.println("\n--------clear list - remove all elements from list");
           linkedList.clear();
           
           System.out.println("linkedList.isEmpty() = "+linkedList.isEmpty());
 
           System.out.println("linkedList = "+linkedList);
 
           
    }
}