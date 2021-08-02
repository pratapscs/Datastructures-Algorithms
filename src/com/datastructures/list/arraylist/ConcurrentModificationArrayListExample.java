package com.datastructures.list.arraylist;

/* Iterator returned by few Collection framework Classes are fail-fast, 
 * means any structural modification made to these classes during iteration 
 * will throw ConcurrentModificationException in java.
 * 
 * Iterator returned by ArrayList are fail-fast, means any structural 
 * modification made to ArrayList during iteration will throw 
 * ConcurrentModificationException in java.
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
public class ConcurrentModificationArrayListExample 
{
 
    public static void main(String[] args) {
       List<String> list = new ArrayList<String>();
       list.add("a");
       list.add("b");
       list.add("c");
       
        Iterator<String> iterator = list.iterator();
       
        while(iterator.hasNext()){
       //  iterator.remove();
         String str = iterator.next();
         System.out.print(str+" ");
         
         if(str.equals("b"))
           list.add("b2");   //will throw ConcurrentModificationException
         
        }
       
        System.out.println("\nAfter iteration list is : "+list);
       
    }
 
}