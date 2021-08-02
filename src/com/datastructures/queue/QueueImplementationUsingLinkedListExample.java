package com.datastructures.queue;

/**
 * For implementing queue using using LinkedList- This QueueLinkedList
 * class internally maintains LinkedList reference in java.
 */
 
class QueueLinkedList
{
    
    LinkedList linkedList = new LinkedList(); // creation of Linked List
    
    /**
     * Insert element at rear in Queue
     */
    public void insert(int value){
           linkedList.insertLast(value);
    }
 
    /**
     * Removes elements from front of Queue 
     */
    public void remove() throws QueueEmptyException {
           try{
           linkedList.deleteFirst();
           }catch(LinkedListEmptyException llee){
                  throw new QueueEmptyException();
           }
    }
 
    /**
     * Display queue.
     */
    public void displayStack() {
           System.out.print("Displaying Queue> Front to Rear: ");
           linkedList.displayLinkedList();
    }
 
    
}
 
/**
 * Main class - To test Queue Implementation Using LinkedList in java
 */
public class QueueImplementationUsingLinkedListExample 
{
    public static void main(String[] args)
    {
           
           QueueLinkedList queueLinkedList=new QueueLinkedList();
           
           System.out.println("INSERTING AT LAST (REAR) IN QUEUE IMPLEMENTED USING LINKED LIST ");
           queueLinkedList.insert(11); //insert node.
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
           queueLinkedList.insert(71); //insert node.
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
           queueLinkedList.insert(39); //insert node.
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
           queueLinkedList.insert(31); //insert node.
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
 
           System.out.println("\nDELETING FROM FIRST (FRONT) OF QUEUE IMPLEMENTED USING LINKED LIST ");
 
           queueLinkedList.remove();  //remove Node
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
           queueLinkedList.remove();  //remove Node
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
           queueLinkedList.remove();  //remove Node
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
           queueLinkedList.remove();  //remove Node
           queueLinkedList.displayStack(); // display QUEUE IMPLEMENTED USING LINKED LIST
           
 
    }
}