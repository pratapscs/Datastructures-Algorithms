package com.datastructures.tree;

public class Main {

	public static void main(String[] args) {
		
		
		Node1 node=new Node1();
		
		node.data=1;
		
		node.left=new Node1();
		node.left.data=2;
		node.right=new Node1();
		node.right.data=3;
		
		node.left.left=new Node1();
		node.left.left.data=4;
		
		node.left.right=new Node1();
		node.left.right.data=5;
		
		
		node.right.left=new Node1();
		node.right.left.data=6;
		
		node.right.right=new Node1();
		node.right.right.data=7;
		
		preorder(node);
		System.out.println();
		inorder(node);
		System.out.println();
		postorder(node);
	}

	private static void preorder(Node1 node) {
		if(node!=null) {
			System.out.print(node.data+" ");
			preorder(node.left);
			preorder(node.right);
			
			
		}
		else {
			
			return;
		}
		
	}
	
	private static void inorder(Node1 node) {
		if(node!=null) {
			
			inorder(node.left);
			System.out.print(node.data+" ");
			inorder(node.right);
			
			
		}
		else {
			
			return;
		}
		
	}
	

	private static void postorder(Node1 node) {
		if(node!=null) {
			
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data+" ");
			
		}
		else {
			
			return;
		}
		
	}
	
	
}
