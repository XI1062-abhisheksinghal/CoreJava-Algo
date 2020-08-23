package com.mckc.Tree;


public class LevelOrderTraversal {
	
	
	static int height=0;
	static int leftTreeheight=0;
	static int rightTreeheight=0;
	static int totalNodes=0;
	static int leftNodeCount =0;
	static int rightNodeCount=0;
	static class Node{
		
		int data;
		Node left;
		Node right;
		
		public Node() {

		}

		public Node(int data) {

			this.data = data;
			left = right = null;
		}
	}
	
	public static void main(String args[]) {
		
		//Create Tree 
//		 10
//	    /   \
//	   15   20
//	  / \   / \
//	 30 40 50  80
		
		//Level order traversal 10 15 20 30 40 50 80 
		
		// by two appraches 1. by resursion 2. by iterative approach 
		//print all nodes from the node with k distance eg destination node 50 , k =1 so output 20 
		
		
		int val =10;
		Node n = new Node(val);
		n.left= new Node(15);
		n.right= new Node(20);
		n.left.left= new Node(30);
		n.left.right= new Node(40);
		
		n.right.left= new Node(50);
		n.right.right=new Node(80);
		n.right.right.right=new Node(100);
		
		int[] path = new int[1000];
		int patlen = 0;

		// printChainfromHeadtoLeaf( n,path,patlen);
		 printOnlyLeafNodes(n);
		int h =heightOftree(n);
		System.out.println(countNoOfNodes(n));
//		for (int i=1;i<=h;i++) {
//			levelOrderTraversal(n,i);
//			
//		}
//		
	//	printNodeAtkDistance(n, 2);
		
	}
	//calculating nodes from root by decreasing the distance
	public static void printNodeAtkDistance( Node n , int k) {
		
		if(n==null) {
			return;
		}
		
		if(k==0) {
			System.out.println(n.data);
		}
		
		else {

			printNodeAtkDistance(n.left, k - 1);
			printNodeAtkDistance(n.right, k - 1);

		}
	}
	
	public static void levelOrderTraversal(Node n,int level) {
		
		if(n==null) {
			
			System.out.println("Tree is empty");
		}
		if(level==1) {
		
			System.out.println(n.data);
		}
		
		else if(level>1) {
			levelOrderTraversal(n.left, level-1);
			levelOrderTraversal(n.right, level-1);
			
		}
	}
	
	
	public static int heightOftree(Node n) {

		
		
		
		
		if(n==null) {
			return height;
		}
		
		height++;
		if(n.left!=null) {
			leftTreeheight++;
			heightOftree(n.left);
		}
		
		if(n.right!=null) {
			rightTreeheight++;
			heightOftree(n.right);
		}
		
		if(leftTreeheight>rightTreeheight) {
			height= leftTreeheight;
		}else {
			height= rightTreeheight;
			
		}
		
		return height;
	}
      
	
	public static void printChainfromHeadtoLeaf(Node root, int[] path, int patlen) {

		if (root == null) {
			return;
		}

		path[patlen] = root.data;
		patlen++;
		if (root.left == null && root.right == null) {
			printRootroleaf(path, patlen);
		}

		else {
			printChainfromHeadtoLeaf(root.left, path, patlen);
			printChainfromHeadtoLeaf(root.right, path, patlen);
		}

	}

	public static void printRootroleaf(int[] path, int patlen) {

		for (int i = 0; i < patlen; i++) {
			System.out.println(path[i]);
		}

		System.out.println("");
	}
	
	public static void printOnlyLeafNodes(Node n) {
		
		if(n==null) {
			return;
		}
		if(n.left==null && n.right==null) {
			System.out.println(n.data);
			
		}
		printOnlyLeafNodes(n.left);
		
		printOnlyLeafNodes(n.right);
	}
	
	public static Integer countNoOfNodes(Node n) {
		
		if(n==null) {
			return 0;
		}
		
		if(n.left!=null) {
			leftNodeCount++;
			countNoOfNodes(n.left);
		}
		if(n.right!=null) {
			rightNodeCount++;
			countNoOfNodes(n.right);
		}
		
		return leftNodeCount+rightNodeCount;
		
		
	}
	
	
}
