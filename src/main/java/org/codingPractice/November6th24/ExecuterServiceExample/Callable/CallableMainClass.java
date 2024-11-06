package org.codingPractice.November6th24.ExecuterServiceExample.Callable;

import java.util.concurrent.*;

public class CallableMainClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

       // The Future object is used to retrieve the result using get(),
        // which blocks until the task completes.

        Future<Integer> future = executor.submit(new CallableTask());
        Integer result = future.get();
        System.out.println("Result: " + result);
        executor.shutdown();


    }
}
