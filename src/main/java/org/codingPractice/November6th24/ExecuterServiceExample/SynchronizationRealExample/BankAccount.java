package org.codingPractice.November6th24.ExecuterServiceExample.SynchronizationRealExample;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method for withdrawing money
    public synchronized void withdraw(double amount) {
        if (amount > balance) {
            System.out.println(Thread.currentThread().getName() + " - Insufficient funds");
        } else {
            System.out.println(Thread.currentThread().getName() + " - Withdrawing: " + amount);
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " - New balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}
