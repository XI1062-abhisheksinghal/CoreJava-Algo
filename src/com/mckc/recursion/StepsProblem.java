package com.mckc.recursion;

public class StepsProblem {

    public static void main(String[] args) {

        int totalNoSteps=4;

        System.out.println(waysForSteps(totalNoSteps));

        String s = "Abhishek";
        char c = 'A';
        char a = s.charAt(0);
        if(a==c){
            System.out.println("valid");
        }
        System.out.println(s.indexOf("h"));

    }

    public static int waysForSteps(int n){
        if ( n == 0)
            return 1;
        else if (n < 0)
            return 0;
        return waysForSteps(n-1)+ waysForSteps(n-2);
    }
}
