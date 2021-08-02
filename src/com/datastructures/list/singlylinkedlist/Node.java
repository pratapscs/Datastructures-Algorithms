package com.datastructures.list.singlylinkedlist;

/**
 *Node class, which holds data and contains next which points to next Node of Singly LinkedList.
 */
class Node
{
    public int data; // data in Node.
    public Node next; // points to next Node in list.
 
    /**
     * Constructor
     */
    public Node(int data)
    {
           this.data = data;
    }
 
    /**
     * Display Node's data
     */
    public void displayNode() {
           System.out.print( data + " ");
    }
}