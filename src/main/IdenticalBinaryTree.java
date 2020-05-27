package main;

public class IdenticalBinaryTree {
	
	class Node{
		int key;
		Node left, right = null;
		
		Node(int key){
			this.key= key;
		}
	}
	
	public static boolean isIdentical(Node x, Node y) {
		
		if(x== null && y==null ) {
			return false;
		}
		
		return ((x != null && y!= null) && (x.key==y.key) && 
				isIdentical(x.left, y.left) && 
				isIdentical(x.right, y.right));
		
	}
	
	
	public static void main( String args[]) {
		
		
		
		
	}

}
