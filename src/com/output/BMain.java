package com.output;

public class BMain implements A, B {

    public static void main(String args[]) {
        BMain bmain = new BMain();
        bmain.funcA();
        A.staticfuncA();
        B.staticfuncA();
    }
}
