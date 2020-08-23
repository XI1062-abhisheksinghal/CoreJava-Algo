package com.mckc.LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem100 {
	
	
	static class Node {
		int val ;
		Node left;
		Node right;
		
		public Node(int val) {
			this.val= val;
			left = null;
			right= null;
			
		}
		
	}
	
	public static void main(String args[]) {
		
		Node node1 = new Node(1);
		node1.left= new Node(2);
		node1.right= new Node(3);
		
		Node node2 = new Node(1);
		node2.left= new Node(2);
		node2.right= new Node(3);
		
		System.out.println(findSameTree(node1, node2));
		
		
	}
	
	public static boolean findSameTree( Node tree1, Node tree2) {
		
		List<Integer> ls1 = levelOrderTraversal(tree1);
		List<Integer> ls2 = levelOrderTraversal(tree2);
		
		if(ls1.equals(ls2)) {
			return true;
		}
		
		return false;
		
	}
	
	public static List<Integer> levelOrderTraversal(Node tree){
		
		List<Integer> ls = new ArrayList<Integer>();

		Queue<Node> q = new LinkedList<>();

		q.add(tree);
		q.add(null);
		while (!q.isEmpty()) {

			Node curr = q.poll();

			if (curr == null) {
				if (!q.isEmpty()) {
					q.add(null);
				}
			} else {
				// Pushing left child current node
				if (curr.left != null)
					q.add(curr.left);

				// Pushing right child current node
				if (curr.right != null)
					q.add(curr.right);

				ls.add(curr.val);

				
			}
		
	}
		return ls;
	}}
