import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many terms you want: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            b = b + a; 
            a = b - a;  
        }
    }
}
