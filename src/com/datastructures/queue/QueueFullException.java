package com.datastructures.queue;

/**
 *Exception to indicate that Queue is full.
 */
@SuppressWarnings("serial")
class QueueFullException extends RuntimeException {
     
    public QueueFullException(){
        super();
    }
    
    public QueueFullException(String message){
        super(message);
    }
    
}
 