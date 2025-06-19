package com.company;

import java.util.Scanner;

public class Main {
    public static int findGCD(int num1, int num2) {
        int gcd = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {

            if ((num1 % i == 0) && (num2 % i == 0)) {

                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("The GCD of the two numbers is: " + findGCD(firstNumber, secondNumber));

    }
}
