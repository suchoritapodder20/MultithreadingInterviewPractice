package org.codingPractice.ThreadPart2Runnable;

public class MainClass {
    public static void main(String[] args) {

        //long task
        MultiThreadUsingRunnable runnable = new MultiThreadUsingRunnable(); //new thread creating phase

        Thread thread1 = new Thread(runnable);
        System.out.println(thread1.getName());
        thread1.setName("Thread 1");
        thread1.start();

        Runnable runnable1 = new MultiThreadUsingRunnable();
        Thread thread2 = new Thread(runnable1);
        thread2.setName("Thread 2");
        thread2.start();

        //starting the thread twice
        //thread2.start(); --> not possible -> thread can start only once in lifetime--> ll give IllegalThreadStateException

        //directly calling the run method without calling start method
        //thread2.run(); --> ll not create new call stack ->ll use the prev call stack --> here it ll be using main callstack

    }
}
