package com.mck.Java8Practice;

import java.util.concurrent.atomic.AtomicBoolean;

public class ObjectEx {

    public static void main(String[] args) {

        Object obj = new Employee(1,"Abhishek",30,"male","cse",2008,100);

        AtomicBoolean valueToUpdate = new AtomicBoolean(false);
        if(valueToUpdate.get()==false){
            System.out.println("Inside If condition");
        }
        System.out.println(obj);


    }
}
