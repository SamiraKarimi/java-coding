package com.samira;

public class Main {

    public static void main(String[] args) {
      Account samirasAccount = new Account();

      System.out.println(samirasAccount.getNumber());
      System.out.println(samirasAccount.getBalance());

      samirasAccount.withdrawal(100.00);
      samirasAccount.deposit(50.00);
      samirasAccount.withdrawal(100.00);

      samirasAccount.deposit(55.0);
      samirasAccount.withdrawal(100.00);

    }
}
