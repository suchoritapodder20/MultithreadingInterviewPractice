package org.codingPractice.November6th24.ExecuterServiceExample.SynchronizationRealExample;

class WithdrawTask implements Runnable {
    private BankAccount account;
    private double amount;

    public WithdrawTask(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount);
    }
}

