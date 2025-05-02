import java.util.Scanner;

public class MethodSwapWoVar {

    public static void swapWithoutVar(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;  
        b = a - b;  
        a = a - b;  
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        swapWithoutVar(a, b);

    }
}
