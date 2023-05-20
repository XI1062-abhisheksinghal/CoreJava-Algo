package com.mckc.LeetCode;

import sun.tools.jconsole.CreateMBeanDialog;

public class DeleteFromLastLinkedList {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        node1.next= new ListNode(2);
        node1.next.next= new ListNode(3);
        node1.next.next.next= new ListNode(4);
        node1.next.next.next.next= new ListNode(5);

        removeNthFromEnd(node1,2);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        //One way to find the length of linkedList and delete node len-n

        int length = 0;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode first = head;
        while (first!= null) {
            length++;
            first = first.next;
        }

        first= dummy;
        length= length-n;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;

    }

    }



