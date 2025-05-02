import java.util.Scanner;

public class MethodNSumNum {

    public static int sumNatural(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int result = sumNatural(n);
        System.out.println("Sum of first " + n + " natural numbers: " + result);

    }
}

