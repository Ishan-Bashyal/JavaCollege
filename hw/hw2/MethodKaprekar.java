import java.util.Scanner;

public class MethodKaprekar {

    public static boolean isKaprekar(int n) {
        if (n == 1) return true;

        int square = n * n;
        int digits = 0;
        int temp = square;

        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int divisor = 1;
        for (int i = 1; i < digits; i++) {
            divisor *= 10;
        }

        int left = square / divisor;
        int right = square % divisor;

        return left + right == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isKaprekar(number)) {
            System.out.println(number + " is a Kaprekar number.");
        } else {
            System.out.println(number + " is NOT a Kaprekar number.");
        }

    }
}
