import java.util.Scanner;

public class MethodRevNum {

    public static int reverseNumber(int n) {
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;        
            reversed = reversed * 10 + digit; 
            n = n / 10;                
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversed = reverseNumber(number);
        System.out.println("Reversed number: " + reversed);

    }
}
