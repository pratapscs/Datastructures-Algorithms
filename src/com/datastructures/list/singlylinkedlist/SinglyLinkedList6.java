package com.datastructures.list.singlylinkedlist;

// how to insert node at the end of a LinkedList in java?
@SuppressWarnings("unused")

public class SinglyLinkedList6 
{
	private ListNode head;// head node to hold the list
	
	//given a list , print all elements it hold
	
	public void display(ListNode head)
	{
		if(head == null)
		{
			return;
		}
		ListNode current = head;
		// loop each element till end of the list
		//list node points to null
		while(current !=null)
		{
			System.out.print(current.data +"-->");//print current element's data
			//move to next element
			current=current.next;
		}
		System.out.print(current);//here current will be null
	}
	
	//it contains a static inner class Listnode
	private static class ListNode
	{
		private int data;
		private ListNode next;
		
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public ListNode insertAtBeginning(ListNode head,int data)
	{
		ListNode newNode =new ListNode(data);
		if (head == null)
		{
			return newNode;
		}
		newNode.next =head;
		head =newNode;
		return head;//this head will be new head,having new node at beggining.
	
	}
	
	public ListNode insertAtEnd(ListNode head,int data)
	{
		ListNode newNode=new ListNode(data);
		if(head == null)
		{
			return newNode;
		}
		ListNode current =head;
		while(null != current.next)
		{
			current=current.next;
		}
		current.next =newNode;
		return head;
	}
	//given a listnode head,find out length of linked list
	public int length(ListNode head) 
	{
		if(head==null)
		{
			return 0;
		}
		//create a count variable to hold length
		int count =0;
		
		//loop each element and increment the count till list ends
		ListNode current =head;
		while(current !=null)
		{
			count ++;
			//move to next node
			current =current.next;
		}
		return count;
	}

	public static void main(String[] args) 
	{
		//10-->8-->1-->11-->null
		//10 is head node of linkedlist
		
		ListNode head=new ListNode(10);
		ListNode second=new ListNode(8);
		ListNode third=new ListNode(1);
		ListNode fourth=new ListNode(11);
		
		//attach them together to form a list
		
		head.next = second;//10-->8
		second.next=third;//10-->8-->1
		third.next=fourth;//10-->8-->1-->11-->null
		
		SinglyLinkedList6 singlyLinkedList6= new SinglyLinkedList6();
		singlyLinkedList6.display(head);
		System.out.println();
		ListNode newHead=singlyLinkedList6.insertAtEnd(head, 15);
		singlyLinkedList6.display(newHead);
	//	System.out.println("Length of linked list is -> " +singlyLinkedList4.length(head));
		
	}

}
