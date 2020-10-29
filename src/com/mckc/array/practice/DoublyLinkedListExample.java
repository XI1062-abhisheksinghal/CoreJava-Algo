package com.mckc.array.practice;

import java.util.ArrayList;
import java.util.List;

public class DoublyLinkedListExample {

    private static List<Node> ls;


    static class Node{

        int value ;
        Node next;
        Node prev;


        Node(int value){

            this.value=value;
            next= null;
            prev=null;
        }

    }

    //adding at the end of Doubly Linked List
    public static void addNode(Node n){


        int noOfElements = ls.size();

        if(noOfElements==0){
            ls.add(n);
        }
        else {
            Node lastNode = ls.get(noOfElements - 1);
            lastNode.next = n;
            n.prev = lastNode;
            ls.add(n);
        }
    }

    public static void printDoublyLinkedList(){
        for(Node printNode:ls){
            System.out.println(printNode.value);
        }
    }

    public static void main(String args[]){

        Node node1= new Node(1);
        ls = new ArrayList();

        Node node2 = new Node(2);
        addNode(node1);
        addNode(node2);

        printDoublyLinkedList();







    }
}
