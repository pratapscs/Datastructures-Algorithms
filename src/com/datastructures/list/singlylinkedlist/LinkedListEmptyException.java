package com.datastructures.list.singlylinkedlist;

/**
 *Exception to indicate that Singly LinkedList is empty.
 */
@SuppressWarnings("serial")
class LinkedListEmptyException extends RuntimeException
{
       public LinkedListEmptyException()
       {
         super();
       }
      
     public LinkedListEmptyException(String message)
     {
         super(message);
       }  
}