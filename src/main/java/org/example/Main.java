package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        // Change balance
        account.balance = 5000;

        // Nu kan de rekening in een onjuiste staat verkeren
        System.out.println("Current balance: " + account.balance);
    }
}
