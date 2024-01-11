package JavaTest;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the pyramid: ");
        int numRows= scanner.nextInt();

        for (int i=1; i<=numRows; i++) {
            for (int j =1; j<=numRows-i; j++) {
                System.out.println(" ");
            }
            for (int k = 1; k < 2 * i -1; k++ ){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
