import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean isPerfectSquare = false;

        for (int i = 1; i <= num / 2; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }

        if (num == 0 || num == 1) {
            isPerfectSquare = true;
        }

        if (isPerfectSquare) {
            System.out.println("Perfect square");
        } else {
            System.out.println("Not a perfect square");
        }
    }
}

