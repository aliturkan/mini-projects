import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /* To check if a given number is an Armstrong number, it must satisfy the following condition:
        1642 = 1^4 + 6^4 + 4^4 + 2^4
        345 = 3^3 + 4^3 + 5^3
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Specify how many digits the number has: ");
        int digits = scanner.nextInt();

        int temporary = number;
        int total = 0;

        do {
            int digit_value = temporary % 10;
            temporary /= 10;
            total += Math.pow(digit_value, digits);

        } while (temporary > 0);

        if (number == total) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}
