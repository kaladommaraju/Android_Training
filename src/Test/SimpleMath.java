package Test;

import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the operation :");
        System.out.println("1. Addition a+b: ");
        System.out.println("2. Subtraction a-b: ");
        System.out.println("3. Multiplication a*b: ");
        System.out.println("4. Division a/b: ");
        System.out.println("------------------------");
        System.out.println("Enter the operation Number: ");
        int operation = scanner.nextInt();

        if (operation >= 5) {
            System.out.println("Invalid");
        } else {
            System.out.println("Enter the 'a' Number: ");
            int a = scanner.nextInt();
            System.out.println("Enter the 'b' Number: ");
            int b = scanner.nextInt();
            int result;
            if (operation == 1) {
                result = a + b;
                System.out.println("Result a+b: " + result);
            } else if (operation == 2) {
                result = a - b;
                System.out.println("Result a-b: " + result);
            } else if (operation == 3) {
                result = a * b;
                System.out.println("Result a*b: " + result);
            } else if (operation == 4) {
                if (b != 0) {
                    result = a / b;
                    System.out.println("Result a/b: " + result);
                } else {
                    System.out.println(" invalid input");
                }
            }
        }
    }
}



