package com.datastructures.list.arraylist;

import java.util.Arrays;

class ArrayListCustom1<E> {
    
  private static final int INITIAL_CAPACITY = 10;
  private Object elementData[]={};
  private int size = 0;
 
  /**
  * constructor.
  */
  public ArrayListCustom1() {
    elementData = new Object[INITIAL_CAPACITY];
 }
 
  /**
   * method adds elements in ArrayListCustom.
   */
  public void add(E e) {
    if (size == elementData.length) {
      ensureCapacity(); //increase current capacity of list, make it double.
    } 
   
   
    // Let's say current thread is taking some time in adding element to list.
    try {
           Thread.sleep(1000);
    } catch (InterruptedException ex) {
           ex.printStackTrace();
    }
 
    
    elementData[size++] = e;
  }
 
 
  /**
   * method returns element on specific index.
   */
  @SuppressWarnings("unchecked")
  public E get(int index) {
    //if index is negative or greater than size of size, we throw Exception.
    if ( index <0 || index>= size) {  
      throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
    }
    return (E) elementData[index]; //return value on index.
  }
 
 
  /**
   * method increases capacity of list by making it double.
   */
  private void ensureCapacity() {
    int newIncreasedCapacity = elementData.length * 2;
    elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
  }
 
 
}
 
/**
 * Main class to test ArrayListCustom functionality.
 */
public class ArrayListCustomExample {
     
    public static void main(String... a) throws InterruptedException 
    {
           final ArrayListCustom1<Integer> list = new ArrayListCustom1<Integer>();
 
             //Thread-1 will add element in list.
           new Thread() {
                  public void run() {
                        list.add(54);
                  }
           }.start();
 
           //Below sleep ensures Thread-2 starts after Thread-1
           Thread.sleep(10);
           
           //Thread-2 will get element from list.
           new Thread() {
                  public void run() {
                        System.out.println("\nelement at index " + 0 + " = "
                                             + list.get(0));
                  }
           }.start();
 
           /*
            * Create Thread-1 and Thread-2, then
            * Start Thread-1 and Thread-2 (ensure Thread-2 starts after Thread-1)
            * 
            * Thread-1 will add element in empty ArrayList (by default element will 
            * be added on 0th index in empty ArrayList), let’s say thread takes some 
            * time in adding element to list (by using Thread.sleep(1000)).
            * 
            * MeanWhile, Thread-2 will try to get element on 0th index of ArrayList and 
            * throw IndexOutOfBoundsException, because by the time get operation was 
            * called Thread-1 was sleeping and it wasn’t able to add element in empty 
            * ArrayList
            */
    }
     
}