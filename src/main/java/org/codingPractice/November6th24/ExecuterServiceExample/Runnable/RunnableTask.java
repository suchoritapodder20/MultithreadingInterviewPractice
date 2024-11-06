package org.codingPractice.November6th24.ExecuterServiceExample.Runnable;

public class RunnableTask implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName() +" Is executing task");
    }

}
