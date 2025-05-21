//2. Write a JAVA program to check whether a number is negative, positive, or zero.

import java.util.Scanner;

public class zeronegpos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if(number==0){
            System.out.println("The number is zero");
        }else if(number>=1){
            System.out.println("The number is positive");
        }else{
            System.out.println("The number is negative");
        }
    }
}
