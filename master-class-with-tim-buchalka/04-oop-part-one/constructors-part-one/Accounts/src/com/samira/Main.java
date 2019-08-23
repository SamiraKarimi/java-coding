package com.samira;

import java.util.AbstractCollection;

public class Main {

    public static void main(String[] args) {
      Account samirasAcount = new Account();
      samirasAcount.setNumber("12345");
      samirasAcount.setBalance(0.00);
      samirasAcount.setCustomerName("Samira Karimi");

      samirasAcount.withdrawal(100.00);

      samirasAcount.deposit(50.00);
      samirasAcount.withdrawal(100.00);

      samirasAcount.deposit(55.0);
      samirasAcount.withdrawal(100.00);

    }
}
