package org.codingPractice.ThreadPart1;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("My Buddy");
        System.out.println("My Buddy");
        System.out.println("My Buddy");
        System.out.println("My Buddy");

        //long task
        MultiThreadClass multiThreadClass = new MultiThreadClass(); //new thread creating phase
        multiThreadClass.setName("T0");
        multiThreadClass.start(); //runnable phase - using scheduler it ll go to running phase
        //multiThreadClass.doTask();

        System.out.println("My Buddy");
        System.out.println("My Buddy");
        System.out.println("My Buddy");
        System.out.println("My Buddy");
    }
}
