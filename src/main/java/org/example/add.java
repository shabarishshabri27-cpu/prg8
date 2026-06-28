package org.example;
import java.util.Scanner;
public class add {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("\nChoose an Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.print("Enter your choice (1-5): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition = " + (num1 + num2));
                break;

            case 2:
                System.out.println("Subtraction = " + (num1 - num2));
                break;

            case 3:
                System.out.println("Multiplication = " + (num1 * num2));
                break;

            case 4:
                if (num2 != 0)
                    System.out.println("Division = " + (num1 / num2));
                else
                    System.out.println("Division by zero is not possible.");
                break;

            case 5:
                if (num2 != 0)
                    System.out.println("Modulus = " + (num1 % num2));
                else
                    System.out.println("Modulus by zero is not possible.");
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}