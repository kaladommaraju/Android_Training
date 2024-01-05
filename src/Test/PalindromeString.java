package Test;

public class PalndromeString {
    public static void main(String[] args) {
        String givenStr = "CIVIC";
        // reverse a string
        String reverseStr = reverseTheString((givenStr));
        System.out.println(reverseStr);
        if (givenStr.equals(reverseStr)) {
            System.out.println("Given String is Palindrome");
        } else {
            System.out.println("Given String is NOT Palindrome");
        }
    }

    private static String reverseTheString(String str) {
            String[] splitStr = str.split("");

        String newStr = "";
        for (int i = splitStr.length - 1; i >= 0; i--) {
            newStr = newStr + splitStr[i];
        }
        return newStr;
    }
}

// MADAM
// unique chars in a given word
// HashMap - key: value
//
