package com.datastructures.list.linkedlist;

import java.util.LinkedList;
import java.util.List;


public class LinkedListAddExample
{
    public static void main(String args[])
    {
           List<String> linkedList = new LinkedList<String>();
 
           System.out.println("--------add element to end of list");
           linkedList.add("pratap");
           linkedList.add("viswa");
           linkedList.add("kiran");
 
           System.out.println("linkedList = "+linkedList);
 
           System.out.println("--------add element at 1st index i.e. after pratap");
           linkedList.add(1,"java");
           System.out.println("linkedList = "+linkedList);
           
    }
}