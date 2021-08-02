package com.datastructures.list.vector;

import java.util.Vector;
import java.util.List;

public class VectorTest
{
    public static void main(String args[])
    {
 
           // creates array with initial capacity of 10.
           List<String> vector = new Vector<String>();
 
           System.out.println("--------add element to end of list");
           vector.add("pratap");
           vector.add("java");
           vector.add("mava");
 
           System.out.println("vector = "+vector);
 
           System.out.println("--------add element at 1st index i.e. after pratap");
           vector.add(1,"java");
           System.out.println("vector = "+vector);
 
           
    }
}