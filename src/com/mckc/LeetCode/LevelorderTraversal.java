package com.mckc.LeetCode;

public class LevelorderTraversal {

    static class Node{

        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    public static void main(String[] args) {

//            10
//           / \
//          8   9
//         /\
//        7  12
        //Level order traversal
        // 10 8 9 7 12
        Node root = new Node(10);
        root.left=new Node(8);
        root.right = new Node(9);
        root.left.left= new Node(7);
        root.left.right = new Node(12);

        printLevelOrder(root);

    }


    public static void printLevelOrder(Node root){

        if(root==null){
            return;
        }

        if(root!=null) {
            System.out.println(root.data);
        }

        printLevelOrder(root.left);
        printLevelOrder(root.right);
    }
}
