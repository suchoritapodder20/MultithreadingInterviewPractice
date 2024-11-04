package org.codingPractice.ThreadPart3Priority;

public class MainThread {

    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        System.out.println("Current Thread:"+ thread.getName());
        thread.setName("I am a Thread : ");
        System.out.println("After Name change:"+ thread.getName());
        System.out.println("Main Thread Priority:"+ thread.getPriority());
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Main Thread New Priority:"+ thread.getPriority());

        for (int i=0;i<5;i++){
            System.out.println("Main Thread ");
        }
        //main thread creating child thread
        ChildThread ct = new ChildThread();
        System.out.println("Child Thread Priority:"+ ct.getPriority());
        ct.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Child Thread New Priority:"+ ct.getPriority());
        ct.start();


    }

}
class  ChildThread extends Thread{
    @Override
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Child Thread");
        }
    }


}