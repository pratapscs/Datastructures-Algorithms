package com.datastructures.list.vector;

import java.util.Vector;
import java.util.List;

public class VectorTest1
{
    public static void main(String args[])
    {
 
           // creates array with initial capacity of 10.
           List<String> vector = new Vector<String>();
 
           vector.add("pratap");
           vector.add("sushma");
           vector.add("viswa");
 
           System.out.println("vector = "+vector);
 
           
           
           System.out.println("\n--------get element at 1st index i.e. sushma");
           System.out.println("element at 1st index = "+vector.get(1)); 
           
           System.out.println("\n--------contains element  ");
           System.out.println("vector.contains = "+vector.contains("sushma")); 
 
           
           System.out.println("\n--------Remove element at 1st index i.e. sushma");
           vector.remove(1); 
 
           System.out.println("vector = "+vector);
 
           System.out.println("\n---------Remove pratap from list");
           vector.remove("pratap");
 
           System.out.println("vector = "+vector);
 
           System.out.println("\n---------Set newVal at 0th index");
           vector.set(0,"newVal"); //viswa will be replace by newVal
           System.out.println("vector = "+vector);
           
           
           
           
           
    }
}