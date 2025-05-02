import java.util.Scanner;

public class MethodFibonacciN {

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;

        System.out.println("Fibonacci series up to " + n + " terms:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int nextTerm = a + b;
            a = b;
            b = nextTerm;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        generateFibonacci(n);

    }
}
