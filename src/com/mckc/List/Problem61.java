package com.mckc.List;

public class Problem61 {

	
	public static class ListNode {
		     int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { 
		    	  this.val = val; 
		    	  }
		     ListNode(int val, ListNode next) {
		    	 this.val = val; this.next = next; 
		     
	}
		     }
		     
		     
	public static void main(String args[]) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next= new ListNode(3);
		head.next.next.next= new ListNode(4);
		head.next.next.next.next= new ListNode(5);
		
		System.out.println("inside main");
		//printList(head);
		ListNode n =rightRotateList(head, 2);
		printList(n);
		
	}
	
	public static void printList(ListNode head) {
		
		while(head!=null) {
			
			System.out.println(head.val);
			head=head.next;
		}
		
	}
	
	
	public static ListNode rightRotateList(ListNode head, int k) {
		 if(head==null)
		        return null;
			int size = 1; // since we are already at head node
			ListNode fast=head;
			ListNode slow = head;
			
			while(fast.next!=null){
			    size++;
			    fast = fast.next;
			}
			
			for(int i=size-k%size;i>1;i--) // i>1 because we need to put slow.next at the start.
				slow = slow.next;
			
			fast.next = head;
			head = slow.next;
			slow.next = null;
			
			return head;
		
	}
	
	public static void leftRotateList(ListNode node, int k) {
		
		
	}
	
	
	
	

}
