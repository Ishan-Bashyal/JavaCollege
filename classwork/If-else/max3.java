//1. Write a JAVA program to find the maximum between three numbers.

import java.util.Scanner;

public class max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int one = sc.nextInt();
        System.out.print("Enter the second number: ");
        int two = sc.nextInt();
        System.out.print("Enter the third number: ");
        int three = sc.nextInt();

        if (one >= two && one >= three) {
            System.out.println(one + " is the greatest");
        } else if (two >= one && two >= three) {
            System.out.println(two + " is the greatest");
        } else {
            System.out.println(three + " is the greatest");
        }
    }
}



