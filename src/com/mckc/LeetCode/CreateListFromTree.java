package com.mckc.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CreateListFromTree {
	
	private static List<Integer> result = new ArrayList();
	
	static class Node {
		
		Node left ;
		Node right ;
		int val;
		
		Node(int val){
			this.val=val;
			left= right =null;
		}
		
	}
	
	
	public static void main(String args[]) {
		
		Node n = new Node(1);
		n.left= new Node(2);
		n.left.left= new Node(3);
		n.left.right=new Node(4);
		n.left.left.right= new Node(5);
		
		System.out.println(createListFromTree(n));
		
		
		
	}
	
	public static List<Integer> createListFromTree(Node n){
		
		Node temp = n;
		
	if(n!=null) {
			result.add(n.val);
		}
		
		if(n.left!=null) {
			Node n1 = n.left;
		createListFromTree(n1);
		
		}
		
		if(n.right!=null) {
			Node n1 = n.right;
			createListFromTree(n1);
		}
		
		return result;
	}

}
