package com.mck.Java8Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import static java.lang.Thread.sleep;

public class CompletableEg {

    private static List<String> result = new ArrayList();
    public static void main(String[] args) throws Exception {
        CompletableFuture<Boolean> allOfString;


        for(int i=0;i<5;i++) {
             allOfString = updateApi("Abhi");
            CompletableFuture.allOf(allOfString).join();

            allOfString.thenApply((bol)->
            {
                if(bol){
                    result.add("Success");
                }else{
                    result.add("Failure");
                }
                return result;
            });
        }

        System.out.println("Statuses"+result.size());
        result.stream().forEach(status-> System.out.println(status));
    }


    public static CompletableFuture<Boolean> updateApi(String name) throws Exception{
        return CompletableFuture.supplyAsync(()-> {
                Boolean val ;
                System.out.println("Thread ===="+Thread.currentThread().getName());
            //actual APi call
            try {
                sleep(5000);
                val=Boolean.TRUE;
                throw new InterruptedException();
            } catch (InterruptedException e) {
                val=Boolean.FALSE;
                e.printStackTrace();
            }

            return val;
        });
    }


}
