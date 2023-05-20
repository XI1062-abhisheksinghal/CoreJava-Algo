package main;



public class LinedkListReversal {

    static class  Node{
        int data;
        Node next ;

        Node(int data){
            this.data= data;
            next=null;
        }

    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(4);
        head.next.next.next.next= new Node(5);
        head.next.next.next.next.next= new Node(6);

        Node reversal = reverse(head);

        while(reversal!=null){
            System.out.println(reversal.data);
            reversal= reversal.next;
        }

    }

    public static Node reverse(Node n){

        Node prev=null;
        Node next = null;
        while(n!=null ){

            next = n.next;
            n.next=prev;
            prev=n;
            n=next;
        }

        return prev;


    }
}
