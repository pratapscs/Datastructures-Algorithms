package com.datastructures.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest5 
{
    public static void main(String args[]) 
    {
 
           // creates array with initial capacity of 10.
           List<String> arrayList = new ArrayList<String>();
 
           System.out.println("--------add element to end of list");
           arrayList.add("pratap");
           arrayList.add("viswa");
           arrayList.add("gokul");
 
           System.out.println("arrayList = "+arrayList);
           System.out.println("arrayList.isEmpty() = "+arrayList.isEmpty());
 
           System.out.println("\n--------clear list - remove all elements from list");
           arrayList.clear();
           
           System.out.println("arrayList.isEmpty() = "+arrayList.isEmpty());
 
           System.out.println("arrayList = "+arrayList);
 
           
    }
}