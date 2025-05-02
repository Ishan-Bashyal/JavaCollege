import java.util.Scanner;

public class MethodHarshad {

    public static boolean isHarshad(int num) {
        int sum = 0, n = num;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return num % sum == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isHarshad(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is NOT a Harshad number.");
        }
    }
}
