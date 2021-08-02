package com.datastructures.queue;

public class CircularArray 
{
	private int[] array;
	private int front;
	private int rear;
	private int N;
	
	public CircularArray()
	{
		N=5;
		array = new int[N];
		front = rear = 0;
	}
	
	private void resize()
	{
		int s=size();
		N= 2*N;
		int lastIndex = s+1;
		int[] arr=new int[N];
		int i=0;
		while(s>0)
		{
			s--;
			arr[i++] = array[front++];
			if(front == lastIndex)
				front = 0;	
		}
		rear = i++;
		front =0;
		array = arr;
	}
	
	public void enqueue(int x)
	{
		int s= size();
		if(s == N-1)
			resize();
		array[rear++] = x;
		if(rear == N)
			rear = 0;
	}
	
	public Integer dequeue()
	{
		if(isEmpty())
			return null;
		int x = array[front++];
		if(front == N)
			front = 0;
		return x;
	}
	
	public int size()
	{
		return (N - front + rear) % N;
	}
	
	public boolean isEmpty()
	{
		return front == rear;
	}
	
	public static void main(String[] args)
	{
		CircularArray ca=new CircularArray();
		ca.enqueue(5);
		ca.enqueue(7);
		ca.enqueue(10);
		ca.dequeue();
		ca.enqueue(15);
		ca.enqueue(7);
		ca.enqueue(3);
		
		while(!ca.isEmpty())
		{
			System.out.println(ca.dequeue());
		}
			
	}

}
