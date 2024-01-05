package Test;

import java.util.Scanner;

public class CharacCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Assuming letters (case insensitive)
        int[] charCounts = new int[26 * 2];

        // Count occurrences of each character
        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = Character.toLowerCase(ch) - 'a';
                charCounts[index]++;
            }
        }

        // Display characters and their counts in ascending order
        for (int i = 0; i < charCounts.length; i++) {
            char currentChar = (char) ('a' + i % 26);
            int count = charCounts[i];

            if (count > 0) {
                System.out.println(currentChar + " = " + count);
            }
        }

        scanner.close();
    }
}
