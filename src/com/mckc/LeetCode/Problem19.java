package com.mckc.LeetCode;

public class Problem19 {

	static Node head;

	static class Node {

		public int data;

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		Node next;

		public Node(int data) {

			this.data = data;

		}

	}

	public static void display() {
		if (head != null) {
			Node currentNode = head;
			while (currentNode.getNext() != null) {
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNext();
			}
			System.out.println(currentNode.getData());
		}
	}

	public static void insertInLinkedList(int data) {

		Node n = new Node(data);

		if (head == null) {
			head = n;
		} else {
			Node currentNode = head;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(n);
		}
	}

	public static void deleteNode(int key) {
		// Store head node
		Node temp = head, prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && temp.data == key) {
			head = temp.next; // Changed head
			return;
		}

		// Search for the key to be deleted, keep track of the
		// previous node as we need to change temp.next
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.next = temp.next;

	}

	// delete Node at specific position

	public static void deleteSpecificPos(int pos) {

		Node node = head;
		for (int i = 0; i < pos - 1; i++) {
			node = node.getNext();
		}
		node.setNext(node.getNext().getNext());

	}

	public static void reverseList() {

		Node previous = null;
		Node curr = head;
		Node next;

		while (curr.getNext() != null) {

			next = curr.getNext();
			curr.setNext(previous);
			previous = curr;
			curr = next;

		}
		

	}
	
	public static Node deleteFromlast( int pos,Node head) {
		
		int length=0;
		if(head!=null) {
			length++;
		}
		
		
		
		
		Node curr = head;
		
		while(curr.getNext()!=null) {
			length++;
			curr= curr.getNext();
		}
		int fromStart=length-pos+1;
		curr = head;
		for (int i = 1; i <fromStart-1; i++) {
			curr = curr.getNext();
		}
		curr.setNext(curr.getNext().getNext());
		return head;
		
		
	}

	public static void main(String args[]) {

		insertInLinkedList(1);
		insertInLinkedList(2);
		insertInLinkedList(3);
		insertInLinkedList(4);

		//display();

		//reverseList();
		//display();

//	    deleteNode(2);
//	    display();
		deleteFromlast(2,head);
		display();

	}

}
