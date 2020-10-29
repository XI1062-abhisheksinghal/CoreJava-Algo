package com.mckc.array.practice;

//basic implemnetation of stack using array
public class StackExample {

    int[] arr ;
    int stackSize;
    int top=-1;

    StackExample(int stackSize){
        this.stackSize= stackSize;
        arr = new int[stackSize];

    }


    void push(int x){

        //if((arr.length)-top)=1)
        int len = arr.length;
        int diff = len-top;
        if(diff!=1)
        if(top<arr.length ){
            ++top;
            arr[top] = x;
            System.out.println("Element added");
        }else{
            System.out.println("Stack is full");
        }
    }

    public int pop(){
        //pops out the top element from stack , kind of peek
        if(top>=0){
            return arr[stackSize];
        }
        return 0;
    }

    public int top(){

        //return the top element of stack
        return arr[stackSize];
    }


    public static void main(String args[]){
        StackExample eg = new StackExample(2);
        eg.push(1);
        eg.push(2);
        eg.push(3);

    }
}
