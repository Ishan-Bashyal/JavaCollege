import java.util.Scanner;

public class MethodOdd{

    static void odd(int n){ 
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (i%2==0) {
                continue;
            }else{
                System.out.println(i);
            }
        }
 
        odd(n);
    }

}