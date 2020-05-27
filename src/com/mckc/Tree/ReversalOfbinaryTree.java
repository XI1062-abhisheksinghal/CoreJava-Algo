package com.mckc.Tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReversalOfbinaryTree {
	
	
	static class Node{
	
	 int key;
	 Node left = null, right = null;
	 
	 Node(int key){
		 this.key= key;
	 }
	}
	
	//Level Order Traversal of Tree
	public static void printTree(Node root) {
		
		
		
	}
	
	//Inorder or preOrder Traversal 
	public static void printInorderTree(Node root) {
		 if (root == null) 
	            return; 
	  
	  
	        Stack<Node> s = new Stack<Node>(); 
	        Node curr = root; 
	  
	        // traverse the tree 
	        while (curr != null || s.size() > 0) 
	        { 
	  
	            /* Reach the left most Node of the 
	            curr Node */
	            while (curr !=  null) 
	            { 
	                /* place pointer to a tree node on 
	                   the stack before traversing 
	                  the node's left subtree */
	                s.push(curr); 
	                curr = curr.left; 
	            } 
	  
	            /* Current must be NULL at this point */
	            curr = s.pop(); 
	  
	            System.out.print(curr.key + " "); 
	  
	            /* we have visited the node and its 
	               left subtree.  Now, it's right 
	               subtree's turn */
	            curr = curr.right; 
	        } 
		
	}
	
	//PostOrderTraversal 
	public static void printPostOrder(Node root) {
		
	}
	
	
	
	
	public static void main(String args[]) {
		
		    /*
		     *   
		     *   Tree Form 
		     *      15
		     *      / \
		     *     /   \
		     *    10   25
		     *   /\    /\
		     *  /  \  /  \
 		     * 5   35 23  40
 		     * 
 		     * InOrder Traversal (L P R) :- 5 10 35 15 23 25 40
 		     * Level Order Traversal :- 15 10 25 5 35 23 40 
 		     * Reverse Level Order Traversal :- 40 23 35 5 25 10 15
 		     * PreOrderTraversal (P L R ):- 15 10 5 35 25 23 40
 		     * PostOrderTraversal (L R P) :- 5 35 10 23 40 25 15
 		     * Top View of tree :- 
 		     * Left View of tree:- 
 		     * Right View of tree:- 
 		     * Spiral Order of tree :- 15 25 10 5 35 23 40 
 		     * 
 		     * 
		     */
	
	Node root = new Node(15);
	root.left = new Node(10);
	root.right= new Node(25);
	
	root.left.left= new Node(5);
	root.left.right = new Node(35);
	root.right.left = new Node(23);
	root.right.right= new Node(40);
	
	ReversalOfbinaryTree.printInorderTree(root);
	
	
  
	}
}
