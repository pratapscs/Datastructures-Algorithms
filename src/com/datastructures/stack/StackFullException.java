package com.datastructures.stack;

@SuppressWarnings("serial")
//Exception to indicate that Stack is full.
class StackFullException extends RuntimeException 
{
     public StackFullException(){
        super();
    }
    
    public StackFullException(String message){
        super(message);
    }
    
}