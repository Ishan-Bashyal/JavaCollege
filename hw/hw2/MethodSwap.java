import java.util.Scanner;

public class MethodSwap {

    public static void swapWithVar(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int swap = a;
        a = b;
        b = swap;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        swapWithVar(a, b);

    }
}

