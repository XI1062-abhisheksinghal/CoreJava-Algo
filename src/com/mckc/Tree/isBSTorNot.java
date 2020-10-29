package com.mckc.Tree;

public class isBSTorNot {

    static class Node{
       int val;
       Node left;
       Node right;

       Node(int data){
           this.val= data;
           left=null;
            right = null;
       }

    }

    public static void main(String args[]){

        System.out.println("program to check if BST or not ");
        int[] tree = {1,2,3,4};

        Node root = new Node(tree[0]);
        root.left= new Node(tree[1]);
        root.right= new Node(tree[2]);
        isBST(root);



    }


    public static void isBST( Node root){

       boolean result = findBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
       if(result){
           System.out.println("is BST");
       }
       else{
           System.out.println( "not a BST");
       }
    }

    public static boolean findBST(Node root , int min, int max){

          if(root==null){
              return true;
          }

         if(root.val< min || root.val>max){
            return false;
         }

        return  findBST(root.left, min, root.val) &&
                findBST(root.right, root.val,max);


    }





}
