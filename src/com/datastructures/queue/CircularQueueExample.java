package com.datastructures.queue;

/**
 * Circular Queue- implemented using Queue : is Collection of entities or elements.
 * 
 * Addition of element (enqueue) is done at REAR.
 * Removal of element (dequeue) is done at FRONT.
 * 
 * Circular Queue follows FIFO (First in first out) - 
 * means  the first element added to the queue will be the first one to be removed.
 * 
 * 
 * 
 */
 class CircularQueue<E> 
 {
    private E[] circularQueueAr;
    private int maxSize;   //Maximum Size of Circular Queue
    private int rear;//elements will be added/queued at rear.
    private int front;   //elements will be removed/dequeued from front      
    private int number; //number of elements currently in Priority Queue
    
     /**
      * Constructor
      */
    @SuppressWarnings("unchecked")
	public CircularQueue(int maxSize)
    {
        this.maxSize = maxSize;
        circularQueueAr = (E[])new Object[this.maxSize];
        number=0; //Initially number of elements in Circular Queue are 0.
        front=0;  
        rear=0;    
    }
   
    /**
     * Adds element in Circular Queue(at rear)
     */
    public void enqueue(E item) throws QueueFullException 
    {
        if(isFull())
        {
         throw new QueueFullException("Circular Queue is full");
        }else{
         circularQueueAr[rear] = item;
         rear = (rear + 1) % circularQueueAr.length;    
         number++; // increase number of elements in Circular queue
        }
    }

    /**
     * Removes element from Circular Queue(from front)
     */
    public E dequeue() throws QueueEmptyException 
    {
        E deQueuedElement;
        if(isEmpty())
        {
         throw new QueueEmptyException("Circular Queue is empty");
        }
        else
        {
          deQueuedElement = circularQueueAr[front];
         circularQueueAr[front] = null;
         front = (front + 1) % circularQueueAr.length;
            number--; // Reduce number of elements from Circular queue
        }
       return deQueuedElement;
    }
 
    /**
     * Return true if Circular Queue is full.
     */
    public boolean isFull() {     
        return (number==circularQueueAr.length);    
    }
 
 
    /**
     * Return true if Circular Queue is empty.
     */
    public boolean isEmpty() {
        return (number==0);
    }
 
 
}
 
/** CircularQueueExample Main class */
public class CircularQueueExample {
 
    public static void main(String[] args) {
        CircularQueue<Integer> circularQueue = new CircularQueue<Integer>(5); //Initial size of CircularQueueArray
      
        circularQueue.enqueue(11);
        circularQueue.enqueue(21);
        circularQueue.enqueue(31);
        circularQueue.enqueue(51);
        circularQueue.enqueue(61);
 
        System.out.print("Elements deQueued from circular Queue: ");
        System.out.print(circularQueue.dequeue()+" ");
        System.out.print(circularQueue.dequeue()+" ");
        System.out.print(circularQueue.dequeue()+" ");
        System.out.print(circularQueue.dequeue()+" ");
        System.out.print(circularQueue.dequeue()+" ");
       
    }
    
}