package java8StreamsExample;

import java.util.ArrayList;
import java.util.List;

public class Java8Revise {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.remove("4");

        //peek operation without terminal operation does nothing
        list.stream().peek((x)-> System.out.println("hello"));

        //flatMap-> used to combine multiple streams into a single one

        int i=0;
        int sum =0;
        while(i<100){
            sum = sum+i;
            sum = i+sum;
            i+=1;


        }
        System.out.println(sum);
      int ans = fun(100,2000);
        System.out.println(ans);
        System.out.println(fib(6));
        for(int j=1;j<6;j++){
            System.out.println(rec(j)+"");
        }

    }

    public static int fun(int a, int b){
        if(b==0){
            return a;
        }else{
            return  fun(b,a%b);
        }
    }

    public static int fib(int n){
        if(n<=1){
            return n;


        }
        return fib(n-1)+fib(n-2);
    }

    public static int rec(int n){
        if(n==0 || n==1 ||n==2){
            return 0;
        }if(n==3){
            return 1;
        }

        else{
            return rec(n-1)+rec(n-2)+rec(n-3);
        }
    }
}