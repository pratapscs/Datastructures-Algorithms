package com.datastructures.stack;

@SuppressWarnings("serial")
//Exception to indicate that Stack is empty.

class StackEmptyException extends RuntimeException 
{
    
    public StackEmptyException(){
        super();
    }
    
    public StackEmptyException(String message){
        super(message);
    }
    
}
 