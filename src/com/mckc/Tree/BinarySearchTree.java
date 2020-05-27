package com.mckc.Tree;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class BinarySearchTree {
	
	
	   /*
	    *             print :-  100 , 80 , 90 , 70, 85 , 88 , 92 -- Done
	    *             print2( Spiral order) :- 100, 90, 80, 70,85,88,92 or 100, 80 , 90 , 92,88,85,70
	    *    100      // Search an element , if found return the parent   
	    *             //PreOrderTravesal of tree using stack .100, 80, 70, 85, 90,88,92,94     
	    *   /   \
	    *  80    90
	    * /\     /\
	    *70 85 88  92
	    *           \
	    *           94
	    */
	
	static class Node{
		
		int data;
		Node left;
		Node right;
		
		public Node() {
			
		}
		
		public Node(int data) {
			
			this.data =data;
			left=right= null;
		}
	}
	
	static int  count =0;
	//Print the left view of a tree 100, 80 , 70
	static void printleftViewTree(Node n) {
		System.out.println(n.data);
		printrec(n);
		System.out.println(count);
		}
	
	static Queue<Node> queue = new LinkedBlockingQueue<Node>();
	
	//Output 100, 80, 90 , 70, 85, 88 , 92
	static void printTreeFullView(Node n) {
		
		queue.add(n);
		
		while(queue.size()!=0) {
			Node queuednode = queue.remove();
			//if condition to print all the leaf nodes 
			if(queuednode.left==null && queuednode.right==null) {
			System.out.println(queuednode.data);
			}
			if(queuednode.left!=null) {
				Node left1 = queuednode.left;
				queue.add(left1);
			}
			if(queuednode.right!=null) {
				Node right1 = queuednode.right;
				queue.add(right1);
			}
			
		}
		
	}
	
	static void printSpiralOrder(Node n) {
		
		System.out.println(n.data);
	}
	
	
   
	static void printrec(Node n) {
	    count++;
		if(n.left!=null) {
		Node print = n.left;
		System.out.println(print.data);
		printrec(n.left);
	}
	}
	
	//Finding the height of a tree 
	
	static void heightOfTree(Node n) {
		
		
	}
	
	static void searchElementRecursively(int element, Node n) {
		
		if(element == n.data ) {
			System.out.println("Root node"+element);
		}
		
		if(element >n.right.data) {
			if(element==n.right.data) {
				System.out.println("Element found" +element);
			}else {
				
				Node right1 = n.right;
				
				searchElementRecursively(element, right1.right);
			}
		
		
		}
		if(element<n.left.data) {
			if(element==n.left.data) {
				System.out.println("Element found"+element);
			}else {
				Node left1= n.left;
				searchElementRecursively(element, left1.left);
			}
		
		}
	}
	
	//print in Spinal order 
	
	static void printSpinalOrder(Node n) {
		
		//100,90,80,70,85,88.92.94
		
		
		
		
	}
	
	//using Stack
	//PreOrderTravesal of tree using stack .100, 80, 70, 85, 90,88,92,94 
	//Stack<Integer> stack = new Stack<Integer>()and using recursion .
	static void printPreOrderTraversal (Node n) {
		
		if(n==null) {
			System.out.println("There is no nodes in tree ");
		}
		System.out.println(n.data);
		if(n.left!=null ) {
			Node n1 = n.left;
			printPreOrderTraversal(n1);
		}
		
		if(n.right!=null) {
			Node n2 = n.right;
			printPreOrderTraversal(n2);
		}
		
		}

		
		
	
	
	
	
	
	
	public static void main(String args[]) {
		
		Node n = new Node(100);
		n.left=new Node(80);
		n.right= new Node(90);
		
		n.left.left= new Node(70);
		n.left.right= new Node(85);
		
		n.right.left=new Node(88);
		n.right.right= new Node(92);
		n.right.right= new Node(94);
		//printleftViewTree(n);
		
		//Find the height of a tree 
		//heightOfTree(n);
		
		//printTreeFullView(n);
		
		//searchElementRecursively(88,n);
		
		printPreOrderTraversal(n);
		
		
		
	}

}
