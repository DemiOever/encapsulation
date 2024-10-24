package org.example;

public class BankAccountEncapsulation {
    private double balance;

    public BankAccountEncapsulation (double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Starting balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    private void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("You can't deposit a negative amount of money");
        }
        balance += amount;
    }

    private void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("You can't withdraw a positive amount of money");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Not enough balance to withdraw");
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
