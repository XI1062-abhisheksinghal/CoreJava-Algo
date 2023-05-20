package main;

public class TestCatch {

    public static void main(String[] args) {

        try{
            int i=10/0;
        }catch(Exception e){
            System.out.println("inside catch block");
        }

        System.out.println("outside catch block");
    }
}
