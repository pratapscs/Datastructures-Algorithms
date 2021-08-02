package com.datastructures.list.doublylinkedlist;

/**
 *Exception to indicate that Doubly LinkedList is empty.
 */
@SuppressWarnings("serial")
class LinkedListEmptyException extends RuntimeException
{
       public LinkedListEmptyException(){
         super();
       }
      
     public LinkedListEmptyException(String message){
         super(message);
       }  
}
 