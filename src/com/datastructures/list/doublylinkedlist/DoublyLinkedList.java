package com.datastructures.list.doublylinkedlist;

public class DoublyLinkedList 
{
	private Link head;
	private int size;
	
	public DoublyLinkedList()
	{
		head = null;
		size=0;	
	}
	
	public void addFront(int data)
	{
		if(head == null)
			head=new Link(null,data,null);
		else
		{
			Link newLink=new Link(null,data,head);
			head.previous=newLink;
			head=newLink;
		}
		size++;
	}
	public void addRear(int data)
	{
		if(head == null)
			head = new Link(null,data,null);
		else{
			Link current =head;
			while(current.next != null)
			{
				current = current.next;
		}
			Link newLink=new Link(current,data,null);
			current.next=newLink;
	}
		size++;
}	
	public void removeFront()
	{
		if(head == null) return;
		
		head= head.next;
		head.previous=null;
		size--;
	}
	
	public void removeRear()
	{
		if(head ==null) return;
		
	if(head.next==null)
	{
		head=null;
		size--;
		return;
	}
	Link current=head;
	while(current.next.next != null)
	{
		current=current.next;
	}
	}
	public int size()
	{
		return size;
	}
	public void print()
	{
		Link current=head;
		while(current != null)
		{
			System.out.println(current.Data());
			current=current.next;
			
		}
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public static void main(String[] args) 
	{
		
		DoublyLinkedList dll=new DoublyLinkedList();
		dll.addFront(5);
		dll.addFront(20);
		dll.print();
		System.out.println("------------");
		dll.addRear(10);
		dll.print();
		System.out.println("------------");
		dll.removeFront();
		dll.removeFront();
		dll.print();
	}

}
