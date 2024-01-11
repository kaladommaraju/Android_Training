package JavaTest;

import java.util.Arrays;
import java.util.Scanner;

public class SameElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];
        System.out.println("Enter elements for the first array: ");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for the second array: ");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();

        }
        boolean areEqual = areArraysEqual(array1, array2);

        if (areEqual) {
            System.out.println("Arrays are equal");

        } else {
            System.out.println(" Arrays are not equal");
        }

    }

    static boolean areArraysEqual(int[] array1, int[] array2) {

        if (array1.length != array2.length) {
          return false;
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
