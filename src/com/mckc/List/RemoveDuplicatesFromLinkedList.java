package com.mckc.List;

import java.util.Stack;

public class RemoveDuplicatesFromLinkedList {

    static class ListNode {

        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    public static void main(String args[]) {

        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(2);
        node.next.next.next=new ListNode(2);
        node.next.next.next.next = new ListNode(3);
       // node.next.next.next.next= new ListNode(3);

        ListNode print = deleteDuplicates(node);

        while(print!=null){
            System.out.println(print.val);
            print = print.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        Stack<ListNode> stack = new Stack<ListNode>();

        stack.push(head);
        ListNode node = head;

        while (node != null) {

            ListNode poppedNode = stack.peek();

            ListNode nextNode = node.next;

            if (poppedNode.val == node.val) {
                node.next = nextNode.next;

            } else {
                stack.push(node);
            }

            node = node.next;
        }


        return head;
    }


}
