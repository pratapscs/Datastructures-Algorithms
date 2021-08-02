package com.datastructures.interview;

//convert  Map to List in java 7 or before

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class ConvertMapKeysToListExample 
{
    public static void main(String[] args) 
    {
           Map<Integer, String> map = new HashMap<Integer, String>();
           map.put(1, "pratap");
           map.put(2, "chitti");
           map.put(3, "tarun");
           
           //convert keys in map to ArrayList
           //by passing keys in map in constructor of ArrayList
           //map.keySet() method returns a Set which contains all the keys in the map.
           List<Integer> arrayList = new ArrayList<Integer>(map.keySet());
           System.out.println("arrayList containing keys in map = "+arrayList);    
    }
}