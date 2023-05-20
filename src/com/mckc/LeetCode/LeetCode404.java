package com.mckc.LeetCode;

import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode404 {


    public final static List<Integer> leftNodes = new ArrayList<Integer>();
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
            //left=right=null;

        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left= new TreeNode(2);
        root.right= new TreeNode(5);
        root.right.left= new TreeNode(5);
        root.right.right= new TreeNode(7);

        //int res = sumOfLeftLeaves(root);
        //System.out.println(res);

        findSecondMinimumValue(root);
    }


    public static int sumOfLeftLeaves(TreeNode root) {

        //Sum of left leaf nodes

        int sum =0;
        if(root.left!=null){
            leftNodes.add(root.left.val);
        }

        if(root.left!=null) {
            sumOfLeftLeaves(root.left);
        }
           if(root.right!=null) {
               sumOfLeftLeaves(root.right);
           }

        for(Integer i :leftNodes){
            sum = sum+i;
        }

        return sum;

    }

    public static int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        Set<Integer> set = new HashSet<>();
        dfs(root, set);
        set.remove(root.val);
        if (set.size() == 0) return -1;

        int min = Integer.MAX_VALUE;
        for (int v : set) min = Math.min(min, v);
        return min;
    }

    private static void dfs(TreeNode node, Set<Integer> set) {
        set.add(node.val);
        if (node.left != null) dfs(node.left, set);
        if (node.right != null) dfs(node.right, set);
    }

}

