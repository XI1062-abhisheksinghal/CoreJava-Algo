package main;

import java.util.concurrent.*;

public class ThreadPoolExecutor {

    public static <Completable> void main(String[] args) throws ExecutionException, InterruptedException {

        Executor executor = Executors.newFixedThreadPool(2);

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<String> fut =executorService.submit(()->"Inside Threadpool1");

        try {
            System.out.println(fut.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        for(int i=0;i<5;i++) {

                //Thread.sleep(1000);
                executor.execute(() -> System.out.println("Inside ThreadPool"));
                //System.out.println(Thread.currentThread().getName());


        }


        CompletableFuture<String> complete2=CompletableFuture.supplyAsync(()->{
            System.out.println(Thread.currentThread().getName());
            return "Singhal";
        });

        //CompletableFuture<Object> fullName= name.thenCompose(complete2);

        CompletableFuture<String> fullName=  name().thenCompose((name)->lastname(name));

        CompletableFuture<CompletableFuture<String>> fullname = name().thenApply((name)->lastname(name));

        System.out.println(fullName.get());
        //CompletableFuture<Object> completed= CompletableFuture.anyOf(complete1,complete2);

        //System.out.println(completed.get());
        //wait for complete1 than execute complete 2 and attach callback
        System.out.println(complete2.get());
        System.out.println("Inside main Thread");
    }


    public static CompletableFuture<String> name (){

        return  CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Abhishek";
        }) ;
    }

    public static CompletableFuture<String> lastname(String name1){

        return CompletableFuture.supplyAsync(()->{
                    try {
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(5000);
                        System.out.println("Inside run Async");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                return name1+"Singhal";
    });

}}

