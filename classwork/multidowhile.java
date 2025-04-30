
import java.util.Scanner;

public class multidowhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = sc.nextInt();
        int i=1;
        do { 
            System.out.println(number+"*"+ i +"="+i*number);
            i++;
        } while (i<11);

    }
}
