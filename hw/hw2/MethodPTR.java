import java.util.Scanner;

public class MethodPTR {

    public static double calculateCompoundInterest(double principal, double rate, int time) {
        double amount = principal;
        for (int i = 0; i < time; i++) {
            amount = amount * (1 + rate / 100);
        }
        return amount - principal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time (in years): ");
        int time = scanner.nextInt();

        double interest = calculateCompoundInterest(principal, rate, time);

        System.out.println("Compound Interest: " + interest);

    }
}
