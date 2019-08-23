package com.samira;

public class Account {
    private String number;
    private double balance;
    private String customerName;

    public Account(){
        System.out.println("Empty constructor called");
    }

    public  Account(String number,double balance,String customerName){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
    }

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

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }
}





