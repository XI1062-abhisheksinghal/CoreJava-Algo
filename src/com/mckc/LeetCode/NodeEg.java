package com.mckc.LeetCode;

public class NodeEg {

    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            data=data;
            next=null;
        }
    }

    static class Node{
        int data;
        Node left, right;

        Node(int root){
            data=root;
            left=null;
            right=null;
        }
    }

    public static ListNode reversList(ListNode root){

        ListNode prev=null;
        ListNode curr = root;
        ListNode next = null;


        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr= next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Node n = new Node(5);
        n.left= new Node(4);

        ListNode l = new ListNode(6);
        l.next=new ListNode(7);
        l.next= new ListNode(8);

        ListNode reversedList = reversList(l);

        while(reversedList!=null){
            System.out.println(reversedList.data);
            reversedList= reversedList.next;
        }







    }
}
