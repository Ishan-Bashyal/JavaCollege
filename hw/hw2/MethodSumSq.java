import java.util.Scanner;

public class MethodSumSq {

    public static int sumOfSquares(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int result = sumOfSquares(number);
        System.out.println("Sum of squares of digits of " + number + " is: " + result);

    }
}
