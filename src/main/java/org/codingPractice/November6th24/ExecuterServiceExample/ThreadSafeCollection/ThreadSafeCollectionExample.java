package org.codingPractice.November6th24.ExecuterServiceExample.ThreadSafeCollection;

import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeCollectionExample {

        public static void main(String[] args) throws InterruptedException {
            CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
            Runnable task = () -> {
                for (int i = 0; i < 5; i++) {
                    list.add(i);
                    System.out.println(Thread.currentThread().getName() + " added: " + i);
                }
            };

            Thread t1 = new Thread(task);
            Thread t2 = new Thread(task);

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.println("Final list: " + list);
        }


}
