package otherPractice;

import java.util.Scanner;

public class CalcExecution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcTest calcTest = new CalcTest();

        //String text = scanner.nextLine();
        System.out.println("Enter 'a' value: ");
        int a = scanner.nextInt();
        System.out.println("Enter 'b' value: ");
        int b = scanner.nextInt();

        calcTest.addition(a, b);
        calcTest.subtraction(a, b);
        calcTest.multiplication(a, b);
    }

}
