package com.mckc.Tree;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class PrintAllNodesAtGivenDistance {

	static class Node {

		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}

	public static void main(String args[]) {

		Node n = new Node(5);
		n.left = new Node(10);
		n.right = new Node(15);
		n.left.left = new Node(35);
		n.left.left.right = new Node(40);
		n.right.right = new Node(30);
		n.right.right.left = new Node(23);
		int k = 2;

		printAllNodesAtDistance(n, k);
		addinQueue(n);
//		5
//	   / \	
//	  10 15
//	 /    \
//	20    30 
//	/ \   /
// 35 40 23 	

	}

	public static void addinQueue(Node root) {

		Queue<Node> q = new ArrayBlockingQueue<Node>(10);
		int level = 0;
		Node curr;
		q.add(root);

		while (!q.isEmpty()) {
			
            curr = q.poll();
            System.out.println(curr.data);
			if (curr.left != null) {
				q.add(curr.left);
			}

			if (curr.right != null) {
				q.add(curr.right);

			}

		}

	}

	public static void printAllNodesAtDistance(Node n, int k) {
		// TODO Auto-generated method stub

	}

}
