package com.mckc.LeetCode;

public class MergeTwoGivenArraysIntoOne {

    public static void main(String[] args) {

        Float f = new Float("3.0");
        int x = f.intValue();
        byte b = f.byteValue();
        double d= f.doubleValue();

        System.out.println(x+b+d);

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        if(b1 & b2 | b2 & b3 |b2|b1){
            System.out.println("dokey");
        }
        if(b1 & b2 |b2 & b3|b2){
            System.out.println("OK");
        }

    }




public synchronized void merge(){
  synchronized (this){

  }

}


}
