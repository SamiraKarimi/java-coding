package com.samira;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean isFirst = true;

        while(true){
            System.out.println("Enter number:");
            boolean isAnInt= scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                if (isFirst) {
                     isFirst = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }

            }
            else
                break;
            scanner.nextLine();  // handle input

        }
        System.out.println("min= " + min +",max= " +max);

        scanner.close();

    }
}
