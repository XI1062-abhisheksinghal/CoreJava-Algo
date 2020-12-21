package com.output;

public interface B extends A{

    default void funcA(){
        System.out.println("Inside B");
    }

    static void staticfuncA(){
        System.out.println("Inside Static func B");
    }
}
