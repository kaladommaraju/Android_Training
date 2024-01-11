package JavaTest;
import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Numbers: ");
        int a= scanner.nextInt();
        System.out.println("Fibonacci Sequence: ");
        for (int i = 0; i <= a; i++) {
            System.out.println(fibonacci(i) + " ");
        }

    }

    public static int fibonacci(int a) {
        if (a <= 1) {
            return a;
        } else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }
}
