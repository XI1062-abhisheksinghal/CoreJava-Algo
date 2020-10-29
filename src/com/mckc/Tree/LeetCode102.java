package com.mckc.Tree;

import java.util.ArrayList;
import java.util.List;

public class LeetCode102 {

    public static List<Integer> ls = new ArrayList<>();
    public int leftheight =0;
    public int rightheight =0;

     class TreeNode{

        int val ;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            val= this.val;
            left=null;
            right=null;
        }

    }

    public void createTree(){

    }

    public static void main(String args[]){


       // List<List<Integer>> result = levelList(root);


//        for(List<Integer> ls:result){
//            for(Integer i:ls){
//
//            }
//        }


    }

    public static List<Integer> levelOrderTraversal(TreeNode n){


        TreeNode root = n;
        ls.add(n.val);
        if(root.left!=null){
            levelOrderTraversal(root.left);
        }

        if(root.right!=null){
            levelOrderTraversal(root.right);
        }

        return ls;
    }

    public static List<List<Integer>> levelList(TreeNode root){

        List<List<Integer>> list = new ArrayList<>();

        return list;

    }

    public int heightOftree(TreeNode root){

         if(root==null){
             return 0;
         }

         if(root.left!=null){
             leftheight++;
         }
         if(root.right!=null){
             rightheight++;
         }

         return Integer.max(leftheight,rightheight);

    }
}
