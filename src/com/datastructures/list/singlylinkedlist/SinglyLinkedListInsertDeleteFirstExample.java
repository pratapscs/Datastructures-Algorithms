package com.datastructures.list.singlylinkedlist;

/**
 * Singly LinkedList class: 
 * 
 * A linked list is a data structure consisting of a group of nodes which 
 * together represent a sequence. Under the simplest form, each node is 
 * composed of a data and a reference (in other words, a link) to the next 
 * node in the sequence.
 * 
 * To implement LinkedList without taking help of api’s provided by jdk.
 */
class LinkedList 
{
    private Node first; // ref to first link on list
 
    /**
     * Singly LinkedList constructor
     */
    public LinkedList()
    {
           first = null;
    }
 
    /**
     * Insert New Node at first position in Singly LinkedList 
     */
    public void insertFirst(int data) 
    {
           Node newNode = new Node(data); //Creation of New Node.
           newNode.next = first;   //newLink ---> old first
           first = newNode;  //first ---> newNode
    }
 
    /**
     * Deletes first Node of Singly LinkedList 
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
     * Display Singly LinkedList 
     */
    public void displayLinkedList() {
           System.out.print("Displaying LinkedList [first--->last]: ");
           Node tempDisplay = first; // start at the beginning of linkedList
           while (tempDisplay != null){ // Executes until we don't find end of list.
                  tempDisplay.displayNode();
                  tempDisplay = tempDisplay.next; // move to next Node
           }
           System.out.println();
           
    }
 
}

/**
 * Main class - To test Singly LinkedList .
 */
public class SinglyLinkedListInsertDeleteFirstExample 
{
    public static void main(String[] args)
    {
           LinkedList linkedList = new LinkedList(); // creation of Linked List
           
           linkedList.insertFirst(11);
           linkedList.insertFirst(21);
           linkedList.insertFirst(59);
           linkedList.insertFirst(14);
           linkedList.insertFirst(39);
 
           linkedList.displayLinkedList(); // display LinkedList
                        
           System.out.print("Deleted Nodes: ");
           Node deletedNode = linkedList.deleteFirst(); //delete Node
           deletedNode.displayNode();                                 //display deleted Node.
           deletedNode = linkedList.deleteFirst();      //delete Node.
           deletedNode.displayNode();                                 //display deleted Node.
           
           System.out.println();// sysout used to format output
           linkedList.displayLinkedList(); //Again display LinkedList
           
           
           
 
    }
}