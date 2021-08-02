package com.datastructures.queue;

/**
 *Exception to indicate that Queue is empty.
 */
@SuppressWarnings("serial")
class QueueEmptyException extends RuntimeException {
     
    public QueueEmptyException(){
        super();
    }
    
    public QueueEmptyException(String message){
        super(message);
    }
    
}