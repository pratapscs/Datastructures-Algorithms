package com.datastructures.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest7 
{
    public static void main(String args[]) 
    {
 
           // creates array with initial capacity of 10.
           List<String> arrayList = new ArrayList<String>();
 
           arrayList.add("pratap");
           arrayList.add("java");
 
           // getting unmodifiable list
           List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
           
           /*
            * Now any attempt to modify list will throw java.lang.UnsupportedOperationException
            */
           unmodifiableList.add("chitti");
 
    }
}
 