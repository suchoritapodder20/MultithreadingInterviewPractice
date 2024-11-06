package org.codingPractice.November6th24.ExecuterServiceExample.Multitask;

import java.util.concurrent.*;


public class ExecutorServiceRealExample {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create multiple tasks (representing different client requests)
        executor.submit(new Task("Request 1"));
        executor.submit(new Task("Request 2"));
        executor.submit(new Task("Request 3"));
        executor.submit(new Task("Request 4"));

        // Shutdown the executor
        executor.shutdown();
    }
}
