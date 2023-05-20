package com.output;


class Override{
    public void func1() throws RuntimeException{
        System.out.println("Throws Null pointer Exception");
    }
}

public class OverrideEg extends Override{

    public void func1() throws NullPointerException{
        System.out.println("Throws RunTimeException");
    }

    public static void main(String[] args) {

        char res;

        OverrideEg overrideEg = new OverrideEg();
        Override over = new Override();

        over.func1();

        overrideEg.func1();


    }
}
