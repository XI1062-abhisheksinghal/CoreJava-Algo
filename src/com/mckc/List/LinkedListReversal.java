package com.mckc.List;

public class LinkedListReversal {
	
	
	static class Node {
		
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next = null;
		}
	}
	
	public static void main(String args[]) {
		
		Node n = new Node(1);
		n.next= new Node(2);
		n.next.next=new Node(3);
		
		printList(n);
		reversalList(n);
		
	}
	
	public static void printList(Node n) {
		
		Node tmp = n;
		
		while(tmp!=null) {
			
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
		
	}
	
	public static void reversalList(Node n) {
		
		Node prev= null;
		Node next = null;
		while(n!=null) {
			next = n.next;
			n.next=prev;
			prev= n;
			n=next;
		}
		
		printList(prev);
	}
	
	//finding the middle element using two pointer approach , finding the loop using two ptr approach .

}
