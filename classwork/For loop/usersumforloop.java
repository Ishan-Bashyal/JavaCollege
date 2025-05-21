import java.util.Scanner;

public class usersumforloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number= sc.nextInt();
        int sum=0;
        for (int i = 1; i < number; i++) {
            sum=sum+i;
            System.out.println(sum);
        }
    }
}
