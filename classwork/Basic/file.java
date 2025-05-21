package Basic;

import java.util.Scanner;

public class file{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char variableName ='i';
        System.out.print("Enter the age: ");
        int age= sc.nextInt();
        System.out.print("Enter your name: ");
        String name=sc.next();
        System.out.print("Enter your gpa: ");
        double gpa=sc.nextDouble();
        System.out.print("Enter a word to get first character: ");
        char char1=sc.next().charAt(0);
        sc.close();
    }
}