package com.datastructures.stack;

/**
 * For implementing stack using using LinkedList- This StackLinkedList
 * class internally maintains LinkedList reference in java.
 */
 
class StackLinkedList
{
      LinkedList linkedList = new LinkedList(); // creation of Linked List
    
    /**
     * Push items in stack, it will put items on top of Stack.
     */
    public void push(int value)
    {
           linkedList.insertFirst(value);
    }
 
    /**
     * Pop items in stack, it will remove items from top of Stack.
     */
    public void pop() throws StackEmptyException 
    {
           try
           {
           linkedList.deleteFirst();
           }
           catch(LinkedListEmptyException llee)
           {
                  throw new StackEmptyException();
           }
    }
 
    /**
     * Display stack.
     */
    public void displayStack()
    {
           System.out.print("Displaying Stack >  Top to Bottom : ");
           linkedList.displayLinkedList();
    }
 
}
 
 
/**
 * Main class - To test Stack Implementation Using LinkedList in java
 */
public class StackImplementationUsingLinkedListExample
{
    public static void main(String[] args) 
    {
    
           StackLinkedList stackLinkedList=new StackLinkedList();
           System.out.println("INSERTING AT FIRST (TOP) IN STACK IMPLEMENTED USING LINKED LIST ");
           stackLinkedList.push(39);  //push node.
           stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING LINKED LIST in java
           stackLinkedList.push(71);  //push node.
           stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING LINKED LIST in java
           stackLinkedList.push(11);  //push node.
           stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING LINKED LIST in java
           stackLinkedList.push(76);  //push node.
           stackLinkedList.displayStack(); // display STACK IMPLEMENTED USING LINKED LIST in java
 
           System.out.println("\nDELETING FROM FIRST (TOP) FROM STACK IMPLEMENTED USING LINKED LIST ");
 
           stackLinkedList.pop();  //pop Node
           stackLinkedList.displayStack();  // display STACK IMPLEMENTED USING LINKED LIST in java
           stackLinkedList.pop();  //pop Node
           stackLinkedList.displayStack();  // display STACK IMPLEMENTED USING LINKED LIST in java
           stackLinkedList.pop();  //pop Node
           stackLinkedList.displayStack();  // display STACK IMPLEMENTED USING LINKED LIST in java
           stackLinkedList.pop();  //pop Node
           stackLinkedList.displayStack();  // display STACK IMPLEMENTED USING LINKED LIST in java       
 
    }
}