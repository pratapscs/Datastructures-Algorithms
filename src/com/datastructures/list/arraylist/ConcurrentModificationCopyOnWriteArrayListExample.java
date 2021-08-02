package com.datastructures.list.arraylist;
/* Iterator returned by few Collection framework Classes are fail-safe, 
 * means any structural modification made to these classes during iteration 
 * won’t throw any Exception in java.
 * 
 * Iterator returned by CopyOnWriteArrayList are fail-safe, means any 
 * structural modification made to CopyOnWriteArrayList during iteration 
 * won’t throw any Exception in java.
 */
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
 
public class ConcurrentModificationCopyOnWriteArrayListExample 
{
 
    public static void main(String[] args)
    {
       List<String> list = new CopyOnWriteArrayList<String>();
       list.add("a");
        list.add("b");
        list.add("c");
       
        Iterator<String> iterator = list.iterator();
       
        while(iterator.hasNext()){
  
         String str = iterator.next();
         System.out.print(str+" ");
         
         if(str.equals("b"))
           list.add("b2");   //No ConcurrentModificationException
         
        }
       
        System.out.println("\nAfter iteration list is : "+list);
       
    }
 
}
 