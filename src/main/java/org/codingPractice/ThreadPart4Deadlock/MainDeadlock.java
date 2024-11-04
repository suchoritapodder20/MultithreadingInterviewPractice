package org.codingPractice.ThreadPart4Deadlock;

public class MainDeadlock {
    public static void main(String[] args) {
        try{
            System.out.println("Entering into Deadlock");
            Thread.currentThread().join();

            //for main method if we are using join method , it ll create deadlock
            //it ll hang here , ll not execute next line
            System.out.println("This will never print");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
