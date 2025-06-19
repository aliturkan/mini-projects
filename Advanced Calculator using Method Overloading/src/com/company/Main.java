package com.company;

import java.util.Scanner;

public class Main {
    public static int add(int a, int b) {
        return (a + b);
    }

    public static int subtract(int a, int b) {
        return (a - b);
    }

    public static int multiply(int a, int b) {
        return (a * b);
    }

    public static int divide(int a, int b) {
        return (a / b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        String operations = ("1. Add\n" +
                "2. Subtract\n" +
                "3. Multiply\n" +
                "4. Divide\n");

        System.out.println(operations);

        System.out.println("Please select an operation:");
        String operationChoice = scanner.nextLine(); // Clear buffer
        operationChoice = scanner.nextLine(); // Read user input

        switch (operationChoice) {
            case "1":
                System.out.println(add(a, b));
                break;
            case "2":
                System.out.println(subtract(a, b));
                break;
            case "3":
                System.out.println(multiply(a, b));
                break;
            case "4":
                System.out.println(divide(a, b));
                break;
            default:
                System.out.println("An error occurred. Please try again.");
        }
    }
}
