import java.util.Scanner;

public class methodmultitable {
    static void multi(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("The multiplication is: "+n+"*"+i+"="+i*n);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        multi(n);
    }
}

