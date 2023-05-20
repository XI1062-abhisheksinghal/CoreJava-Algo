package main;

import java.util.PriorityQueue;

public class Pepsico {

    class Node{

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

        //input with large values
        int[]  unsortedArray= {1,2,3,4,9,34,43,99,-1,-2,0};

        //find the largest value
        int maxSofar =0;
        //Time complexity - O(n) --n comparisons
        //Maxheap -- find max element
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i=0;i<unsortedArray.length;i++){
            if(unsortedArray[i]>maxSofar){
                maxSofar=unsortedArray[i];
            }
        }

        System.out.println(maxSofar);

//        Given a binary tree, print the left view (or the right view – any one)
//        1.	Pre-Order
//        1.	Print data
//        2.	Recurse (node.left)
//        3.	Recurse (node.right

//        99
//       / \
//      89 101
//      /\
//     88 90


    }

    public void preOrderTraversal(Node root){

        if(root==null){
            System.out.println("No Nodes present in tree");
        }

        System.out.println(root.data);
        if(root.left!=null){
            System.out.println(root.data);

        }
    }
}
