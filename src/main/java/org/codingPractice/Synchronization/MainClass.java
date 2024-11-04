package org.codingPractice.Synchronization;

public class MainClass {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500); // Initial balance of $500

        // Create multiple threads attempting to withdraw money
        Thread t1 = new Thread(new WithdrawTask(account, 200), "Thread-1");
        Thread t2 = new Thread(new WithdrawTask(account, 300), "Thread-2");
        Thread t3 = new Thread(new WithdrawTask(account, 150), "Thread-3");
        Thread t4 = new Thread(new WithdrawTask(account, 100), "Thread-4");


        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Wait for all threads to finish
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        // Final balance
        System.out.println("Final Account Balance: " + account.getBalance());
    }
}

