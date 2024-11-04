package org.codingPractice.ThreadPart1;

public class MultiThreadClass extends Thread {
   // public void doTask() {

    @Override
    public void run() { //running phase
    for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i) ;
            try {
                Thread.sleep(500); //blocked phase
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    } //terminated phase
}
