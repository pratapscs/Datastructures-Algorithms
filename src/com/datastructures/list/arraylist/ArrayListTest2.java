package com.datastructures.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 
{
    public static void main(String args[]) 
    {
           // creates array with initial capacity of 10.
           List<String> arrayList = new ArrayList<String>();
 
           arrayList.add("pratap");
           arrayList.add("subash");
           arrayList.add("sushma");
 
           System.out.println("arrayList = "+arrayList);
           
           System.out.println("\n--------get element at 1st index i.e. subash");
           System.out.println("element at 1st index = "+arrayList.get(1));   
           
           System.out.println("\n--------contains element  ");
           System.out.println("arrayList.contains = "+arrayList.contains("subash")); 
 
           
           System.out.println("\n--------Remove element at 1st index i.e. subash");
           arrayList.remove(1);
 
           System.out.println("arrayList = "+arrayList);
 
           System.out.println("\n---------Remove pratap from list");
           arrayList.remove("pratap");
 
           System.out.println("arrayList = "+arrayList);
 
           System.out.println("\n---------Set newVal at 0th index");
           arrayList.set(0,"newVal"); //sushma will be replace by newVal
           System.out.println("arrayList = "+arrayList);
           
           
           
           
           
    }
}
 