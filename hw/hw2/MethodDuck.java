import java.util.Scanner;

public class MethodDuck {

    public static boolean isDuckNumber(int n) {
        boolean hasZero = false;

        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) {
                hasZero = true;
            }
            n = n / 10;
        }

        return hasZero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Enter a positive number that doesn't start with zero.");
        } else {
            if (isDuckNumber(number)) {
                System.out.println(number + " is a Duck number.");
            } else {
                System.out.println(number + " is NOT a Duck number.");
            }
        }

    }
}

