import java.util.Scanner;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class no1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        String result=(age>=18)? "You can vote" : "You cannot vote";
        System.out.println(result);
        //if (age>=18) {
        //    System.out.println("You can vote");
        //} else {
        //    System.out.println("You cannot vote");
        //}
        
    }
    
}
