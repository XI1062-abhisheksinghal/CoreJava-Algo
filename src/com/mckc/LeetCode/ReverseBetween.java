package com.mckc.LeetCode;

import sun.awt.image.ImageWatched;

public class ReverseBetween {

    static class ListNode{

        ListNode next;
        int val;

       public ListNode(int data){
           this.val= data;
           next= null;
        }


    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(3);
        node1.next= new ListNode(5);
//        node1.next.next=new ListNode(3);
//        node1.next.next.next= new ListNode(4);
//        node1.next.next.next.next= new ListNode(5) ;
        String s = Integer.toBinaryString(2);
        ListNode res = reverseBetween(node1,1,2);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
        //output should be 1---->4---->3---->2---->1


    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {

        //reverse linked list from left to right
        //reverse linked list from left to right
        if(head==null){
            return null;
        }

        if(left==right){
            return head;
        }
        ListNode prev = null;
        int count = right-left;
        int start =0;
         ListNode beforeReverse= head;
       // ListNode afterReverse = null;
        ListNode next= null;
        while(head!=null){
            start++;
            if(start==left){
                while(count>0){
                    next = head.next;
                    head.next=prev;
                    prev=head;
                    head=next;
                    count--;
                }
                break;
            }else{
                beforeReverse=head;
                head= head.next;
            }

        }
        //afterReverse = next;
        //prev.next=afterReverse;
        beforeReverse.next=prev;
        ListNode last = beforeReverse;

        while(beforeReverse.next!=null){
            beforeReverse=beforeReverse.next;
        }
        beforeReverse.next=next;
        return last;

    }
}
