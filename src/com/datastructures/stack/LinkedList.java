package com.datastructures.stack;

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
     * Insert New Node at first position
     */
    public void insertFirst(int data)
    {
           Node newNode = new Node(data); //Creation of New Node.
           newNode.next = first;   //newLink ---> old first
           first = newNode;  //first ---> newNode
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
    public void displayLinkedList() {
           Node tempDisplay = first; // start at the beginning of linkedList
           while (tempDisplay != null){ // Executes until we don't find end of list.
                  tempDisplay.displayNode();
                  tempDisplay = tempDisplay.next; // move to next Node
           }
           System.out.println();
           
    }
 
}