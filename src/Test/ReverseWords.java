public class ReverseWords {

    public static void main(String[] args) {


        String input = "how are you";

        String reverse = reverseTheWords(input);

       System.out.println("Original: " + input);
       System.out.println("Reversed: " + reverse);
    }

    private static String reverseTheWords(String sentence) {

       String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
           reversed.append(words[i]).append(" ");
       }
        System.out.println("number of words: " +words.length);
        System.out.println("number of characters : " +reversed.length());
       return reversed.toString();
    }
}