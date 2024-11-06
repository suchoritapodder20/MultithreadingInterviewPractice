package org.codingPractice.November6th24.ExecuterServiceExample.Multitask;

public class Task implements Runnable {

    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": " + taskName);
    }
}
