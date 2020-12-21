package com.output;

public interface A {

    default void funcA(){
        System.out.println("inside A");
    }
    static void staticfuncA(){
        System.out.println("inside static function A");
    }
}
