package com.javacourse.loiane.lesson27.review;

public class CurrentAccount {

    String number;
    String branch;
    boolean premium;
    double overdraftLimit;
    double overdraftValueUsed;
    double balance;

    boolean makeAWithdrawal(double amountToWithdraw) {

        if (balance >= amountToWithdraw) {
            balance -= amountToWithdraw;
            return true;
        } else {
            if (premium) {
                double limit = overdraftLimit + balance;
                if (limit >= amountToWithdraw) {
                    balance -= amountToWithdraw;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    void deposit(double amountDeposited) {
        balance += amountDeposited;
    }

    void checkBalance() {
        System.out.println("The current account balance is: " + balance);
    }

    boolean checkUseOverdraft() {
        return balance < 0;
    }
}
