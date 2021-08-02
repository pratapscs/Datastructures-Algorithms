package com.datastructures.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample 
{
    public static void main(String args[]) 
    {
 
           List<String> linkedList = new LinkedList<String>();
 
           linkedList.add("pratap");
           linkedList.add("java");
           linkedList.add("mava");
 
           System.out.println("linkedList = "+linkedList);
           
           System.out.println("\n--------get element at 1st index i.e. java");
           System.out.println("element at 1st index = "+linkedList.get(1));  
           
           System.out.println("\n--------contains element  ");
           System.out.println("linkedList.contains = "+linkedList.contains("java"));
 
           
           System.out.println("\n--------Remove element at 1st index i.e. java");
           linkedList.remove(1);   
 
           System.out.println("linkedList = "+linkedList);
 
           System.out.println("\n---------Remove pratap from list");
           linkedList.remove("pratap");
 
           System.out.println("linkedList = "+linkedList);
 
           System.out.println("\n---------Set newVal at 0th index");
           linkedList.set(0,"newVal"); //mava will be replace by newVal
           System.out.println("linkedList = "+linkedList);
           
           
           
           
           
    }
}