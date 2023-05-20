package com.mckc.LeetCode;

public class LeetCode700 {

    static class TreeNode{

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
            left = right=null;
        }
    }

    public static void main(String[] args) {
            TreeNode root = new TreeNode(4);
            root.left= new TreeNode(2);
            root.right=new TreeNode(7);
            root.left.left=new TreeNode(1);
            root.left.right=new TreeNode(3);

            searchBST(root,2);



    }


    public static TreeNode searchBST(TreeNode root, int val) {

        //find if val exists in Tree and return the subTree

        if(root==null ){
            return null;
        }

        if(root.val==val){
            TreeNode node = new TreeNode(root.val);
            node.left= new TreeNode(root.left.val);
            node.right= new TreeNode(root.right.val);
            return node;
        }

        if(val>root.val){
            TreeNode dummy = root;
            searchBST(dummy.right,val);
        }
        if(val<root.val){
            TreeNode dummy= root;
            searchBST(dummy.left,val);
        }

        return null;
    }


}
