import java.util.Scanner;

public class MethodDateConverter{

    static void odd(int n){ 

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int year=n/365;
        int rem=n%365;
        int months=rem/30;
        int days=rem%30;
        System.out.println("The total year is: "+year+"\nThe total month is: "+months+"\nThe total days is: "+days);
 
        odd(n);
    }

}