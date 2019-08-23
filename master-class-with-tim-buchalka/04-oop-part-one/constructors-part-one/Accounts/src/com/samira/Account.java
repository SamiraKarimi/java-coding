package com.samira;

public class Account {
    private String number;
    private double balance;
    private String customerName;

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount
                + " made. New balance is " + this.balance);
    }
    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount <= 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount +
                    " processed, Remaining balance = " + this.balance);
        }
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}




