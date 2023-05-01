package com.javacourse.loiane.lesson27.review;

public class CurrentAccountTest {

    public static void main(String[] args) {

        CurrentAccount account = new CurrentAccount();

        account.number = "123456";
        account.branch = "1234";
        account.premium = true;
        account.overdraftLimit = 500;
        account.overdraftValueUsed = 0;
        account.balance = -10;

        System.out.println("Balance of " + account.number + " account = " + account.balance);

        boolean withdrawalExecuted = account.makeAWithdrawal(10);

        if (withdrawalExecuted) {
            System.out.println("Successful withdrawal made!");
            account.checkBalance();
        } else {
            System.out.println("It was not possible to complete the transaction. Insufficient funds.");
        }

        System.out.println("The amount deposited was 500.");
        account.deposit(500);
        account.checkBalance();

        if (account.checkUseOverdraft()) {
            System.out.println("You are using overdraft.");
        } else {
            System.out.println("You are not using overdraft.");
        }

        account.makeAWithdrawal(600);
        account.checkBalance();
        if (account.checkUseOverdraft()) {
            System.out.println("You are using overdraft.");
        } else {
            System.out.println("You are not using overdraft.");
        }

    }

}
