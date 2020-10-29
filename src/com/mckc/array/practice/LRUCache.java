//package com.mckc.array.practice;
//
//import java.util.HashMap;
//import java.util.Map;
//
////LRU Cache using the Doubly Linked List
//
//
// class Node{
//    public int count =0;
//    public static Map<Integer,Node> map;
//    public final int capacity;
//    int key ;
//    int value;
//    Node head;
//    Node tail;
//    Node pre;
//    Node next;
//
//    Node(int capicity ){
//        this.capacity = capacity;
//        map = new HashMap(capacity);
//        this.value=value;
//        head = new Node(0,0);
//        tail = new Node(0,0);
//        head.pre=null;
//        tail.next=null;
//        head.next = tail;
//        tail.pre=head;
//
//    }
//
//public class LRUCache {
//
//
//
//
//    }
//
//
//
//    //Delete Node
//
//    public void deleteNode(Node n){
//
//    }
//
//    //Add to head node
//    public void addToHead(Node n){
//
//    }
//
//    //get Node
//    public Node get(Node n){
//
//    }
//
//    //Set Node
//    public void setNode(int key , int value){
//
//        if(map.get(key)!=null){
//
//        }else{
//           Node n = new Node(key,value);
//            map.put(key, n);
//            if (count < capicity) {
//                count++;
//                addToHead(node);
//            }
//            else {
//                map.remove(tail.pre.key);
//                deleteNode(tail.pre);
//                addToHead(node);
//            }
//        }
//    }
//
//
//
//
//    public static void main(String args[]){
//
//
//    }
//}
