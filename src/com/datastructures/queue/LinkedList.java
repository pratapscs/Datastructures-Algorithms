package com.datastructures.queue;

/**
 * LinkedList class
 */
class LinkedList 
{
    private Node first; // ref to first link on list
 
    /**
     * LinkedList constructor
     */
    public LinkedList()
    {
           first = null;
    }
 
    /**
     * Inserts new Node at last of LinkedList.
     */
    public void insertLast(int data)
    {
           Node newNode = new Node(data); //Creation of New Node.
           
           if(first==null){  //means LinkedList is empty, make first point to new Node.
                  first=newNode;    //first ---> newNode
                  return;
           }
           
           Node tempNode = first; // save reference to first Node in tempNode- so that we could return saved reference.
           while(tempNode.next!=null){ //Executes until we don't find last Node of LinkedList.
                                                           //If next of some Node is pointing to null, that means it's a last Node.
                  tempNode=tempNode.next; //move to next Node.
           }
           tempNode.next=newNode;  //make last's Node next point to new Node
    }
    
    /**
     * Deletes first Node
     */
    public Node deleteFirst()
    {
           if(first==null){  //means LinkedList in empty, throw exception.              
                  throw new LinkedListEmptyException("LinkedList doesn't contain any Nodes.");
           }
           Node tempNode = first; // save reference to first Node in tempNode- so that we could return saved reference.
           first = first.next; // delete first Node (make first point to second node)
           return tempNode; // return tempNode (i.e. deleted Node)
    }
    
    /**
     * Display LinkedList
     */
    public void displayLinkedList()
    {
           Node tempDisplay = first; // start at the beginning of linkedList
           while (tempDisplay != null){ // Executes until we don't find end of list.
                  tempDisplay.displayNode();
                  tempDisplay = tempDisplay.next; // move to next Node
           }
           System.out.println();
           
    }
 
}