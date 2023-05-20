package com.mckc.LeetCode;

import com.mckc.Tree.LeetCode102;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCode530 {

    private static List<Integer> ls = new ArrayList<Integer>();
    private static int lheight = 0;
    private static int rheight = 0;


    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }


    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        //root.left=new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(3);
        //root.left.right= new TreeNode(3);

        System.out.println(getMinimumDifference(root));

    }


    //Do level order traversal , create the array , sort array and return diff on two numbers with 0 and 1 index
    public static int getMinimumDifference(TreeNode root) {

        int h = heightOfTree(root);

        for (int i = 0; i < h; i++) {
            levelOrderTraversal(root, i);

        }
        List<Integer> sortedLs = ls.stream().sorted().collect(Collectors.toList());
        return sortedLs.get(1) - sortedLs.get(0);
    }

    public static void levelOrderTraversal(TreeNode root, int height) {

        if (root == null) {
            return;
        }

        if (height == 0) {
            ls.add(root.val);
        } else if (height > 0) {
            levelOrderTraversal(root.left, height - 1);
            levelOrderTraversal(root.right, height - 1);
        }
    }

    public static int heightOfTree(TreeNode root) {

        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = heightOfTree(root.left);
            int rheight = heightOfTree(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else return (rheight + 1);
        }

    }
}
