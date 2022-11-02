package section15_Threads.threads_challenge;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private String accountNumber;
    private Lock reentrantLock;

    public BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.reentrantLock = new ReentrantLock();
    }

    public void deposit(double amount) {
        boolean status = false;
        try {
            if (reentrantLock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try {
                    balance += amount;
                    status = true;
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                System.out.println("Could not get the lock for 1 second.");
            }
        } catch (InterruptedException e) {
           //do something here
        }
        System.out.println("Transaction status = " + status);
    }

    public void withdraw(double amount) {
        boolean status = false;
        try {
            if (reentrantLock.tryLock(1000, TimeUnit.MILLISECONDS)){
                try {
                    balance -= amount;
                    status = true;
                } finally {
                    reentrantLock.unlock();
                }
            } else {
                System.out.println("Could not get the lock for 1 second.");
            }
        } catch (InterruptedException e) {
           //do something here
        }
        System.out.println("Transaction status = " + status);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account number = " + accountNumber);
    }
}
