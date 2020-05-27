package com.mckc.Tree;

class LeetCode1 {
	
class Node{
        
        int data ;
        Node left;
        Node right;
        
        Node(int data){
            this.data=data;
            Node left= null;
            Node right = null;
        }
    }

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        //n is the number of employees 
        //headID is the id of the head of the company 
        //int[] manager , the ith position value in array is the manager id of the employee at i-th index employee
        //informTime the time it will take to inform the subordinates directly report to him .
       
    	Node head = new Node(headID);
        
        for(int i=0;i<manager.length;i++){
            
            
        }
        
        return 0;
        
        
    }
    
    
}