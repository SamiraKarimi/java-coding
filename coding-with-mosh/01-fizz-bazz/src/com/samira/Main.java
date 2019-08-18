package com.samira;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: " );
        int number = scanner.nextInt();

        if(number % 3 == 0 && number % 5 == 0 )
            System.out.print("FizzBazz");
        else if ( number % 3 == 0 )
            System.out.println("Bazz");
        else if (number % 5 == 0 )
            System.out.println("Fizz");
        else
            System.out.println(number);



    }
}
