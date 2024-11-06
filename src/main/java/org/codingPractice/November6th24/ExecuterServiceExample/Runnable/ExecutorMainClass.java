package org.codingPractice.November6th24.ExecuterServiceExample.Runnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorMainClass {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2); //created thread pool with 4 thread

        for (int i = 0; i < 4; i++) { //task for
            executorService.submit(new RunnableTask() );
        }
        executorService.shutdown();
    }
}
