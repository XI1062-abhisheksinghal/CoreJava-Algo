package java8StreamsExample;

import java.sql.Time;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CompletableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                try{
                TimeUnit.SECONDS.sleep(2);
                    System.out.println("Inside future");
            }catch(Exception e){
                    System.out.println(e.getStackTrace());
                }
            }
        });

        CompletableFuture<Void> future1 = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                try{
                TimeUnit.SECONDS.sleep(3);
                    System.out.println("Inside future1");
            }catch(Exception e1){
                    System.out.println(e1.getStackTrace());
                }
            }
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                return "Hello to SupplyAsync";
            }
        });

        future.get();
        future1.get();

    }
}
