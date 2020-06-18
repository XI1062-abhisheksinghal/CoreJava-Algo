package com.mckc.LeetCode;


public class DeleteANodeInLinkedList {
	
	
	static class Node{
		
		int value;
		Node next;
		
		
		public Node(int value) {
			this.value= value;
			next =null;
			
		}
	}
	
	static public void  LinkedListPrint(Node n) {
		
		
		if(n==null) {
			
			System.out.println("List of node is empty");
		}
		while(n!=null) {
			Node current = n;
			System.out.println(current.value);
			n = current.next;
		}
		
		
	}
	
	static public void reverseList(Node node) {
		
		//print 20 15 10 5
		
		Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
       // return node; 
        LinkedListPrint(node);
		
		
	}
	
	static public void deleteNode(Node n , int data ) {
		
		Node temp = n;
		Node prev = null;
		
		if(temp!=null && temp.value==data) {
			n = temp.next;
			LinkedListPrint(n);
			return;
		}
		
		while(temp!=null && temp.value!=data) {
			
			prev = temp;
			temp=temp.next;
		}
		
		if(temp==null) {
			return;
		}
		
		prev.next = temp.next;
		LinkedListPrint(n);
		
	}
	
	public static void main(String args[]) {
		
		Node n1 = new Node(5);
		Node n2 = new Node(10);
		Node n3 = new Node(15);
		Node n4 = new Node(20);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		
	   // LinkedListPrint(n1);
		reverseList(n1);
		deleteNode(n1,20);
		
		
		
		
	}

}
