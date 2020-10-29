package com.mckc.LeetCode;


import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.List;

//Find if the given sum is present in tree as sum from root to leaf
public class LeetCode112PathSum {

    public static int[]  path = new int[100];
    public static int pathlen=0;
    public static List<Integer> inorderelements = new ArrayList();

    public static int lheight =0;
    public static int rheight=0;

    static class TreeNode{

        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value){
            this.value=value;
            left = null;
            right=null;

        }
    }

    public static void main(String args[]){

        TreeNode root = new TreeNode(5);
        root.left=new TreeNode(2);
        root.right= new TreeNode(6);
        root.left.left= new TreeNode(1);
        int sum = 7;
       // boolean result = findifPathExistwithGivenSum(root, sum);
       int[]  path = new int[100];
         int pathlen=0;
      //  printFromRoottoleaf(root,path,pathlen);

        List<Integer> result = NthElementInOrderTraversal(root);
        int ele=0;
        if(result!=null){
            ele= KthElementinOrder(result,2 );
        }
        System.out.println(ele);


    }

    public static void printFromRoottoleaf(TreeNode root, int path[], int pathlen){

        if(root==null){
           return;
        }

        path[pathlen]=root.value;
        pathlen++;

        if(root.left==null && root.right==null){

            //List<Integer> result = calsum(path,pathlen);
            print(path,pathlen);


        }

        printFromRoottoleaf(root.left,path,pathlen);
        printFromRoottoleaf(root.right,path,pathlen);


    }

    public boolean findSum(List<Integer> ls , int sum){
      return false;
    }

    public static void  print(int path[], int len){

        //List<Integer> sums = new ArrayList();
        //int sum =0;
        for(int i=0;i<len;i++){
            System.out.println(path[i]);
        }
       // return sums;
        System.out.println();
    }

    public static boolean findifPathExistwithGivenSum(TreeNode root,int sum ){

            if(root==null)
           return false;

        if(root.left == null && root.right == null && sum - root.value == 0) return true;

        return findifPathExistwithGivenSum(root.left, sum - root.value) || findifPathExistwithGivenSum(root.right, sum - root.value);

    }


    public static List<Integer> NthElementInOrderTraversal(TreeNode root){

        //Do the inorder traversal for tree
        //logic for inorder traversal :- left Node , root node , right node
        if(root==null){
            return null;
        }

        if(root.left!=null) {
            NthElementInOrderTraversal(root.left);
        }
        //System.out.println(root.value);
        inorderelements.add(root.value);
        if(root.right!=null) {
            NthElementInOrderTraversal(root.right);
        }

        return inorderelements;

    }


    public static int KthElementinOrder(List<Integer> ls, int k){

        return ls.get(k-1);
    }

    public static void printNodesAtKDistance( TreeNode node , int dis){

        if(node ==null){
            return ;
        }



    }

    public static void levelOrderTraversalofTree(TreeNode root){

        if( root==null){
            return;
        }

        int h = height(root);


    }

    public static int height(TreeNode root){


        if(root.left==null && root.right==null){
            return 1;
        }

        return 0;



    }
}
