package com.mckc.LeetCode;

public class isBalancedTree {

	static int rightheight = 0;
	static int leftheight = 0;

	static int leftheightBalanced = 0;
	static int rightheightBalanced = 0;

	static int heightleft = 0;
	static int heightright = 0;

	static class Node {

		Integer data;
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

		int val = 3;
		int time =0;
		Node n = new Node(val);
		n.left = new Node(9);
		n.right = new Node(20);
		n.right.left = new Node(15);
		n.right.right = new Node(7);
		n.right.right.right = new Node(10);
		n.right.right.right.right = new Node(15);

//		    3
//		   / \
//		  9  20
//		    /  \
//		   15   7
//		         \
//		         10
//		          \
//		           15

		// System.out.println(calculateHeightofTree(n));
		// System.out.println(isBalancedTreefunc(n));

		// printAllLeftTorightLeafnode(n);

		// printNodesAtkDistancefromRoot(n,3);

		int[] path = new int[1000];
		int patlen = 0;

		// printChainfromHeadtoLeaf( n,path,patlen);
		Node leaf = new Node(3);
		findIfNodePresent(time,n, leaf);
		// minTimetoBurnTree( n, leaf );
		Node sib1= new Node(9);
		Node sib2 = new Node(20);
		//System.out.println(checkIfSibling(n,sib1,sib2));

	}

	public static int calculateHeightofTree(Node root) {

		if (root == null) {
			return 0;
		}

		if (root.left != null) {
			leftheight++;

			leftheight = calculateHeightofTree(root.left);
		}

		if (root.right != null) {
			rightheight++;
			rightheight = calculateHeightofTree(root.right);
		}

		return Math.max(leftheight, rightheight);

	}

	public static int calculateHeightofTreeleft(Node root) {
		return heightleft = calculateHeightofTree(root);

	}

	public static int calculateHeightofTreeright(Node root) {
		return heightright = calculateHeightofTree(root);

	}

	// height of each node
	public static boolean isBalancedTreefunc(Node root) {
		int left = 0;
		int right = 0;

		if (root.left != null) {
			left = calculateHeightofTreeleft(root.left);

		}

		if (root.right != null) {

			right = calculateHeightofTreeright(root.right);
		}

		if (Math.abs(left - right) > 1) {
			return false;
		}
		return true;

	}

	public static void printAllLeftTorightLeafnode(Node root) {

		// Output would be 9, 15, 15

		if (root == null) {
			return;
		}

		if (root.left == null && root.right == null) {
			System.out.println(root.data);
		}

		printAllLeftTorightLeafnode(root.right);
		printAllLeftTorightLeafnode(root.left);

	}

	public static void printNodesAtkDistancefromRoot(Node root, int dist) {

		// if dist = 3 , output =10
		if (root == null) {
			return;
		}
		if (dist == 0) {
			System.out.println(root.data);
		}

		else {

			printNodesAtkDistancefromRoot(root.left, dist - 1);
			printNodesAtkDistancefromRoot(root.right, dist - 1);

		}
	}

	public static void maxWidthOfBinaryTree(Node root) {

		// output would be 2 in this tree
		// Finding the number of nodes at each level and print the maximum number of
		// nodes

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

	public static void minTimetoBurnTree(Node root, Node leaf) {
			
//	    3
//	   / \
//	  9  20
//	    /  \
//	   15   7
//	         \
//	         10
//	          \
//	           15
			// suppose given node is 15 , so time taken is 4 secs 
		   // 1 sec it takes to burn the burn the right , left and parent of given node 
	}

	

	public static void findIfNodePresent(int time,Node root, Node leaf) {

		if (root == null || leaf == null) {
			return;
		}

		// program to print parent , ;eft , right

		if (root.data == leaf.data) {
			System.out.println(root.data);
			if (root.left != null)
				System.out.println(root.left.data);
			if (root.right != null)
				System.out.println(root.right.data);
			
			time = time +1;

			System.out.println(time);
		}

		findIfNodePresent(time,root.left, leaf);
		// if(res1) return true;

		findIfNodePresent(time,root.right, leaf);

		// return res2;

	}

	// Program to print the sibling , cousins , parent , left , right of a given
	// node
    //Check if two nodes are siblings 
	
	public static boolean checkIfSibling(Node root,Node sib1, Node sib2) {
		
		if(sib1==null || sib2==null) {
			return false;
		}
		
		if(root.left!=null || root.right!=null)
		if(root.left.data== sib1.data || root.left.data==sib2.data) {
			if( (root.right.data==sib1.data) || (root.right.data==sib2.data)) {
				return true;
			}
			return false;
		}
		
		if(root.left!=null) 
		 checkIfSibling(root.left,sib1, sib2);
		if(root.right!=null)
		checkIfSibling(root.right, sib1, sib2);
		
		return false;
		
		
		
	}
	
}
