//package com.mckc.LeetCode;
//
//class Node {
//
//    Node next;
//    int val;
//
//    public Node(int val){
//        this.val=val;
//    }
//
//
//}
//
//public class ReverseLinkedListinK {
//
//    public static void main(String[] args) {
//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);
//
//        int len = 0;
//        Node curr = head;
//
//        while (curr != null) {
//            System.out.println(curr.val);
//            len++;
//            curr = curr.next;
//        }
//
//        System.out.println("Length of linked list" + len);
//
//        Node reversedList =reverseList(head);
//        Node curr1 = reversedList;
//
//        while (curr1 != null) {
//            System.out.println(curr1.val);
//            len++;
//            curr1 = curr1.next;
//        }
//
//        System.out.println("Length of linked list" + len);
//    }
//
//
//    public static Node reverseList(Node head) {
//
//        Node next = null;
//        Node prev = null;
//
//        Node curr = head;
//
//        while(curr!=null){
//            next = curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//        }
//
//        return prev;
//
//    }
//
//    public static Node reverselistByk(Node head,int k){
//
//    }
//}
