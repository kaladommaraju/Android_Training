package JavaTest;

import java.util.Scanner;

public class VowelCount {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String inputString = scanner.nextLine();
        int vowelCount = countVowels(inputString);
        System.out.println("Number of vowels in the string: " + vowelCount);

    }

    public static int countVowels(String input) {

        int count = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ;
                count++;

            }
        }
        return count;
    }
}

