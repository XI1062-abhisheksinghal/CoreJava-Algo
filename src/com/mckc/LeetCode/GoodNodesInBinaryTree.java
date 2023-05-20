package com.mckc.LeetCode;

public class GoodNodesInBinaryTree {

        static class TreeNode {
            int val;
            TreeNode left,right;
            TreeNode(int x)  {
                val=x;
                left=null;
                right=null;
            }
        }

        static int rec(TreeNode root, int mx)
        {
            if(root==null) return 0;

            int cur=0;
            if(mx <= root.val) cur++;

            mx = Math.max(mx,root.val);
            return rec(root.left,mx) + rec(root.right,mx) + cur;
        }

        public static int goodNodes(TreeNode root)
        {
            int mx= Integer.MIN_VALUE;
            return rec(root,mx);
        }

        public static void main(String args[])
        {
            TreeNode root= new TreeNode(3);
            root.left=  new TreeNode(1);
            root.right=  new TreeNode(4);
            root.left.left=  new TreeNode(3);
            root.right.left=  new TreeNode(1);
            root.right.right=  new TreeNode(5);

            System.out.println( goodNodes(root) );
        }
    }

