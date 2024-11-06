package org.codingPractice.November6th24.ExecuterServiceExample.ThreadCommunication;

class ProducerConsumer {
    private static final Object lock = new Object();
    private static int product = 0;




    static class Producer implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                try {
                    while (product >= 5) {
                        lock.wait();
                    }
                    product++;
                    System.out.println("Produced: " + product);
                    lock.notify();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    static class Consumer implements Runnable {
        @Override
        public void run() {
            synchronized (lock) {
                try {
                    while (product == 0) {
                        lock.wait();
                    }
                    System.out.println("Consumed: " + product);
                    product--;
                    lock.notify();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread producer = new Thread(new Producer());
        Thread consumer = new Thread(new Consumer());

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}
