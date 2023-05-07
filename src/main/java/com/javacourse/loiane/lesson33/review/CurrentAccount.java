package com.javacourse.loiane.lesson33.review;

public class CurrentAccount {

    private String number;
    private String branch;
    private boolean premium;
    private double overdraftLimit;
    private double overdraftValueUsed;
    private double balance;

    public CurrentAccount() {
    }

    public CurrentAccount(String number, String branch, boolean premium, double overdraftLimit, double overdraftValueUsed, double balance) {
        this.setNumber(number);
        this.setBranch(branch);
        this.setPremium(premium);
        this.setOverdraftLimit(overdraftLimit);
        this.setOverdraftValueUsed(overdraftValueUsed);
        this.setBalance(balance);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftValueUsed() {
        return overdraftValueUsed;
    }

    public void setOverdraftValueUsed(double overdraftValueUsed) {
        this.overdraftValueUsed = overdraftValueUsed;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean makeAWithdrawal(double amountToWithdraw) {

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

    public void deposit(double amountDeposited) {
        balance += amountDeposited;
    }

    public void checkBalance() {
        System.out.println("The current account balance is: " + balance);
    }

    public boolean checkUseOverdraft() {
        return balance < 0;
    }
}
